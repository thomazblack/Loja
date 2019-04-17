
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Nome: "); 
        carro01.nome = scan.next();
        
        System.out.print("Marca: ");
        carro01.marca = scan.next();
        
        System.out.print("Cor: ");
        carro01.cor = scan.next();
        
        System.out.print("Fabricacao: ");
        carro01.fabricacao = scan.next ();
        
        System.out.print ("Lagura: ");
        carro01.largura = scan.next ();
        
        System.out.print ("Peso: ");
        carro01.peso = scan.next ();
        
        
        System.out.println("Nome: " + carro01.nome);
        System.out.println("Marca: " + carro01.marca);
        System.out.println("Cor: " + carro01.cor);
        System.out.println("Fabricacao: " + carro01.fabricacao);
        System.out.println("Largura: " + carro01.largura);
        System.out.println("Peso: " + carro01.peso);

    }
}
