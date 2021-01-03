public abstract class CoffeeMachine {
    private int groundCoffee = 0;
    private int water = 0;
    private int rubbishBin = 0;
    private int rubbishBinLimit;
    private boolean power = false;

    public CoffeeMachine(int rubbishBinLimit) {
        this.rubbishBinLimit = rubbishBinLimit;
    }

    public int getGroundCoffee() {
        return groundCoffee;
    }

    public void setGroundCoffee(int groundCoffee) {
        this.groundCoffee = groundCoffee;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getRubbishBin() {
        return rubbishBin;
    }

    public void setRubbishBin(int rubbishBin) {
        this.rubbishBin = rubbishBin;
    }

    public int getRubbishBinLimit() {
        return rubbishBinLimit;
    }

    public void addGroundCoffee(int groundCoffee){
        this.groundCoffee += groundCoffee;
    }

    public void addWater(int water){
        this.water += water;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public abstract void menu();
}
