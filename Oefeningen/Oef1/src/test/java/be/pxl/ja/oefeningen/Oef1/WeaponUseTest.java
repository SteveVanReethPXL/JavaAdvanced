package be.pxl.ja.oefeningen.Oef1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaponUseTest {
	private static final double BASE_DAMAGE = 5;
	private static final double DURABILITY_MODIFIER_BROKEN = -1.0;
	private static final double DURABILITY_MODIFIER_NOT_BROKEN = -0.25;

	private Sword sword;

	@BeforeEach
	public void init() {
		sword = new Sword(BASE_DAMAGE, 1.0, 5.4);
	}

	@Test
	public void usingABrokenWeaponReturnsDamageZero() {

	}

	@Test
	public void usingAWeaponReturnsEffectiveDamage() {

	}

	@Test
	public void usingAWeaponReducesTheDurabilityOfTheWeapon() {

	}
}
