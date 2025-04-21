package dataStructureAndAlgorithms.searchs.binarySearch;

public class BinarySearch {
    public static boolean find(int[] vetor, int value) {
        int start = 0;
        int last = vetor.length - 1;
        int middle = 0;

        int contadorIteracoes = 0;

        while (start <= last) {
            contadorIteracoes++;
            middle = (int) ((start + last) / 2);

            if (value == vetor[middle]) {
                System.out.println("Quantidade de iterações: " + contadorIteracoes);
                return true;
            }

            if (vetor[middle] > value) {
                last = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        System.out.println("Quantidade de iterações: " + contadorIteracoes);
        return false;
    }
}
