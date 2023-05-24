/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author ERICK
 */
public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7}
        };

//        recorrerColumna(0,matriz);
//        recorrerFila(0,matriz);
//        recorrerVecinasCoordenada(0,0,matriz);
//        recorrerDiagonalIzqToDer(0,0,matriz);
//        recorrerDiagonalDerToIzq(0,3,matriz);
    }

    public static void recorrerFila(int x, int[][] matriz) {
        if (matriz.length > x && x >= 0) {
            for (int i = 0; i < matriz[x].length; i++) {
                System.out.print(matriz[x][i] + "\t");
            }
        }

    }

    public static void recorrerColumna(int x, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length > x && x >= 0) {
                System.out.println(matriz[i][x]);
            }
        }
    }

    private static void recorrerVecinasCoordenada(int i, int j, int[][] matriz) {
        if ((i >= 0 && j >= 0) && matriz.length > i && matriz[i].length > j) {
            int[] minimoCoordenada = {i - 1, j - 1};
            int[] maximoCoordenada = {i + 1, j + 1};

            if (minimoCoordenada[0] < 0) {
                minimoCoordenada[0]++;
            }

            if (maximoCoordenada[0] >= matriz.length) {
                maximoCoordenada[0]--;
            }

            for (int k = minimoCoordenada[0]; k <= maximoCoordenada[0]; k++) {
                if (minimoCoordenada[1] < 0) {
                    minimoCoordenada[1]++;
                }
                if (maximoCoordenada[1] >= matriz[k].length) {
                    maximoCoordenada[1]--;
                }

                for (int l = minimoCoordenada[1]; l <= maximoCoordenada[1]; l++) {
                    if (k == i && j == l) {
                        System.out.print("X\t");
                    } else {
                        System.out.print(matriz[k][l] + "\t");
                    }
                }
                System.out.println();
            }

        }

    }

    private static void recorrerDiagonalIzqToDer(int i, int j, int[][] matriz) { //  "\"
        if ((i >= 0 && j >= 0) && matriz.length > i && matriz[i].length > j) {
            for (int k = i; k < matriz.length; k++) {
                for (int l = j; l < matriz[k].length; l++) {
                    if (k == i && j == l) {
                        System.out.print(matriz[k][l] + "\t"); //Resultado
                    }
                }
                i++;
                j++;
                System.out.println();
            }
        }
    }

    private static void recorrerDiagonalDerToIzq(int i, int j, int[][] matriz) { //  "/"
        if ((i >= 0 && j >= 0) && matriz.length > i && matriz[i].length > j) {
            for (int k = i; k < matriz.length; k++) {
                for (int l = j; l >= 0; l--) {
                    if (k == i && j == l) {
                        System.out.print(matriz[k][l] + "\t"); //Resultado
                    }
                }
                i++;
                j--;
                System.out.println();
            }
        }
    }
}

