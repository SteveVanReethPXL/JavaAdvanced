package be.pxl.ja.oefeningen.Oef1;

public abstract class Weapon {
    public static final float MODIFIER_CHANGE_RATE = 0.1f;
    private String name;
    private double weight;
    private double baseDamage;
    private double damageModifier;
    private double baseDurability;
    private double durabilityModifier;

    public Weapon(String name, double baseDamage, double damageModifier, double baseDurability, double durabilityModifier) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.damageModifier = damageModifier;
        this.baseDurability = baseDurability;
        this.durabilityModifier = durabilityModifier;
    }

    public abstract void polish();

    public String getName(){
        return this.name;
    }

    public double use(){
        if(this.isBroken()){
            return 0.0;
        }else{
            this.setDurabilityModifier(this.getDurabilityModifier() - MODIFIER_CHANGE_RATE);
            return this.getDamage();
        }
    }

    public boolean isBroken(){
        return (this.getDurability() == 0);
    }

    public double getBaseDamage(){
        return this.baseDamage;
    }

    public double getDamage(){
        return (this.baseDamage + this.damageModifier) < 0 ? 0 : (this.baseDamage + this.damageModifier);
    }

    public double getDamageModifier(){
        return this.damageModifier;
    }

    public double getBaseDurability(){
        return this.baseDurability;
    }

    public double getDurability(){
        double sum = this.baseDurability + this.durabilityModifier;
        if (sum < 0) {
            sum = 0;
        }else if(sum > 1) {
            sum = 1;
        }
        return sum;
    }

    public double getDurabilityModifier(){
        return this.durabilityModifier;
    }

    public void setDamageModifier(double damageModifier){
        this.damageModifier = damageModifier;
    }

    public void setDurabilityModifier(double durabilityModifier){
        this.durabilityModifier = durabilityModifier;
    }

    public double getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return String.format("%s −− Weight: %.2f, Damage: %.2f, Durability: %.2f %%", this.name, this.weight, this.getDamage(), this.getDurability());
    }
}
