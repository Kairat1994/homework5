import java.util.Random;

public class Boss {
    int hp;
    int damage;
    int defense;

    public int changeDefense() {
        Random random = new Random();
        defense = random.nextInt(100);

        System.out.println(defense);

        return defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
