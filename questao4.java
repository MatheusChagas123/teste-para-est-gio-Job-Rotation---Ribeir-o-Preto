import java.util.Scanner;

public class questao4 {
 
    public static void main(String[] args) {
        // distância entre as cidades em km
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a distância entre as cidades em Km: ");
        int distancia = input.nextInt();     
        
        // velocidade do carro em km/h
       
        System.out.print("Digite a velocidade do carro em km/h: ");
        int velCarro = input.nextInt();
        
        // velocidade do caminhão em km/h
        System.out.print("Digite a velocidade do caminhão km/h: ");
        int velCaminhao = input.nextInt();
        
        // tempo em horas para o encontro
        double tempo = (double)distancia / (velCarro + velCaminhao);
        
        // distância percorrida pelo carro até o encontro em km
        double distCarro = tempo * velCarro;
        
        // distância percorrida pelo caminhão até o encontro em km
        double distCaminhao = tempo * velCaminhao;
        
        // distância restante do carro até Ribeirão Preto em km
        double distRestanteCarro = distancia - distCarro;
        
        // distância restante do caminhão até Franca em km
        double distRestanteCaminhao = distancia - distCaminhao;
        
        // tempo em minutos para passar em cada pedágio
        System.out.print("Digite o tempo do pedágio em minutos: ");
        int tempoPedagio = input.nextInt();
        
        // distância percorrida pelo caminhão nos pedágios em km
        double distPedagioCaminhao = (tempoPedagio / 60.0) * velCaminhao;
        
        // distância restante do caminhão até Franca após os pedágios em km
        double distRestanteCaminhaoPedagio = distRestanteCaminhao - distPedagioCaminhao;
        
        // verifica qual veículo está mais próximo de Ribeirão Preto
        if (distRestanteCarro < distRestanteCaminhaoPedagio) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else if (distRestanteCaminhaoPedagio < distRestanteCarro) {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O carro e o caminhão estão a mesma distância de Ribeirão Preto.");
        }
    }
}


