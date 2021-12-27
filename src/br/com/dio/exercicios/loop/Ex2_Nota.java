package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*Fazer um programa que peça uma nota entre 0 e 10 e
mostrar mensagem se valor for inválido.
E pede nota ate que usuário bote valor valido
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Favor, informar uma nota válida");
            nota = scan.nextInt();
        }
    }
}
