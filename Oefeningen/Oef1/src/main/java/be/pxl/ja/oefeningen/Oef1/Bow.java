package be.pxl.ja.oefeningen.Oef1;

public class Bow extends Weapon {

    public Bow( double baseDamage, double baseDurability, double durabilityModifier){
        super("bow", baseDamage,0, baseDurability, durabilityModifier);
    }

    public void polish(){
        double value = this.getDurabilityModifier() + Weapon.MODIFIER_CHANGE_RATE;
        this.setDurabilityModifier(value > 1 ? 1 : value);
    }
}
