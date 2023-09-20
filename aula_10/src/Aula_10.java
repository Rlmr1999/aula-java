
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 14930128609
 */
public class Aula_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    int escolha;
    
    do{
        System.out.println("MENU");
        System.out.println("1. Opção 1");
        System.out.println("2. Opção 2");
        System.out.println("3. Opção 3");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
        escolha = scanner.nextInt();
        
        switch (escolha){
            case 1:
               System.out.println("Você escolheu a opção 1.");
               break;
            case 2:
                System.out.println("Você escoolher a opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3.");
                break;
            case 0:
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
               
        }
        
        System.out.println();
        //linha em branco para separar as interações
     }while (escolha != 0);
    
    }
    
}