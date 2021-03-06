package projectvibrantjourneys.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PVJFoods {
	public static final Food RAW_CLAM = (new Food.Builder()).hunger(1).saturation(0.2F).effect(new EffectInstance(Effects.POISON, 400, 0), 0.9F).build();
	public static final Food COOKED_CLAM = (new Food.Builder()).hunger(6).saturation(0.6F).build();
	public static final Food CLAM_CHOWDER = (new Food.Builder()).hunger(9).saturation(0.7F).effect(new EffectInstance(Effects.WATER_BREATHING, 300, 0), 1.0F).build();
	public static final Food CRACKED_COCONUT = (new Food.Builder()).hunger(3).saturation(0.35F).build();
	public static final Food COCONUT_MILK = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().build();
}
