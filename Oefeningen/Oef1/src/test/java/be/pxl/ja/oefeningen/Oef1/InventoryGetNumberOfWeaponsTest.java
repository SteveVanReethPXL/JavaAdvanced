package be.pxl.ja.oefeningen.Oef1;

import be.pxl.ja.oefeningen.Oef1.Inventory;
import be.pxl.ja.oefeningen.Oef1.Sword;
import org.junit.jupiter.api.Test;

public class InventoryGetNumberOfWeaponsTest {

    @Test
    public void newlyCreatedInventoryHasNoWeapons() {

    }

    @Test
    public void whenWeaponIsAddedTheNumberOfWeaponsIsIncreased() {

    }

    @Test
    public void whenABrokenWeaponsIsRemovedTheNumberOfWeaponsIsDecreased() {
        Inventory inventory = new Inventory();
        Sword sword = new Sword(5.5, 1.0, 8.5);
        Sword otherSword = new Sword(12.7, 0.25, 45.5);
        inventory.addWeapon(sword);
        inventory.addWeapon(otherSword);
        otherSword.setDurabilityModifier(-0.5);

        // TODO: complete this test

    }
}
