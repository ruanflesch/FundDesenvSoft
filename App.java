import java.util.Scanner;
public class App{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro(10, "preto", "chevrolet", 38000.00, 125);
        Carro carro2 = new Carro(20, "azul", "fiat", 52000.00, 185);


        System.out.println("Digite o código do veículo que deseja cadastrar:");
        int codigo = sc.nextInt();
        System.out.println("Digite a cor do veículo:");
        String cor = sc.nextLine();
        System.out.println("Digite a marca do veículo:");
        String marca = sc.nextLine();
        System.out.println("Digite o preço do veículo:");
        double valor = sc.nextDouble();
        System.out.println("Digite as cilindradas do veículo:");
        int cilindradas = sc.nextInt();

        Carro carro3 = new Carro(codigo, cor, marca, valor, cilindradas);
        

        System.out.println("Carros: " + carro1 + carro2);
        
        sc.close();
        
    }
}