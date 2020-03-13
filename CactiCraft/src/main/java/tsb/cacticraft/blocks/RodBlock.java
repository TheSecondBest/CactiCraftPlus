package tsb.cacticraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class RodBlock extends Block
{

	   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	   protected static final VoxelShape SHAPE = Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
			   
	   public RodBlock(Block.Properties builder) {
	      super(builder);
	      this.setDefaultState(this.stateContainer.getBaseState().with(WATERLOGGED, Boolean.valueOf(false)));
	   }

		public boolean isOpaqueCube(BlockState state) {
			return false;
		}
		
		public boolean isFullCube(BlockState state) {
			return false;
		}

		   public boolean func_220074_n(BlockState state) {
			      return true;
			   }
	   
		   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
			      return SHAPE;
			   }

	   public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
		      return false;
		   }
	   
	   @SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		         if (stateIn.get(WATERLOGGED)) {
		            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		         }

		         return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
		      
		   }

		   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		      builder.add(WATERLOGGED);
		   }

		   @SuppressWarnings("deprecation")
		public IFluidState getFluidState(BlockState state) {
		      return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
		   }

}

