package com.company.flyweight.shape;

import java.util.HashMap;

public class DursUildver {
    private static final HashMap shapeMap = new HashMap();

    public static Shape getShape(String name) {
        Durs durs = (Durs) shapeMap.get(name);
        if (durs == null) {
            durs = new Durs(name);
            shapeMap.put(name, durs);
            System.out.println("==============> Shine durs uuslee: " + name);
        }
        return durs;
    }
}
