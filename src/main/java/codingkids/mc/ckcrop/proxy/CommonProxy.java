package codingkids.mc.ckcrop.proxy;

import codingkids.mc.ckcrop.CropMod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod.EventBusSubscriber
public interface CommonProxy {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(CropMod.myCrop);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(CropMod.myCrop).setRegistryName(CropMod.myCrop.getRegistryName()));
        event.getRegistry().registerAll(CropMod.myFood);
        event.getRegistry().registerAll(CropMod.mySeed);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CropMod.myCrop), 0, new ModelResourceLocation(Item.getItemFromBlock(CropMod.myCrop).getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CropMod.myFood, 0, new ModelResourceLocation(CropMod.myFood.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CropMod.mySeed, 0, new ModelResourceLocation(CropMod.mySeed.getRegistryName(), "inventory"));
    }
}
