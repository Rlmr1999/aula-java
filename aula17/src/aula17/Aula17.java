/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula17;

/**
 *
 * @author 14930128609
 */
public class Aula17 {
 public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int n;
       
        System.out.println("Digite um valor inteiro:");
        n = ler.nextInt();
        
        for(int i = 2; i < n; i++){
            System.out.println(i);
        }
    }
    
}
