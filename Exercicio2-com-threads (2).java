/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import static java.lang.System.out;

/**
 *
 * @author cg3012123
 */
public class Exercicio2 implements Runnable{
   
    
    @Override
    public void run(){
        
        boolean flag = false;//variavel liga e deliga
        while(flag == false){
            long n = (long)(Math.random()* Long.MAX_VALUE);//gerar um numero primo
            if(n %2 == 0){//se for par, incrementa
                n++;
            }
            if(isPrimo(n)){//testa se é primo
                out.println(n + " é primo. ");//exibe na tela
                flag = true;
            }
        
        }
        
        
        
        
        
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
    
    public static void main(String args[]){
        for(int i=0 ; i < 20; i++){
            Exercicio2 ex = new Exercicio2();
            Thread th = new Thread(ex);
            th.start();
            
        }
    }
    
}
