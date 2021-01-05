package com.company.flyweight.shape;

public class Main {
    private static final String durs[] = {"Toirog", "Gurvaljin", "Kavdrat"};
    private static final String colors[] = {"Ulaan", "Nogoon", "Tsenger", "Har", "Tsagaan"};

    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            Durs durs = (Durs) DursUildver.getShape(getRandomShape());
            durs.setColor(getRandomColor());
            durs.setSize(getRandomSize());
            durs.draw();
        }
    }

    private static int getRandomSize() {
        return (int)(Math.random()*20);
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static String getRandomShape() {
        return durs[(int)(Math.random()*durs.length)];
    }
}
