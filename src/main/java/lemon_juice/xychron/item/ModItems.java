package lemon_juice.xychron.item;

import lemon_juice.xychron.Xychron;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Xychron.MOD_ID);

    public static final RegistryObject<Item> BLACK_XYCHRONITE = ITEMS.register("black_xychronite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_XYCHRONITE = ITEMS.register("blue_xychronite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_XYCHRONITE = ITEMS.register("green_xychronite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_XYCHRONITE = ITEMS.register("red_xychronite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_XYCHRONITE = ITEMS.register("white_xychronite", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
