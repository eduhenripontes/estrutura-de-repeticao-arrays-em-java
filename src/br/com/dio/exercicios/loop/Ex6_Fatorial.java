package br.com.dio.exercicios.loop;

/*Calcular o fatorial de um número
informado pelo usuário
 */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número que deseja calcular o fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for(int i = fatorial ; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;

        }
        System.out.println(multiplicacao);
    }

}
