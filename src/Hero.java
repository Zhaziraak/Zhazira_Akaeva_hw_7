public abstract class Hero implements HavingSuperAbility{

    private int Health;
    private int Damage;
    private String TypeOfSuperAbility;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getTypeOfSuperAbility() {
        return TypeOfSuperAbility;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        TypeOfSuperAbility = typeOfSuperAbility;
    }
}
