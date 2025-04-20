package binarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        // preenche o vetor com valores crescentes
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nInsira o valor a ser buscado: ");
        int valorBuscado = sc.nextInt();

        System.out.println("Encontrou?  " + BinarySearch.find(vetor, valorBuscado));
    }
}
