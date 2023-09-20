/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

import static java.io.FileDescriptor.in;
import java.util.Scanner;



/**
 *
 * @author 14930128609
 */
public class Aula10 {
    public static void main(String[] args) {
        Scanner = new Scanner(Sytem,in);
        int escolha;
        do{
           System.out.println("new");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
             System.out.println("3. Opção 3");
              System.out.println("0. sair");
               System.out.println("escolha uma  Opção:");
               switch(escolha){
                   case 1:
                        System.out.println("você escolheu a opção 1:");
                        break;
                   case 2:
                        System.out.println("você escolheu a opção 2:");
                        break;
                   case 3: 
                        System.out.println("você escolheu a opção 3:");
                        break;
                   case 0:
                        System.out.println("saindo do programa.");
                        break;
                   default:
                       System.out.println("opção invalida");
                       break;
               }
                  System.out.println();
                  //separação de interações
        }while(escolha != 0);
        // TODO code application logic here
    }
    
}
