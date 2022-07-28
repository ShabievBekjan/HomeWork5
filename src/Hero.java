public class Hero {
    private int HeroHealth;
    private int Damage;
    private String SuperPower;

    public Hero(int heroHealth, int damage, String superPower) {
        HeroHealth = heroHealth;
        Damage = damage;
        SuperPower = superPower;
    }

    public Hero(int heroHealth, int damage) {
        HeroHealth = heroHealth;
        Damage = damage;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public int getDamage() {
        return Damage;
    }
}
