package lemon_juice.xychron.item.custom;

import lemon_juice.xychron.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RGBSliderItem extends Item {
    public RGBSliderItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(ModItems.RGB_SLIDER.get());
    }
}
