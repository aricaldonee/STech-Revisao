/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24agosto;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* IMC = peso x (altura x altura) */
        
        Scanner ler = new Scanner(System.in);
        
        float peso, altura, imc;
        String nome; 
        
        System.out.println(" ====== Calculadora IMC: ====== ");
        System.out.println("");
        
        System.out.print("Informe seu nome: ");
        nome = ler.nextLine();
        
        
        System.out.print("Informe seu peso: ");
        peso = ler.nextFloat();
        System.out.print("Informe sua altura: ");
        altura = ler.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println(" ====== Resultado com If: ====== ");
        
        if (imc < 18.5) {
            System.out.println( nome + ", seu IMC é: " + imc +   " muito magro! ");
          
        } else if (imc <= 24.9) {
            System.out.println(nome + ", seu IMC é: " + imc +   " normal! ");
            
        }else if (imc <= 30) {
            System.out.println(nome + ", seu IMC é: " + imc +   " acima do peso! ");
            
        }else {
            System.out.println("Seu IMC é: " + imc +   " obesidade! ");
        }
      
    }
    
}
