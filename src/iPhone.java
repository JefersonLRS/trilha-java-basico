import aplications.Browser;
import aplications.Music;
import aplications.Phone;

import java.util.Scanner;

public class iPhone {

    static Phone phone = new Phone();
    static Music music = new Music();
    static Browser browser = new Browser();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {

        System.out.println("[1] => Telefone");
        System.out.println("[2] => Musica");
        System.out.println("[3] => Navegador de Internet");
        System.out.println("[0] => Desligar");

        int option = sc.nextInt();

        switch (option) {
            case 1 -> phone.menu();
            case 2 -> music.menu();
            case 3 -> browser.menu();
            case 0 -> System.out.println("Desligando...");
        }

    }
}
