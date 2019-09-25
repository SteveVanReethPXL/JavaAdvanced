package be.pxl.ja.oefeningen.Oef1;

import be.pxl.ja.oefeningen.Oef1.Bow;
import be.pxl.ja.oefeningen.Oef1.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowPolishTest {
	private static final double BASE_DURABILITY = 0.75;

	private Bow bow;

	@BeforeEach
	public void init() {
		bow = new Bow(8.5, BASE_DURABILITY, 3.4);
	}


	@Test
	public void durabilityModifierIsIncreasedWithModifierChangeRate() {
		bow.setDurabilityModifier(0.0);

		bow.polish();

		assertEquals(Weapon.MODIFIER_CHANGE_RATE, bow.getDurabilityModifier());
	}

	@Test
	public void durabilityModifierDoesNotIncreaseWhenMaximumReached() {
		double maxDurabilityModifier = 1 - BASE_DURABILITY;
		bow.setDurabilityModifier(maxDurabilityModifier);

		bow.polish();

		assertEquals(maxDurabilityModifier, bow.getDurabilityModifier());
	}

	@Test
	public void durabilityModifierOnlyIncreasesUntilMaximumReached() {
		double maxDurabilityModifier = 1 - BASE_DURABILITY;
		bow.setDurabilityModifier(maxDurabilityModifier - 0.05);

		bow.polish();

		assertEquals(maxDurabilityModifier, bow.getDurabilityModifier());
	}

}
