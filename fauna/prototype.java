package fauna;

import java.util.Random;

public class prototype {
    private int amount;
    /**
     * a number between
     */
    private double reproductionChance;
    private double naturalDeathChance;

    public prototype(int startingAmount, double reproductionChance, double naturalDeathChance) {
        amount = startingAmount;
        this.reproductionChance = reproductionChance;
        this.naturalDeathChance = naturalDeathChance;
    }

    public int getAmount() {
        return amount;
    }

   public double getNaturalDeathChance() {
        return naturalDeathChance;
    }

    public double getReproductionChance() {
        return reproductionChance;
    }

    public int update() {
        Random rng = new Random();
        for (int i = 0; i < amount; i++) {
            int breed = rng.nextInt();
            int death = rng.nextInt();
            if (breed <= reproductionChance) {
                amount++;
            }
            if (death <= naturalDeathChance) {
                amount--;
            }
        }
        return amount;
    }

    public String toString() {
        return  "current amount: " + amount /*+
                "\n reproduction chance: " + reproductionChance +
                "\n natural death chance: " + naturalDeathChance*/;
    }
}
