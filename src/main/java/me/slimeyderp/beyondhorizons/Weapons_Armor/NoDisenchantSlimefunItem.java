package me.slimeyderp.beyondhorizons.weapons_armor;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class NoDisenchantSlimefunItem extends SlimefunItem {

    public NoDisenchantSlimefunItem(Category category, SlimefunItemStack item, RecipeType recipeType,
                                    ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public boolean isDisenchantable() {
        return false;
    }
}
