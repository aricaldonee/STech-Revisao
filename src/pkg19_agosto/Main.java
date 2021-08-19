/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_agosto;

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

        Scanner ler = new Scanner(System.in);//usar no console

        boolean verifica;//var booleana | true or false | 0 or 1

        int num1;//var do tipo inteiro 11 posições

        short num2;//var = smalint inteiro pequeno 4 posições

        long num3;//var = bigint inteiro grande | contador do youtube 

        double num4;// var = decimal, numeric com casas decimais

        float num5;// var = com casas decimais é menor que o double

        byte b;//num inteiro valor maximo 127

        String texto;//aceita tudo em formato texto
        
        String textoCurto;

        char sexo;
        
        
        System.out.println("Informe um numero inteiro: ");
        num1 = ler.nextInt();
        
        System.out.println("Informe um número inteiro até 127: ");
        b = ler.nextByte();
        
        System.out.println("Informe um número inteiro médio: ");
        num2 = ler.nextShort();
        
        System.out.println("Informe o primeiro nome da sua mãe: ");
        textoCurto = ler.next();
        
        System.out.println("Informe seu sexo: ");
        sexo = ler.next().charAt(0);
        
        
        System.out.println(" Impressão ");
        
        System.out.println("Num1: " + num1);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + num2);
        System.out.println("Texto curto: " + textoCurto);
        System.out.println(" Sexo: " + sexo);
        
        

       
    }
