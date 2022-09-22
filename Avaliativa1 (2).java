/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliativa1ex2;

import java.util.Scanner;

/**
 *
 * @author cg3012123
 * Escreva um programa em Java que leia o nome de dois times e o número de gols marcados
    na partida (para cada time). O programa deverá escrever o nome do time vencedor. Caso
    não haja vencedor deverá ser exibida uma mensagem com a palavra EMPATE. 
 */
public class Avaliativa1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int golstime1;
        int golstime2;
        String nometimel;
        String nometime2;
        
        Scanner sc = new Scanner(System.in);
        
        //ENTRADA DE DADOS
        System.out.println("Digite o nome do time 1");
        nometimel = sc.nextLine();
        System.out.println("Digite o nome do time 2");
        nometime2 = sc.nextLine();
        System.out.println("Digite o numero de gols feitos pelo "+ nometimel);
        golstime1 = sc.nextInt();
        System.out.println("Digite o numero de gols feitos pelo "+ nometime2);
        golstime2 = sc.nextInt();
        
        //PROCESSAMENTO E SAÍDA DE DADOS
        if(golstime1 > golstime2){
            System.out.println(nometimel + " ganhou!");
        }else if(golstime2 > golstime1){
            System.out.println(nometime2 + " ganhou!");
        }else{
            System.out.println("Empate!");
        }

    }
    
}
