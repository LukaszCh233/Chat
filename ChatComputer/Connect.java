package ChatComputer;

import java.util.Scanner;

public class Connect {
   static String login;
   static String password;

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set your login:");
         login = scanner.nextLine();
        System.out.println("Set your password");
        password = scanner.nextLine();
        System.out.println("GOOD YOU HAVE ACCOUNT");
        System.out.println("LOGIN: " + login + "\t" + "PASSWORD: " + password);
    }
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("HELLO, PLEASE LOG IN TO YOUR ACCOUNT");
        System.out.println("ENTER THE LOGIN: ");
        String log = scanner.nextLine();
        System.out.println("ENTER THE PASSWORD: ");
        String pass = scanner.nextLine();

            if (log.equals(login) && pass.equals(password)){

                System.out.println("HELLO TO YOUR ACCOUNT");

            }
        else System.out.println("BAD LOGIN OR PASSWORD TRY AGAIN");

    }
}
