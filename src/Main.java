//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Marsel", 6, 100, 20);
        Mage mage = new Mage("Ibrogim", 7, 70, 4);
        Healer healer = new Healer("Sigmanat", 5, 50, 6);
        Defender defender = new Defender("Rinat", 10, 90);
        System.out.println(warrior);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println(mage);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println(healer);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println(defender);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println("Битва началась! ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println(warrior.getName()+" Нападает на " + defender.getName());
        warrior.attack(defender.getHealth());
        System.out.println("Здоровье Врага: "+ defender.getHealth());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println(mage.getName()+"пытается использовать заклинание");
        mage.castspell(defender.getHealth());
        System.out.println("Здоровье врага: "+defender.getHealth());
        System.out.println("Оставшаяся мана Мага "+mage.getMana());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println(healer.getName()+"Лечит Война "+warrior.getName());
        System.out.println("Здоровье Война: " + warrior.getHealth());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException k) {
            throw new RuntimeException();
        }
        System.out.println("Битва окончена! Выиграл Нурислам");

























    }
}