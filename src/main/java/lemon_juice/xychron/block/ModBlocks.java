package lemon_juice.xychron.block;

import lemon_juice.xychron.Xychron;
import lemon_juice.xychron.block.custom.LightEmittingBlock;
import lemon_juice.xychron.block.custom.LightEmittingSlabBlock;
import lemon_juice.xychron.block.custom.LightEmittingStairBlock;
import lemon_juice.xychron.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Xychron.MOD_ID);

    public static final RegistryObject<Block> BLACK_XYCHRONITE_BRICKS = registerBlock("black_xychronite_bricks", () -> new LightEmittingBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_XYCHRONITE_BRICKS = registerBlock("blue_xychronite_bricks", () -> new LightEmittingBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_XYCHRONITE_BRICKS = registerBlock("green_xychronite_bricks", () -> new LightEmittingBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_XYCHRONITE_BRICKS = registerBlock("red_xychronite_bricks", () -> new LightEmittingBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_XYCHRONITE_BRICKS = registerBlock("white_xychronite_bricks", () -> new LightEmittingBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACK_XYCHRONITE_BRICK_SLAB = registerBlock("black_xychronite_brick_slab", () -> new LightEmittingSlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_XYCHRONITE_BRICK_SLAB = registerBlock("blue_xychronite_brick_slab", () -> new LightEmittingSlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_XYCHRONITE_BRICK_SLAB = registerBlock("green_xychronite_brick_slab", () -> new LightEmittingSlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_XYCHRONITE_BRICK_SLAB = registerBlock("red_xychronite_brick_slab", () -> new LightEmittingSlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_XYCHRONITE_BRICK_SLAB = registerBlock("white_xychronite_brick_slab", () -> new LightEmittingSlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACK_XYCHRONITE_BRICK_STAIRS = registerBlock("black_xychronite_brick_stairs", () -> new LightEmittingStairBlock(ModBlocks.BLACK_XYCHRONITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_XYCHRONITE_BRICK_STAIRS = registerBlock("blue_xychronite_brick_stairs", () -> new LightEmittingStairBlock(ModBlocks.BLUE_XYCHRONITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_XYCHRONITE_BRICK_STAIRS = registerBlock("green_xychronite_brick_stairs", () -> new LightEmittingStairBlock(ModBlocks.GREEN_XYCHRONITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_XYCHRONITE_BRICK_STAIRS = registerBlock("red_xychronite_brick_stairs", () -> new LightEmittingStairBlock(ModBlocks.RED_XYCHRONITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_XYCHRONITE_BRICK_STAIRS = registerBlock("white_xychronite_brick_stairs", () -> new LightEmittingStairBlock(ModBlocks.WHITE_XYCHRONITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    /******************************** Registry ********************************/
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
