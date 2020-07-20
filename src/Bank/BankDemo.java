package Bank;

import Bank.ATM.ATM;
import Bank.InternetBank.InternetBank;
import Bank.User.UserContainer;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        UserContainer container = UserContainer.getInstance();
        container.init();

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        InternetBank internetBank = new InternetBank();

        int num;
        boolean bol = true;

        System.out.println("Манай банкинд тавай морил");
        while (bol) {
            System.out.println("1. АТМ, 2. Интернэт банк, 3. Гарах");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    atm.init();
                    break;
                case 2:
                    internetBank.init();
                    break;
                case 3:
                    bol = false;
                    break;
                default:
                    break;
            }
        }
    }
}
