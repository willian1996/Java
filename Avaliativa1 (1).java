/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliativa1ex1;
import java.util.Scanner;

/**
 *
 * @author cg3012123
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
    do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do
    distribuidor seja de 28% e os impostos de 45%, escrever um programa em Java para ler o
    custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. 
 */
public class Avaliativa1Ex1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vPercDistribuidor = 28;
        int vPercImpostos = 45;
        float vCustoFabrica, vValorDistribuidor, vValorImposto, vCustoConsumidor;
        
        //ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de custo de fábrica: ");
        vCustoFabrica = sc.nextFloat();
        
        //PEOCESSAMENTO DE DADOS
        vValorDistribuidor = vCustoFabrica + (vCustoFabrica * vPercDistribuidor / 100);
        vValorImposto = vCustoFabrica + (vCustoFabrica * vPercImpostos / 100);
        vCustoConsumidor = vCustoFabrica + vValorDistribuidor + vValorImposto;
        
        //SAÍDA DE DADOS
        System.out.println("O custo ao consumidor é: " + vCustoConsumidor);
        
    }
    
}
