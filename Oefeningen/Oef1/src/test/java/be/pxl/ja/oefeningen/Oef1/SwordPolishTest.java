package be.pxl.ja.oefeningen.Oef1;

import be.pxl.ja.oefeningen.Oef1.Sword;
import be.pxl.ja.oefeningen.Oef1.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwordPolishTest {

	private static final double BASE_DAMAGE = 100;
	private static final double MAX_DAMAGE_MODIFIER = BASE_DAMAGE * 0.25;

	private Sword sword;

	@BeforeEach
	public void init() {
		sword = new Sword(BASE_DAMAGE, 1.0, 3.4);
	}

	@Test
	public void damageModifierIsIncreasedWithModifierChangeRate() {
		sword.setDamageModifier(0.0);

		sword.polish();

		assertEquals(Weapon.MODIFIER_CHANGE_RATE, sword.getDamageModifier());
	}

	@Test
	public void damageModifierDoesNotIncreaseWhenMaximumReached() {
		sword.setDamageModifier(MAX_DAMAGE_MODIFIER);

		sword.polish();

		assertEquals(MAX_DAMAGE_MODIFIER, sword.getDamageModifier());
	}

	@Test
	public void damageModifierOnlyIncreasesUntilMaximumReached() {
		sword.setDamageModifier(MAX_DAMAGE_MODIFIER - 0.05);

		sword.polish();

		assertEquals(MAX_DAMAGE_MODIFIER, sword.getDamageModifier());
	}

}
