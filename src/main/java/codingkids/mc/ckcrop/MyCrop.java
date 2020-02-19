package codingkids.mc.ckcrop;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class MyCrop extends BlockCrops {
    @Override
    protected Item getSeed() {
        return CropMod.mySeed;
    }

    @Override
    protected Item getCrop() {
        return CropMod.myFood;
    }
}
