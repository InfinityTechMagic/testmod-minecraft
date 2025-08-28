package net.defender13.testmod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "testmod");

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    // РУБИНОВЫЙ МЕЧ
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(
                    Tiers.DIAMOND,    // Материал (алмаз)
                    3,                // Базовая атака (+3 к урону)
                    -2.4F,            // Скорость атаки (стандартная для мечей)
                    new Item.Properties()
                            .stacksTo(1)
                            .durability(1561)
            ));
}