/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 14930128609
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Concatenação de Strings
        String saudacao = "Olá";
        String nome = "Maria";
        String mensagem = saudacao + ", " + nome + "!";
        
        System.out.println(mensagem);
        
        //Tamanho de uma String
        String texto = "Hello, World!";
        int tamanho = texto.length(); 
        
        System.out.println(tamanho);
        
        //Transformação de uma String em letras Maiusculas e Minusculas
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   
        System.out.println(txt.toLowerCase());   
    }
}