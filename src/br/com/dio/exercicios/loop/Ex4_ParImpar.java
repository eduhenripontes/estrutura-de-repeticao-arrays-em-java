package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*Fazer um programa que peça N numeros inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares
 */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantos números você quer testar? ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;

        } while(count < quantNumeros);

        System.out.println("Total de números pares: " + quantPares);
        System.out.println("Total de números ímpares: " + quantImpares);
    }
}
