package design_pattern.iterator.Diner;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int index = 0;

    DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.length > index && items[index] != null;
    }

    @Override
    public Object next() {
//        MenuItem menuItem = items[index];
//        index += 1;
//        return menuItem;

        return items[++index];
    }
}
