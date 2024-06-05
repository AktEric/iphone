package serviçosIphone.Telefone;
import java.util.Random;
import java.util.Scanner;

public  class Telefone {
    Scanner sc = new Scanner(System.in);
    
    protected void validarSinal(){
        System.out.println("Validando sinal do Telefone");
        Random random = new Random();
        int conexao = random.nextInt(2);
        if (conexao == 2){
            System.out.println("Impossível realizar operação, sem sinal de Telefone");
            sc.close();
        }else 
            System.out.println("Sinal de Telefone OK");            
    }
    protected void validarCreditos(){
        Random random = new Random();
        int creditos = random.nextInt(25);
        if (creditos <= 2){
            System.out.println("Celular não tem crédito para ligação");
            sc.close();
        }else 
            System.out.println("Celular tem crédito para ligação");
       
    }
    public void ligar(){
        validarSinal();
        validarCreditos();
        System.out.println("Favor discar os 12 números do telefone para ligação: ");
        String numeroDiscado = sc.next();
        try{
            verificar(numeroDiscado);
        }catch (ParametrosInvalidosException e) {
                System.out.println("Desculpe, não consegui discar para o número: " + numeroDiscado + ". Verifique e tente novamente.");
        }
        
    }
    static void verificar(String numeroDiscado) throws ParametrosInvalidosException {
        if(numeroDiscado.length() != 11){
            System.out.println("Quantidade de números informados invalida");
            throw new ParametrosInvalidosException();
        }else
            System.out.println("Ligando para o número " + numeroDiscado);
    }

    public void atender(){
        validarSinal();
        System.out.println("o número 888 está ligando. Deseja atender?");
        String atender;
        atender = sc.next();
        switch(atender){
            case "Sim" -> System.out.println("Atendendo a ligação");
            case "nao" ->{
                String correioDeVoz;
                System.out.println("Deseja mandar para o correio de voz?");
                correioDeVoz = sc.next();
                if(correioDeVoz.equals("Sim")){
                    System.out.println("Começando correio de voz");                    
                }else
                    System.out.println("Entrando na chamada");

            }
        }


    }
}
