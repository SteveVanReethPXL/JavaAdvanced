package be.pxl.ja.oefeningen.Oef1;

import be.pxl.ja.oefeningen.Oef1.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeaponIsBrokenTest {
	private Sword sword;

	@BeforeEach
	public void init() {
		sword = new Sword(8.5, 1.0, 3.4);
	}

	@Test
	public void returnsTrueIfSumOfDurabilityModifierAndBaseDurabilityIsZero() {

	}

	@Test
	public void returnsTrueIsSumOfDurabilityModifierAndBaseDurabilityIsLessThanZero() {

	}

	@Test
	public void returnsFalseIfSumOfDurabilityModifierAndBaseDurabilityIsMoreThanZero() {

	}

}
