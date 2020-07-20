package Bank.InternetBank;

import Bank.PostOffice.PostOffice;
import Bank.User.User;
import Bank.User.UserContainer;
import Bank.User.UserFactory;

import java.util.Scanner;

public class InternetBank {
    private UserContainer container = UserContainer.getInstance();
    private Scanner scanner = new Scanner(System.in);

    public void init() {
        boolean bool = true;
        int num;

        while (bool) {
            System.out.println("1. Бүртгүүлэх, 2. Нэвтрэх 3. Буцах");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    signup();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    bool = false;
                     break;
                default:
                    break;
            }
        }
    }

    private void login() {
        System.out.println("Та нэвтрэх нэрээ оруулана уу");
        String name = scanner.next();
        System.out.println("Та пин кодоо оруулна уу");
        int pin = scanner.nextInt();

        UserContainer container = UserContainer.getInstance();

        if (container.isUser(name, pin)) {
            container.isCurrentUser(pin);
            System.out.println("Амжилттай нэвтэрлээ");
            logged();
        } else {
            System.out.println("Таны нэвтрэх нэр эсвэл пин код буруу байна");
        }
    }

    private void signup() {
        System.out.println("Та шинэ нэвтрэх нэрээ оруулана уу");
        String name = scanner.next();
        System.out.println("Та шинэ пин кодоо оруулна уу");
        int pin = scanner.nextInt();
        User user = UserFactory.getUser(name, pin);
        UserContainer.getInstance().addUser(user);
        System.out.println("Амжилттай бүртгэгдлээ. Та нэвтэрч орно уу");
    }

    private void logged() {
        boolean bool = true;
        int num;

        while (bool) {
            System.out.println("1. Дансны үлдэгдэл, 2. Шилжүүлэг хийх, 3. Email, 4. Гарах 5. Буцах");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    balance();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    email();
                    break;
                case 4:
                    logout();
                    break;
                case 5:
                    bool = false;
                    break;
                default:
                    break;
            }
        }
    }

    private void email() {
        boolean bool = true;
        int num;

        while (bool) {
            System.out.println("1. Email шалгах, 2. Email илгээх, 3. Буцах");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    emailCheck();
                    break;
                case 2:
                    emailSent();
                    break;
                case 3:
                    bool = false;
                    break;
                default:
                    break;
            }
        }
    }

    private void emailCheck() {
        container.getCurrentUser().getEmail().display();
    }

    private void emailSent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Илгээх хэрэглэгчийн email оруулна уу?");
        String to = scanner.nextLine();
        System.out.println("Ямар sms илгээх вэ");
        String sms = scanner.nextLine();
        PostOffice postOffice = new PostOffice();
        postOffice.notify(sms, container.getCurrentUser().getEmail(), to);
        System.out.println("SMS илгээгдлээ");
    }

    private void balance() {
        User currentUser = container.getCurrentUser();
        System.out.println("Таны дансанд: " + currentUser.getBalance().getMoney() );
    }

    private void logout() {
        container.setCurrentUser(null);
        System.out.println("Амжилттай гарлаа");
    }
}
