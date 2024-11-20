public class Pet {
  
    private boolean alive;
    private int clean, cleanMax;
    private int energy, energyMax;
    private int hungry, hungryMax;
    private int age, diamonds;

    public Pet(int energyMax, int hungryMax, int cleanMax) {
        this.energyMax = energyMax;
        this.hungryMax = hungryMax;
        this.cleanMax = cleanMax;
        this.energy = energyMax;
        this.hungry = hungryMax;
        this.clean = cleanMax;
        this.age = 0;
        this.diamonds = 0;
        this.alive = true;
    }

    private boolean testAlive() {
        if (!alive) {
            System.out.println("fail: pet esta morto");
            return false;
        }
        return true;
    }

    public int getClean() {
        return clean;
    }

    public int getCleanMax() {
        return cleanMax;
    }

    public int getEnergy() {
        return energy;
    }

    public int getEnergyMax() {
        return energyMax;
    }

    public int getHungry() {
        return hungry;
    }

    public int getHungryMax() {
        return hungryMax;
    }

    public void setClean(int value) {
        if (value <= 0) {
            clean = 0;
            alive = false;
            System.out.println("fail: pet morreu de sujeira");
        } else {
            clean = Math.min(value, cleanMax);
        }
    }

    public void setEnergy(int value) {
        if (value <= 0) {
            energy = 0;
            alive = false;
            System.out.println("fail: pet morreu de fraqueza");
        } else {
            energy = Math.min(value, energyMax);
        }
    }

    public void setHungry(int value) {
        if (value <= 0) {
            hungry = 0;
            alive = false;
            System.out.println("fail: pet morreu de fome");
        } else {
            hungry = Math.min(value, hungryMax);
        }
    }

    public void eat() {
        if (!testAlive()) return;
        setEnergy(energy - 1);
        setHungry(hungry + 4);
        setClean(clean - 2);
        age += 1;
    }

    public void play() {
        if (!testAlive()) return;
        setEnergy(energy - 2);
        setHungry(hungry - 1);
        setClean(clean - 3);
        diamonds += 1;
        age += 1;
    }

    public void shower() {
        if (!testAlive()) return;
        setEnergy(energy - 3);
        setHungry(hungry - 1);
        setClean(cleanMax);
        age += 2;
    }

    public void sleep() {
        if (!testAlive()) return;
        int lostEnergy = energyMax - energy;
        if (lostEnergy < 5) {
            System.out.println("fail: nao esta com sono");
            return;
        }
        age += lostEnergy;
        setEnergy(energyMax);
        setHungry(hungry - 1);
    }

    public String toString() {
        return String.format("E:%d/%d, S:%d/%d, L:%d/%d, D:%d, I:%d", 
                energy, energyMax, hungry, hungryMax, clean, cleanMax, diamonds, age);
    }
}