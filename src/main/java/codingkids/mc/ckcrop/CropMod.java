package codingkids.mc.ckcrop;

import codingkids.mc.ckcrop.proxy.CommonProxy;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class CropMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static ItemSeeds mySeed;
    public static ItemFood myFood;
    public static MyCrop myCrop;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        myCrop = new MyCrop();
        myCrop.setRegistryName("my_crop");
        myCrop.setTranslationKey("ckcrop.my_crop");

        myFood = new ItemFood(5, 0.3F, false);
        myFood.setAlwaysEdible();
        myFood.setRegistryName("my_food");
        myFood.setTranslationKey("ckcrop.my_food");
        myFood.setCreativeTab(CreativeTabs.FOOD);

        mySeed = new ItemSeeds(myCrop, Blocks.FARMLAND);
        mySeed.setRegistryName("my_seed");
        mySeed.setTranslationKey("ckcrop.my_seed");
        mySeed.setCreativeTab(CreativeTabs.FOOD);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
