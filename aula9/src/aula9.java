
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 14930128609
 */
public class aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
        System.out.println("Informe um número inteiro:");
        int num = ler.nextInt();
        
        if(num > 0){
            System.out.println("Positivo");
        }else if(num < 0){
            System.out.println("Negativo");
        }else{
        System.out.println("Igual");
    }
    
}
}