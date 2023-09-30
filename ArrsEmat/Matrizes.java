package ArrsEmat;

import java.util.Arrays;

public class Matrizes {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3}, {4, 6}, {7, 8, 9,5}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int vet[] = {5,1, 6,2, 4, 3};
        for (int i=0; i<vet.length; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();
        Arrays.sort(vet);
        for (int i=0; i<vet.length; i++){
            System.out.print(vet[i] + " ");
        }
    }
}
