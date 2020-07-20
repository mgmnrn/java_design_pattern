package design_pattern.state.atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Context context = new Context();
        State readyState = new ReadyState();
        State offState = new OffState();
        State workState = new WorkSatate();

        context.setState(readyState);
        context.setReadyState(readyState);
        context.setOffState(offState);
        context.setWorkState(workState);

        Scanner scanner = new Scanner(System.in);
        int val;
        while (true) {
            System.out.println("1. Асаах, 2. Унтраах, 3. Нэвтрэх, 4. Дансны хуулга, 5. Мөнгө авах");
            val = scanner.nextInt();
            switch (val) {
                case 1 :
                    context.getState().start(context);
                    break;
                case 2:
                    context.getState().off(context);
                    break;
                case 3:
                    context.getState().enterPin(context);
                    break;
                case 4:
                    context.getState().displayBalance(context);
                    break;
                case 5:
                    context.getState().deposit(context);
                    break;
            }
        }
    }
}
