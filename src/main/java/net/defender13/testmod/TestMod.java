package net.defender13.testmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("testmod")
public class TestMod {
    public TestMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Регистрируем предметы
        ModItems.ITEMS.register(modEventBus);

        // Можно добавить регистрацию других вещей (блоки, сущности и т.д.)
    }
}