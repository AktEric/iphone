package serviçosIphone.playerdeMusica;

import java.util.Scanner;

public class Player {
     Scanner sc = new Scanner(System.in);
    public void selecionarMusica (){
        System.out.println("Selecione uma música");
        String nextMusica = sc.next();
        switch (nextMusica){
            case "1" -> System.out.println("Tocando agora: Djonga - Penumbra");
            case "2" -> System.out.println("Tocando agora: Djonga - Solto");
            case "3" -> System.out.println("Tocando agora: BK - Amanhecer");
            case "4" -> System.out.println("Tocando agora: Djonga - Da Lua");
            case "5" -> System.out.println("Tocando agora: KayBlack - Preferida");
        }
        sc.close();
    }
    public void volume (){
        int volume = 5;
        System.out.println("Deseja aumentar ou diminuir o volume?");
        String opcao = sc.next();
        if(opcao.equals("aumentar")){
            System.out.println("aumentando o volume para: " + volume);
            volume++;
        }else if(opcao.equals("diminuir")){
            volume--;
            System.out.println("diminuindo volume para: " + volume);
        }
        sc.close();
    }
    public void musicaTocando(){
        System.out.println("Deseja passar, voltar ou pausar a música?");
        String opcao = sc.next();
        if(opcao.equals("Passar")){
            System.out.println("Passando a música");
        }else if(opcao.equals("Voltar")){
            System.out.println("Voltando para música anterior");
        }else if(opcao.equals("Pausar")){
            System.out.println("Pausando a música");
        }
}
}
