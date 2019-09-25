package be.pxl.ja.oefeningen.Oef1;

import be.pxl.ja.oefeningen.Oef1.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaponGetDurabilityTest {
	private static final double BASE_DURABILITY = 0.75;

	private Sword sword;

	@BeforeEach
	public void init() {
		sword = new Sword(8.5, BASE_DURABILITY, 3.4);
	}


	@Test
	public void returnsBaseDurabilityWhenDurabilityModifierIsZero() {
		sword.setDurabilityModifier(0);

		double durability = sword.getDurability();

		assertEquals(BASE_DURABILITY, durability);
	}

	@Test
	public void returnsZeroWhenDurabilityModifierNegativeOfBaseDurability() {
		sword.setDurabilityModifier(-BASE_DURABILITY);

		double durability = sword.getDurability();

		assertEquals(0, durability);
	}

	@Test
	public void returnsZeroWhenDurabilityModifierIsLessThanNegativeOfBaseDurability() {
		sword.setDurabilityModifier(-BASE_DURABILITY - 0.5);

		double durability = sword.getDurability();

		assertEquals(0, durability);
	}


	@Test
	public void returnsSumOfDurabilityModifierAndBaseDurability() {
		sword.setDurabilityModifier(0.05);

		double durability = sword.getDurability();

		assertEquals(BASE_DURABILITY + 0.05, durability);
	}

	@Test
	public void returnsOneIfSumOfDurabilityModifierAndBaseDurabilityEqualsOne() {
		sword.setDurabilityModifier(1 - BASE_DURABILITY);

		double durability = sword.getDurability();

		assertEquals(1, durability);
	}

	@Test
	public void returnsOneIfSumOfDurabilityModifierAndBaseDurabilityExceedsOne() {
		sword.setDurabilityModifier(1 - BASE_DURABILITY + 0.05);

		double durability = sword.getDurability();

		assertEquals(1, durability);
	}
}
