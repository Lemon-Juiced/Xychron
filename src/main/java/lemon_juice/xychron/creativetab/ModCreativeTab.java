package lemon_juice.xychron.creativetab;

import lemon_juice.xychron.Xychron;
import lemon_juice.xychron.block.ModBlocks;
import lemon_juice.xychron.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Xychron.MOD_ID);

    public static final RegistryObject<CreativeModeTab> XYCHRON_TAB = CREATIVE_MODE_TABS.register("xychron", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.xychron"))
            .icon(() -> new ItemStack(ModItems.BLACK_XYCHRONITE_CRYSTAL.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == XYCHRON_TAB.get()){
            event.accept(ModItems.BLACK_XYCHRONITE_CRYSTAL.get());
            event.accept(ModItems.BLUE_XYCHRONITE_CRYSTAL.get());
            event.accept(ModItems.GREEN_XYCHRONITE_CRYSTAL.get());
            event.accept(ModItems.RED_XYCHRONITE_CRYSTAL.get());
            event.accept(ModItems.WHITE_XYCHRONITE_CRYSTAL.get());

            event.accept(ModItems.BLACK_XYCHRONITE_INGOT.get());
            event.accept(ModItems.BLUE_XYCHRONITE_INGOT.get());
            event.accept(ModItems.GREEN_XYCHRONITE_INGOT.get());
            event.accept(ModItems.RED_XYCHRONITE_INGOT.get());
            event.accept(ModItems.WHITE_XYCHRONITE_INGOT.get());

            event.accept(ModBlocks.BLACK_XYCHRONITE_BRICKS.get());
            event.accept(ModBlocks.BLUE_XYCHRONITE_BRICKS.get());
            event.accept(ModBlocks.GREEN_XYCHRONITE_BRICKS.get());
            event.accept(ModBlocks.RED_XYCHRONITE_BRICKS.get());
            event.accept(ModBlocks.WHITE_XYCHRONITE_BRICKS.get());

            event.accept(ModBlocks.BLACK_XYCHRONITE_BRICK_SLAB.get());
            event.accept(ModBlocks.BLUE_XYCHRONITE_BRICK_SLAB.get());
            event.accept(ModBlocks.GREEN_XYCHRONITE_BRICK_SLAB.get());
            event.accept(ModBlocks.RED_XYCHRONITE_BRICK_SLAB.get());
            event.accept(ModBlocks.WHITE_XYCHRONITE_BRICK_SLAB.get());

            event.accept(ModBlocks.BLACK_XYCHRONITE_BRICK_STAIRS.get());
            event.accept(ModBlocks.BLUE_XYCHRONITE_BRICK_STAIRS.get());
            event.accept(ModBlocks.GREEN_XYCHRONITE_BRICK_STAIRS.get());
            event.accept(ModBlocks.RED_XYCHRONITE_BRICK_STAIRS.get());
            event.accept(ModBlocks.WHITE_XYCHRONITE_BRICK_STAIRS.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
