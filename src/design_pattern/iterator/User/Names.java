package design_pattern.iterator.User;

public class Names implements Container {
    private String names[] = {"Huslen", "Myagmarnaran", "bat", "bold"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }
    }
}
