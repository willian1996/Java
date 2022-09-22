/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author cg3012123
 */
public class Exercicio3 implements Runnable{
   private String nome;
   private int valor = 100; //atribuir o valor de 100 inicial
   private int rodadas = 0;
   
   public Exercicio3(String nome){ //receber o nome do jogador
       this.nome = nome;
   
   }
    
    @Override
    public void run(){
        
    try{
        for(int i = 0; i<rodadas; i++){
            int banca = (int)(Math.random()*21);
            if(banca %2 == 0){
               valor += banca;
            }else{
                valor -= banca;
            }
                    
            Thread.sleep(1000);
             
           }
            
    }catch(Exception e){
    
    
    }
    out.prinln(" A jogadora "+ nome + " Tem " + valor + " reais ");
        
        
         
        
        //fazer dez rodadas 
        //a cada rodada esperar um segundo
        //gerar um numero menor que 21
        //se for par = soma. se for impar = diminuí
        //imprime valor final 
    }

    
     public static void main(String args[]){
     
         
        //jagador 1
        Exercicio3 ex = new Exercicio3("Ana");
        Thread th1 = new Thread(ex1);
        th.start();
        
        //jagador 2
        Exercicio3 ex = new Exercicio3("Bianca");
        Thread th2 = new Thread(ex2);
        th.start();

        //jagador 3
        Exercicio3 ex = new Exercicio3("Carla");
        Thread th3 = new Thread(ex3);
        th.start();

        //jagador 4
        Exercicio3 ex = new Exercicio3("Denise");
        Thread th4 = new Thread(ex4);
        th.start();

        //jagador 5
        Exercicio3 ex = new Exercicio3("Elaine");
        Thread th5 = new Thread(ex5);
        th.start();
        
       
    }
    
}
