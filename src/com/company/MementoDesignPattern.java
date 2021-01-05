package com.company;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String id;
    private String gender;

    public Student(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Refrigerator [name=" + name + ", id=" + id + ", gender=" + gender
                + "]";
    }
}

class Memento{
    Student refri;

    public Student getRefri() {
        return refri;
    }

    public void setRefri(Student refri) {
        this.refri = refri;
    }

    public Memento(Student refri) {
        this.refri=refri;

    }

    @Override
    public String toString() {
        return "Memento [refri=" + refri +"]";
    }

}

class LivingAreaOriginator{
    Student ref;

    public Student getRef() {
        return ref;
    }

    public void setRef(Student ref) {
        this.ref = ref;
    }

    public Memento createMemento() {
        return new Memento(ref);
    }

    public void getMemento(Memento m) {
        ref=m.getRefri();
    }

    @Override
    public String toString() {
        return "LivingAreaOriginator [ref=" + ref +  "]";
    }
}

class CareTakerStore{
    List<Memento> refLists=new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        refLists.add(memento);
    }

    public Memento getMemento(int index) {
        return refLists.get(index);
    }
}
public class MementoDesignPattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LivingAreaOriginator originator=new LivingAreaOriginator();
        CareTakerStore ct=new CareTakerStore();

        originator.setRef(new Student("Бат", "16b1seas0012", "Эрэгтэй"));
        ct.addMemento(originator.createMemento());

        originator.setRef(new Student("Хүслэн", "16b1seas0011", "Эмэгтэй"));
        ct.addMemento(originator.createMemento());

        System.out.println("Одоогийн байгаа төлвийг харуулж байна.");
        System.out.println("originator-н одоогийн төлөв "+ originator);
        System.out.println("Өмнөхийг байсан төлвийг харуулж байна.");
        originator.getMemento(ct.getMemento(0));
        System.out.println("Өмнөх төлөв : "+ originator);
    }
}

