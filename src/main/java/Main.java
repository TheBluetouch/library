import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    private static Scanner SCANNER;

    public static void main(String[] args) {
        SCANNER = new Scanner(System.in);
        while (true) {

            menu();


            int wybor = SCANNER.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("[Wyświetl wszystkie książki] jeszcze nie zaimplementowana/e");
                    break;
                case 2:
                    System.out.println("[Dodaj książkę] jeszcze nie zaimplementowana/e");
                    break;
                case 3:
                    System.out.println("[Usuń książkę] jeszcze nie zaimplementowana/e");
                    break;
                default:
                    System.out.println("błędne dane");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println(" Witaj w Bibliotece! Co mogę dla Ciebie zrobić?");
        System.out.println(" 1) Wyświetl wszystkie książki");
        System.out.println(" 2) Dodaj książkę");
        System.out.println(" 3) Usuń książkę");
        System.out.println(" Wybieram: ");
    }
}
