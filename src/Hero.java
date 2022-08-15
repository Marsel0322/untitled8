public class Hero {
    private int healt;
    private int damege;
    private String Hero;

    public Hero(int healt, int damege, String hero) {
        this.healt = healt;
        this.damege = damege;
        Hero = hero;
    }

    public Hero(int healt, int damege) {
        this.healt = healt;
        this.damege = damege;
    }

    public int getHealt() {
        return healt;
    }

    public int getDamege() {
        return damege;
    }

    public String getHero() {
        return Hero;
    }
}
