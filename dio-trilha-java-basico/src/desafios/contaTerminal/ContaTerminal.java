import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        System.out.println("Hello, World!");
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Seja bem vindo ao nosso programa de criação de contas bancarias!\nPor favor, informe primeiramente o seu nome");
        String nome = tec.nextLine();
        
        System.out.println("Por favor, informe qual a sua agencia:");
        String agencia = tec.nextLine();
        
        System.out.println("Por favor, informe qual o número da conta:");
        int numero = tec.nextInt();

        System.out.println("E por ultimo, informe seu saldo:");
        float saldo = tec.nextFloat();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
        tec.close();   
    }
}
