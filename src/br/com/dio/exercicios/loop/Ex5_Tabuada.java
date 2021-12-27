package br.com.dio.exercicios.loop;

/*Programa para gerar tabuada de um número escolhido
pelo usuário entre 1 e 10
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        System.out.println("Você quer ver a tabuada de qual número? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for(int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
