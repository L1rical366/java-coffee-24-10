public class App {
    public static void app(String[] args) {
        CoffeeMachine score1 = new Score1();
        Score3 score3 = new Score3();
        score3.addBeanCoffee(30);
        score3.addMilk(1000);
        score3.addWater(1000);
        score3.menu();
    }
}
