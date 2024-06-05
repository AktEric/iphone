package serviçosIphone.navegadorInternet;
import java.util.Random;
import java.util.Scanner;

public class Safari implements  navegador{
    Scanner sc = new Scanner(System.in);
    
    protected void validarConexao(){
        System.out.println("Validando conexão de internet");
        Random random = new Random();
        int conexao = random.nextInt(2);
        if (conexao != 2){
            System.out.println("Está conectado na internet");
        }else 
            System.out.println("Não está conectado a internet");

    }
    @Override
    public void exibirPagina(){
        validarConexao();
        System.out.println("Exibindo pagina selecionada");
    }
    
    @Override
    public void adicionarNovaAba() {
        String novaaba;
        System.out.println("Deseja abrir outra aba?");
        novaaba = sc.next();
        if (novaaba.equals("sim")){
            System.out.println("Adicionando nova aba");
        }else
            System.out.println("Comando incompreendido");
        sc.close();
    }
    @Override
    public void comandosNavegador() {
        String atualizar;
        atualizar = sc.next();
        switch (atualizar){
            case "F3" -> System.out.println("Abrindo Função de busca de pagina");
            case "F5" -> System.out.println("Atualizando pagina");
            case "F11"-> System.out.println("Alterando para tela cheia");
        }
        sc.close();
        
    }
    
}
