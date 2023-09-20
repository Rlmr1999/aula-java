/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 14930128609
 */
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Imprimindo o valor de Pi e da constante de euler, o 'e' dos números exponenciais: \n");
        System.out.println("O valor de pi é: " + Math.PI);
        System.out.println("O valor de E é: " + Math.E + "\n\n");
        System.out.println("=*30");
        
        System.out.println("Exponencial e potenciação na classe Math:\n");
        System.out.println("'e' elevado ao quadrado = "+ Math.exp(2));
        System.out.println("2 elevado ao cubo = " + Math.pow(2, 3)+ "\n\n");
        
        System.out.println("Calculando a Raiz quadrada em Java através da classe Math:\n");
        System.out.println("A raiz quadrada de Pi é = "+ Math.sqrt( Math.PI )+"\n\n" );
        
        System.out.println("Calculando logaritmos naturais em Java através da classe Math:\n");
        System.out.println("O logaritmo natural de 10 é = "+ Math.log(10) );
        System.out.println("O logaritmo natural de 'e' é = "+ Math.log( Math.E ));
    }
}