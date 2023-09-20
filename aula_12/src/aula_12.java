
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 14930128609
 */
public class aula_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
            System.out.println("Informe sua idade:");
            int idade = ler.nextInt();
            
            if(idade < 18){
                System.out.println("Você é menor de idade!");
            }else if (idade >= 18){
                System.out.println("Você é maior de idade!");
            }
            
            
            
    }
    
}
