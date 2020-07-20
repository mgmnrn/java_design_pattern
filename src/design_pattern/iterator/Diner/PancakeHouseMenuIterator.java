package design_pattern.iterator.Diner;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList arrayList;
    int index = 0;

    PancakeHouseMenuIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return arrayList.get(0);
    }
}
