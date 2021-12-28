package br.com.dio.exercicios.arrays;
/*Criar um vetor de 6 numeros e
mostrar na ordem inversa
 */
public class OrdemInversa {
    public static void main(String[] args) {
        //lembrar que o vetor começa na posição zero
        int[] vetor = {-6, -8, -12, 15, 4, 87};

        System.out.println("vetor: ");
        int count = 0;
        while(count <= (vetor.length-1)){
            System.out.print(vetor[count] + " ");
            count++;

        }

        System.out.println("\nvetor: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
