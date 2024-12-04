public class Mage extends Defender {
    private int mana;

    public void castspell(int charg) {
    if(charg==mana){
        System.out.println("Мана заряжена! ");
    }else{
        System.out.println("Мана не заряжена! ");}
    }

    public Mage(String name, int level, int health,int mana) {
        super( name, level, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "mana=" + mana +
                '}';
    }
}

