package Bank.ATM;

import java.util.Scanner;

public class ATM {
    private Context context;

    public ATM() {
        context = new Context();
    }

    public void init() {
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        int num;
        while (bool) {
                if (context.getState() == context.getWorkingState()) {
                    System.out.println("1. Дансны үлдэгдэл, 2. Орлого хийх 3. Шилжүүлэг хийх 4. Гарах, 5. Буцах");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            context.getState().balance(context);
                            break;
                        case 2:
                            context.getState().deposit(context);
                            break;
                        case 3:
                            context.getState().withdraw(context);
                            break;
                        case 4:
                            context.getState().logout(context);
                            break;
                        case 5:
                            bool = false;
                            break;
                        default:
                            break;
                    }
                } else {
                System.out.println("1. Асаах, 2. Унтраах 3. Нэвтрэх 4. Буцах");
                num = scanner.nextInt();
                switch (num) {
                    case 1:
                        context.getState().on(context);
                        break;
                    case 2:
                        context.getState().off(context);
                        break;
                    case 3:
                        context.getState().login(context);
                        break;
                    case 4:
                        bool = false;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
