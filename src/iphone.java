import java.util.Scanner;
import serviçosIphone.Telefone.*;
import serviçosIphone.navegadorInternet.*;
import serviçosIphone.playerdeMusica.Player;

public class iphone {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String opcao;
        System.out.println("Selecione a opção desejada");
        opcao = sc.next();

        switch(opcao){
            case "navegador":
                Safari navegador = new Safari();
                navegador.exibirPagina();
                navegador.adicionarNovaAba();
                navegador.comandosNavegador();
            case "telefone":
                Telefone telefone = new Telefone();
                telefone.ligar();
                telefone.atender();
            case "Player":
            Player Player = new Player();
            Player.selecionarMusica();
            Player.volume();
            Player.musicaTocando();
        }


        
        sc.close();
    }


}
