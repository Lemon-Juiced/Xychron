package lemon_juice.xychron.item;

import lemon_juice.xychron.Xychron;
import lemon_juice.xychron.item.custom.RGBSliderItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Xychron.MOD_ID);

    public static final RegistryObject<Item> RGB_SLIDER = ITEMS.register("rgb_slider", () -> new RGBSliderItem(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_XYCHRONITE_CRYSTAL = ITEMS.register("black_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_XYCHRONITE_CRYSTAL = ITEMS.register("blue_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_XYCHRONITE_CRYSTAL = ITEMS.register("green_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_XYCHRONITE_CRYSTAL = ITEMS.register("red_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_XYCHRONITE_CRYSTAL = ITEMS.register("white_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_XYCHRONITE_CRYSTAL = ITEMS.register("orange_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_XYCHRONITE_CRYSTAL = ITEMS.register("purple_xychronite_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_XYCHRONITE_CRYSTAL = ITEMS.register("yellow_xychronite_crystal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_XYCHRONITE_INGOT = ITEMS.register("black_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_XYCHRONITE_INGOT  = ITEMS.register("blue_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_XYCHRONITE_INGOT = ITEMS.register("green_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_XYCHRONITE_INGOT = ITEMS.register("red_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_XYCHRONITE_INGOT  = ITEMS.register("white_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_XYCHRONITE_INGOT = ITEMS.register("orange_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_XYCHRONITE_INGOT  = ITEMS.register("purple_xychronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_XYCHRONITE_INGOT = ITEMS.register("yellow_xychronite_ingot", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
