package be.pxl.ja.oefeningen.Oef1;

public class Sword extends Weapon {

    public Sword( double baseDamage, double baseDurability, double durabilityModifier){
        super("sword", baseDamage,0, baseDurability, durabilityModifier);
    }

    public void polish(){
        double value = getDamageModifier() + Weapon.MODIFIER_CHANGE_RATE;
        this.setDamageModifier(value > 25 ? 25 : value);
    }
}
