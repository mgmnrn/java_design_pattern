package design_pattern.iterator.Diner;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        printMenu(dinnerMenuIterator);
        printMenu(pancakeHouseMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
