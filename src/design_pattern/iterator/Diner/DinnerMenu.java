package design_pattern.iterator.Diner;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOFItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addMenu("tsuivan", "max, guril", false, 5000);
        addMenu("tsuivan", "max, guril", false, 5000);
        addMenu("tsuivan", "max, guril", false, 5000);
        addMenu("tsuivan", "max, guril", false, 5000);
    }

    public void addMenu(String name, String discription, boolean var, double price) {
        MenuItem menuItem = new MenuItem(name, discription, var, price);
        if (numberOFItems >= MAX_ITEMS) {
            System.out.println("Menuitem duursen bn");
        } else {
            menuItems[numberOFItems] = menuItem;
            numberOFItems += 1;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
}
