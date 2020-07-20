package design_pattern.iterator.User;

public class UserDemo {
    public static void main(String[] args) {
        Names names = new Names();

        for (Iterator iter = names.getIterator(); iter.hasNext();) {
            System.out.println("Name: " + iter.next());
        }
    }
}
