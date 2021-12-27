package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*Facer um programa que leia 5 numeros e
em seguida informe qual o maior e
a media deles
 */
public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("O maior número informado foi: " + maior);
        System.out.println("A média entre os números informados é: " + soma/5);
    }
}
