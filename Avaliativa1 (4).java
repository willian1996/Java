/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliativa1ex4;

import java.util.Scanner;

/**
 *
 * @author cg3012123
 * Faça um programa em Java para ler um vetor de 30 números. Após isto, ler mais um número
qualquer, calcular e escrever quantas vezes esse número aparece no vetor. 
 */
public class Avaliativa1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor1[] = new int[30];
        int i;
        int cont = 0;
        int n2 = 0;
        
        //ENTRADA DE DADOS 
        Scanner sc = new Scanner(System.in);
        for(i= 0; i<30; i++){
            System.out.println("Digite o valor: ");
            vetor1[i] = (int) sc.nextFloat();
        }
        System.out.println("Digite um número qualquer: ");
        n2 = sc.nextInt();
        
        //PROCESSAMENTO DE DADOS
        for(i=0; i<30; i++){
            if(vetor1[i] == n2){
                cont++;
            }
        }
        
        //SAÍDA DE DADOS
        System.out.println("Resultado é: "+ cont);
        
        
    }
    
}
