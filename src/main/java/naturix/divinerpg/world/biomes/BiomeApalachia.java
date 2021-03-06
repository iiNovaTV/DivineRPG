package naturix.divinerpg.world.biomes;

import naturix.divinerpg.dimensions.apalachia.worldgen.trees.ApalachiaTree;
import naturix.divinerpg.dimensions.apalachia.worldgen.trees.ApalachiaTreeLarge;
import naturix.divinerpg.objects.entities.entity.twilight.*;
import naturix.divinerpg.registry.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;
import java.util.Random;

public class BiomeApalachia extends Biome {

    private static BiomeProperties properties = new BiomeProperties("Apalachia");
	private World world;
	private Random rand;
	private BlockPos pos; 
	public BiomeApalachia() {
	super(properties);
	//this.topBlock = ModBlocks.grassApalachia.getDefaultState();
	//this.fillerBlock = ModBlocks.dirtApalachia.getDefaultState();
    this.spawnableCreatureList.clear();
    this.spawnableMonsterList.clear();
    this.spawnableCaveCreatureList.clear();
    this.spawnableWaterCreatureList.clear();
    this.flowers.clear();
    this.decorator.flowersPerChunk = 0;	
    this.decorator.grassPerChunk = 0;
    
    this.spawnableMonsterList.add(new SpawnListEntry(EnchantedWarrior.class, 1, 1, 1));
    this.spawnableMonsterList.add(new SpawnListEntry(ApalachiaGolem.class, 1, 1, 1));
    this.spawnableMonsterList.add(new SpawnListEntry(Bunny.class, 1, 1, 1));
    this.spawnableMonsterList.add(new SpawnListEntry(EnchantedArcher.class, 1, 1, 1));
    this.spawnableMonsterList.add(new SpawnListEntry(Greenfeet.class, 1, 1, 1));
    this.spawnableMonsterList.add(new SpawnListEntry(Madivel.class, 1, 1, 1));
    this.spawnableMonsterList.add(new SpawnListEntry(SunArcher.class, 1, 1, 1));
    

//    this.getSkyColorByTemp(Color.getHSBColor(0.1361F, 0.95F, 1.0F).getRGB());
}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1) {
        return Color.getHSBColor(0.1361F, 0.95F, 1.0F).getRGB();
}
	@Override
    public WorldGenAbstractTree getRandomTreeFeature(Random random) {
		if (random.nextInt(5) == 0) {
            return new ApalachiaTree(false, 5);
        } else {
            return new ApalachiaTreeLarge(true, 5);
        }

    }
	

	
}