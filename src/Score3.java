import java.util.Scanner;

public class Score3 extends Score2 {
    private int beanCoffee = 0;

    public Score3() {
        super(200, 1000);
    }

    public int getBeanCoffee() {
        return beanCoffee;
    }

    public void setBeanCoffee(int beanCoffee) {
        this.beanCoffee = beanCoffee;
    }

    public void addBeanCoffee(int beanCoffee){
        this.beanCoffee += beanCoffee;
    }

    public boolean grindCoffee(int beanCoffee){
        if(beanCoffee > this.beanCoffee){
            System.out.println("dont present coffee");
            return false;
        }
        else {
            addGroundCoffee(beanCoffee);
            setBeanCoffee(getBeanCoffee() - beanCoffee);
            return true;
        }
    }

    @Override
    public boolean test(int coffee, int water){
        int i = 0;
        if(coffee > getGroundCoffee()){
            if(!grindCoffee(coffee)){
                i++;
            }
        }
        if(!super.test(coffee, water)){
            i++;
        }
        return i == 0;
    }

    @Override
    public boolean test(int coffee, int water, int milk){
        int i = 0;
        if(coffee > getGroundCoffee()){
            if(!grindCoffee(coffee)){
                i++;
            }
        }
        if(!super.test(coffee, water, milk)){
            i++;
        }
        return i == 0;
    }

    @Override
    public void menu() {
        int menu;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - On");
            System.out.println("2 - cookAmericano");
            System.out.println("3 - cookLatte");
            System.out.println("4 - Clean");
            System.out.println("5 - Off");
            System.out.println("0 - Exit");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> On();
                case 2 -> cookAmericano();
                case 3 -> {
                    System.out.println("How need milk?");
                    int needMilk = scanner.nextInt();
                    cookLatte(needMilk);
                }
                case 4 -> setRubbishBin(0);
                case 5 -> Off();
                default -> menu = 0;
            }
        } while (menu != 0);
    }
}
