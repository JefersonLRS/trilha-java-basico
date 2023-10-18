package aplications;

import aplications.Interface.InterfaceBrowser;

import java.util.Scanner;

public class Browser implements InterfaceBrowser {

    Scanner sc = new Scanner(System.in);

    public void menu(){

        System.out.println("[1] => Exibir Página");
        System.out.println("[2] => Nova Aba");
        System.out.println("[3] => Atualizar página");

        int option = sc.nextInt();

        switch (option) {
            case 1: exibirPagina();
            case 2: adicionarNovaAba();
            case 3: atualizarPagina();
        }
    }

    public void exibirPagina(){
        System.out.println("Abrindo navegador!");
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova Aba!");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página!");
    }
}
