public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealthBoss(500);
        boss.setDamage(20);
        boss.setDefencetype("Fire");
        System.out.println("healthBoss = " + boss.getHealthBoss());
        System.out.println("Damage =" + boss.getDamage());
        System.out.println("Defencetype" + boss.getDefencetype());

    }
}