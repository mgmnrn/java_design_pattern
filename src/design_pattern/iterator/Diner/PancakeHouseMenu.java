package design_pattern.iterator.Diner;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private ArrayList menuItemList;

    PancakeHouseMenu() {
        this.menuItemList = new ArrayList<>();
        addMenu("Buuz", "guril, mah", false, 900);
        addMenu("bansh", "guril, mah, shul", false, 500);
        addMenu("shultei hool", "guril, mah", false, 4000);
    }

    private void addMenu(String name, String discription, boolean var, double price) {
        MenuItem menuItem = new MenuItem(name, discription, var, price);
        menuItemList.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItemList);
    }

    List<MenuItem> getMenuItemList() {
        return menuItemList;
    }
}
