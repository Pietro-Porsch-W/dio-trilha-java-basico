import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        //como não foi pedido para verificar espaços, ou dar alguma tratativa extra, apenas realizei da forma mais simples possivel
        //Mas tenha em mente que o correto é ter uma tratativa completa para espaços e retorno caso não esteja contratado, assim como
        //Por dentro de um try catch para possiveis erros.
        
        for (String part : partes) {
            if ( !servico.equalsIgnoreCase(nomeCliente) && servico.equals(part) ) { 
                contratado = true;
                break;
            }
        }
        if (contratado) System.out.println("Sim");
        else System.out.println("Nao");
        scanner.close();
    }
}
