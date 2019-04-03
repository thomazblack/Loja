
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print(" nome "); 
        carro01.nome = scan.next();
        
        System.out.print(" marca ");
        carro01.marca = scan.next();
        
        System.out.print(" cor ");
        carro01.cor = scan.next();
        
        System.out.print("fabricacao");
        carro01.fabricacao = scan.next ();
        
        System.out.print ("lagura");
        carro01.largura = scan.next ();
        
        System.out.print ("peso");
        carro01.largura = scan.next ();
        
        
        
//     carro01.nome  =  "Palio";
//     carro01.marca =  "Fiat";
//     carro01.cor   =  "Branco";
//     carro01.fabricacao = "2016";
//     carro01.largura = "1,63 MM";
//     carro01.peso = "940 Kg";

//    carro02.nome = "Spin";
//    carro02.marca = "Chevrolet";
//    carro02.cor = "Azul";
//    carro02.fabricacao = "2019";
//    carro02.largura = "3.50 MM";
//    carro02.peso = "1.200 kg

        System.out.println("Nome" + carro01.nome);
        System.out.println("Nome" + carro02.nome);
    }
}
