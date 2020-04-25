import Model.Book;
import Model.Library;
import Model.LibraryException;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    private static Scanner SCANNER;

    public static void main(String[] args) {
        Library library = createLibraryWithBooks();
        SCANNER = new Scanner(System.in);
        while (true) {

            menu();


            int wybor = SCANNER.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("[Wyświetl wszystkie książki] jeszcze nie zaimplementowana/e");
                    library.printAllBooks();
                    break;
                case 2:
                    System.out.println("[Dodaj książkę] jeszcze nie zaimplementowana/e");
                    break;
                case 3:
                    System.out.println("[Usuń książkę] podaj id");
                    long usunID =SCANNER.nextLong();
                    try {
                        library.deleteBookById(usunID);
                        System.out.println("udalo sie usunąć");
                    } catch (LibraryException libraryException) {
                        System.out.println(libraryException.getMessage());
                    }
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

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }
}
