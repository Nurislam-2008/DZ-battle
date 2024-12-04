public class Defender {
    private String name;
    private int level;
    private int health;


    public void Defend(boolean hp) {
        if(hp==true){
            System.out.println("Противник Защищается! ");
        }else{
            System.out.println("ne zashishaetsya");
        }
    }public Defender(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Defender{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
