package net.mcreator.em.procedures;

import net.minecraft.world.World;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.em.EpicModElements;

@EpicModElements.ModElement.Tag
public class SirAlonnesBladeEffectProcedure extends EpicModElements.ModElement {
	public SirAlonnesBladeEffectProcedure(EpicModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SirAlonnesBladeEffect!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SirAlonnesBladeEffect!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SirAlonnesBladeEffect!");
			return;
		}
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int _ct = 0; _ct < 1; _ct++) {
			world.addOptionalParticle(ParticleTypes.LAVA, 1, y, z, 1, 1, 1);
		}
	}
}
