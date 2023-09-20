/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_8;

/**
 *
 * @author 14930128609
 */
public class Aula_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 10;
        int b = 10;
        
        System.out.println(a != b);
        System.out.println(a > b && a < b);
        
        if(a > b){
            System.out.println("Maior");                           
        }else if(a < b) {
            System.out.println("Menor");
        }else{
            System.out.println("Igual");
        }
    }
}