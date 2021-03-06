package by.training.java.module_6.task01.launch;

import by.training.java.module_6.task01.logic.Logging;
import by.training.java.module_6.task01.user.NewAccount;

import java.util.Scanner;

public class Client {

    public Client() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("1. Войти под существующим логином " + "| 2. Регистрация нового пользователя ");
        do {
            System.out.print("Сделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    Logging logging = new Logging();
                    break;
                case "2":
                    NewAccount newAccount = new NewAccount();
                    break;
            }
        } while (!number.matches("[12]"));
    }
}
