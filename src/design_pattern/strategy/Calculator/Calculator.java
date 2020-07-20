package design_pattern.strategy.Calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws InputMismatchException {
        Strategy sum = new SumOperation();
        Strategy divide = new DivideOperation();

        int val, a, b;
        boolean state = true;
        Scanner scanner = new Scanner(System.in);

        while (state){
            System.out.println("1. Нэмэх, 2. Хасах, 3. Гарах");
            val = scanner.nextInt();
            System.out.println("A тоо оруулна уу");
            a = scanner.nextInt();
            System.out.println("Б тоо оруулна уу");
            b = scanner.nextInt();
            switch (val) {
                case 1:
                    System.out.println(sum.doOperation(a, b));
                    break;
                case 2:
                    System.out.println(divide.doOperation(a, b));
                    break;
                case 3:
                    state = false;
                    break;
                default:
                    break;
            }
        }
    }
}
