package net.llordllex.wr4th.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.llordllex.wr4th.AmethystusWr4th;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MYSTERY_CRYSTAL = registerItem("mysterious_crystal",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TYSTA_CRYSTAL = registerItem("tysta_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item T_TYSTA_CRYSTAL = registerItem("true_tysta_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AmethystusWr4th.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        System.out.println("Registering Mod Items for " + AmethystusWr4th.MOD_ID);
    }
}
