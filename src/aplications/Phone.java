package aplications;

import aplications.Interface.InterfacePhone;

import java.util.Scanner;

public class Phone implements InterfacePhone {

    Scanner sc =  new Scanner(System.in);

    public void menu() {

            System.out.println("[1] => Ligar");
            System.out.println("[2] => Atender");
            System.out.println("[3] => Correio de Voz");

            int option = sc.nextInt();

            switch (option) {
                case 1: ligar();
                case 2: atender();
                case 3: iniciarCorrerioVoz();
            }
    }

    private void ligar() {
        System.out.println("Fazendo Ligação!");
    }

    private void atender() {
        System.out.println("Ligação Atendida!");
    }

    private void iniciarCorrerioVoz() {
        System.out.println("Correio de Voz Iniciado!");
    }
}
