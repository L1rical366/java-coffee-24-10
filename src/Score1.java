import java.util.Scanner;

public class Score1 extends CoffeeMachine {

    public Score1() {
        super(200);
    }

    protected Score1(int limit) {
        super(limit);
    }

    public void On() {
        setPower(true);
    }

    public void Off() {
        setPower(false);
    }

    public boolean test(int coffee, int water) {
        int i = 0;
        if (!isPower()) {
            return false;
        }
        if (coffee > getGroundCoffee()) {
            i++;
            System.out.println("dont present coffee");
        }
        if (water > getWater()) {
            i++;
            System.out.println("Not water");
        }
        if (coffee + getRubbishBin() > getRubbishBinLimit()) {
            i++;
            System.out.println("so many coffee");
        }
        return i == 0;
    }

    public void cookEspresso() {
        int needCoffee = 22;
        int needWater = 30;
        if (test(needCoffee, needWater)) {
            setGroundCoffee(getGroundCoffee() - needCoffee);
            setWater(getWater() - needWater);
            setRubbishBin(getRubbishBin() + needCoffee);
            System.out.println("Your coffe");
        }
    }

    public void cookAmericano() {
        int needCoffee = 22;
        int needWater = 100;
        if (test(needCoffee, needWater)) {
            setGroundCoffee(getGroundCoffee() - needCoffee);
            setWater(getWater() - needWater);
            setRubbishBin(getRubbishBin() + needCoffee);
            System.out.println("Your coffe");
        }
    }

    public void menu() {
        int menu;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - On");
            System.out.println("2 - cookEspresso");
            System.out.println("3 - cookAmericano");
            System.out.println("4 - Clean ");
            System.out.println("5 - Off");
            System.out.println("0 - Exit");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> On();
                case 2 -> cookEspresso();
                case 3 -> cookAmericano();
                case 4 -> setRubbishBin(0);
                case 5 -> Off();
                default -> menu = 0;
            }
        } while (menu != 0);
    }
}
