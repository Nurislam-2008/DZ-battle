public class Healer extends Defender{
    private int healedPower;

    public Healer(String name, int level, int health,int healedPower) {
        super(name, level, health);
        this.healedPower = healedPower;
    }

    public void heal(int heall){

    }

    public int getHealedPower() {
        return healedPower;
    }

    public void setHealedPower(int healedPower) {
        this.healedPower = healedPower;
    }

    @Override
    public String toString() {
        return "Healer{" +
                "healedPower=" + healedPower +
                '}';
    }
}
