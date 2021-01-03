import java.util.Scanner;

public class Score2 extends Score1 {
    private int milk = 0;
    private int milkLimit = 2000;

    public Score2() {
        super(400);
    }

    protected Score2(int RubbishBinLimit, int milkLimit){
        super(RubbishBinLimit);
        this.milkLimit = milkLimit;
    }

    public void addMilk(int milk){
        if(milk + this.milk > this.milkLimit){
            System.out.println("so many milk");
        }
        else {
            this.milk += milk;
        }
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if(milk + this.milk > this.milkLimit){
            System.out.println("so many milk");
        }
        else {
            this.milk = milk;
        }
    }

    public boolean test(int coffee, int water, int milk) {
        int i = 0;
        if(milk > getMilk()){
            i++;
            System.out.println("dont present milk");
        }
        if(!super.test(coffee, milk)){
            i++;
        }
        return i == 0;
    }

    public void cookLatte(int needMilk){
        int needCoffee = 22;
        int needWater = 30;
        if (test(needCoffee, needWater, needMilk)) {
            setGroundCoffee(getGroundCoffee() - needCoffee);
            setWater(getWater() - needWater);
            setRubbishBin(getRubbishBin() + needCoffee);
            setMilk(getMilk()-needMilk);
            System.out.println("Your coffee");
        }
    }

    public void cookCappuccino(int needMilk){
        cookLatte(needMilk);
    }

    @Override
    public void menu() {
        int menu;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - On");
            System.out.println("2 - cookEspresso");
            System.out.println("3 - cookAmericano");
            System.out.println("4 - cookLatte");
            System.out.println("5 - cookCappuccino");
            System.out.println("6 - clean ");
            System.out.println("7 - Off");
            System.out.println("0 - Exit");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> On();
                case 2 -> cookEspresso();
                case 3 -> cookAmericano();
                case 4 -> {
                    System.out.println("How need milk?");
                    int needMilk = scanner.nextInt();
                    cookLatte(needMilk);
                }
                case 5 -> {
                    System.out.println("How need milk?");
                    int needMilk = scanner.nextInt();
                    cookCappuccino(needMilk);
                }
                case 6 -> setRubbishBin(0);
                case 7 ->Off();
                default -> menu = 0;
            }
        } while (menu != 0);
    }
}
