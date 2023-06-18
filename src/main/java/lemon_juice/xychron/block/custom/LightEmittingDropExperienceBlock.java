package lemon_juice.xychron.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class LightEmittingDropExperienceBlock extends DropExperienceBlock {
    public LightEmittingDropExperienceBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 4;
    }
}
