package lemon_juice.xychron.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class LightEmittingStairBlock extends StairBlock {

    public LightEmittingStairBlock(BlockState state, Properties properties) {
        super(state, properties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 10;
    }
}
