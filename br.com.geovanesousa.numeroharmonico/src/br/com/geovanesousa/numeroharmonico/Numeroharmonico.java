package br.com.geovanesousa.numeroharmonico;

import java.util.Scanner;

public class Numeroharmonico {

    public static void main(String[] args) {
        /*
         h <- 0
         leia n
         para k variando de n até 1 faça
         h <- h + 1/k
         apresente h
         */
        
        Scanner leitorDeTeclado = new Scanner(System.in);
        double h = 0.0;
        int k, n;
        
        System.out.println("Digite um número inteiro:");
        n = leitorDeTeclado.nextInt();
        
        for(k=n;k>=1;k=k-1){
            h = h + 1.0/k;
        }
        
        System.out.println("H = "+h);
        
    }

}
