package com.github.saaapphy.minceraftthing;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "minceraftthing", useMetadata=true)
public class ExampleMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());
    }
}
