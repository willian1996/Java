/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import static java.lang.System.out;

/**
 *
 * @author cg3012123
 */
public class Exercicios extends Thread{
    private long inicio;
    private long fim;
    private long passo = 1_000_000;
    
    public Exercicios(int n){
        //TEM DE RECEBER O VALOR INICIAL
        inicio = (n * passo) + 1;
        fim = inicio + (passo - 1);
        
    }
    
    @Override
    public void run(){
        
        int i = 0;
        int contador = 0;
        
        //FAZ UM LAÇO PARA TESTAR UM MILHÃO
        while(i < passo){
            if(isPrimo(inicio+1)){
                contador++;
            }
            i++;
        }
        out.println("De "+ inicio + " até " + fim + " existem "+contador+ " primos");
        
        //TESTA OS VALORES
        //ARMAZENA TOTAL DE PRIMOS 
        //IMPRIME NA TELA 
    }
    
    //-------------------- DETERMINA SE É PRIMO ------------------------------------
    public boolean isPrimo(long n) {
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return n == 2 || n == 3 || n == 5 || n == 7;
        }
        long raiz = ((long) Math.sqrt(n)) + 1;
        long i = 11;
        while (i < raiz) {
            if (n % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
       for(int i=0; i<20; i++){
           Exercicios ex = new Exercicios(i);
           ex.start();
       
       }
       
        
        
        
    }
    
}
