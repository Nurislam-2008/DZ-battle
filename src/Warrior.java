public class Warrior extends Defender{
    private int damage;

    public void attack(int uron){
        this.damage=uron;
    }

    public Warrior(String name, int level, int health,int damage) {
        super(name, level, health);

        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "damage=" + damage +
                '}';
    }
}

