/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliativa1ex3;
import java.util.Scanner;
/**
 *
 * @author cg3012123
 * Faça um programa em Java para ler o código, o preço e a quantidade em estoque de 15
    produtos. Seu programa deve calcular e escrever:
    - o maior preço lido;
    - a média aritmética dos preços dos produtos;
    - o valor total de mercadorias em estoque.
 */
public class Avaliativa1Ex3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIAVEIS
        int n = 0;
        int i;
        int y = 0;
        int vetor[] = new int[15] ;
        float preco;
        float media = 0;
        float x;
        float maior = 0;
        
        
        //ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        for(i=0; i <15; i++){
            System.out.println("Digite os precos: R$");
            vetor[n] = (int) sc.nextFloat();
            n++; 
        }
        
        //PROCESSAMENTO DE DADOS
        for(i=0; i<15; i++){
            if(vetor[y] >= maior){
                maior = vetor[y];
            }
            x = (media + vetor[y]);
            media = x;
            y++;
        }
        media = media / 15;
        
        //SAÍDA DE DADOS
        System.out.printf("Media de preco = R$ %.2f e Maior preco = R$ %.2f ", media, maior);
    }
    
}
