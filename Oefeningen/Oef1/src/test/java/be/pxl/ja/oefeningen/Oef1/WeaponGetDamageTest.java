package be.pxl.ja.oefeningen.Oef1;

import be.pxl.ja.oefeningen.Oef1.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaponGetDamageTest {
	private static final double BASE_DAMAGE = 50;
	private static final double DAMAGE_MODIFIER = 10.5;

	private Sword sword;

	@BeforeEach
	public void init() {
		sword = new Sword(BASE_DAMAGE, 1.0, 3.4);
	}


	@Test
	public void returnsBaseDamageWhenDamageModifierIsZero() {

	}

	@Test
	public void returnsZeroWhenDamageModifierNegativeOfBaseDamage() {
		// hit: sword.setDamageModifier(-BASE_DAMAGE);
	}

	@Test
	public void returnsZeroWhenDamageModifierIsLessThanNegativeOfBaseDamage() {
	}


	@Test
	public void returnsSumOfDamageModifierAndBaseDamage() {

	}

}
