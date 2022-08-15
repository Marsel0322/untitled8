import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setDeffens("Majic");
        System.out.println("boss damage: "+ boss.getDamage());
        System.out.println("boss health: "+ boss.getHealth());
        System.out.println("boss deffens: "+ boss.getDeffens());
    }
}