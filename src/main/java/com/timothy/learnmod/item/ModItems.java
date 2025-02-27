package com.timothy.learnmod.item;

import com.timothy.learnmod.LearnMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PUER_LEAVE = registerItems("puer_leave", new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(LearnMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(LearnMod.MOD_ID, id), item);
    }

    public static void registerModItems() {
        LearnMod.LOGGER.info("Registering items");
    }
}
