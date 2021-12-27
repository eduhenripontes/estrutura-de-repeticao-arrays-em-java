package br.com.dio.exercicios.loop;

import java.util.Scanner;

//Programa que mostra nome e idade de um aluno//

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }
        System.out.println("Continua aqui...");
    }
}
