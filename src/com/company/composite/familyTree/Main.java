package com.company.composite.familyTree;

public class Main {
    public static void main(String[] args) {
        Person davaa = new Person("Даваасүрэн");
        davaa.addPerson(new Person("Хүслэн"));
        Person bat = new Person("Батхүү");
        bat.addPerson(new Person("Сайнсанаа"));
        Person bold = new Person("Болдхүү");
        bold.addPerson(new Person("Ганбат"));
        bold.addPerson(new Person("Тулга-эрдэнэ"));
        Person choijil = new Person("Чойжил");
        choijil.addPerson(davaa);
        choijil.addPerson(bat);
        choijil.addPerson(bold);
        choijil.display("Тэрбиш", 0);
    }
}
