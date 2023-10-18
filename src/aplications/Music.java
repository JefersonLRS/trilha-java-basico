package aplications;

import aplications.Interface.InterfaceMusic;

import java.util.Scanner;

public class Music implements InterfaceMusic {

    Scanner sc = new Scanner(System.in);

    public void menu(){

        System.out.println("[1] => Tocar Músíca");
        System.out.println("[2] => Pausar Músíca");
        System.out.println("[3] => Selecionar Músíca");

        int option = sc.nextInt();

        switch (option) {
            case 1: tocar();
            case 2: pausar();
            case 3:
                System.out.println("Digite a música que você quer ouvir");
                String musica = sc.next();
                selecionarMusica(musica);
        }

    }

    public void tocar(){
        System.out.println("Tocando música!");
    }
    public void pausar(){
        System.out.println("Música pausada!");
    }
    public void selecionarMusica(String musica){
        System.out.println("Tocando a música: " + musica);
    }

}
