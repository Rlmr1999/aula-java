/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author 14930128609
 */
public class Aula12 {
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
