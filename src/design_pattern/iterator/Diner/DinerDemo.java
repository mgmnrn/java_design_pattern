package design_pattern.iterator.Diner;

public class DinerDemo {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

        waitress.printMenu();
    }
}
