package com.akbar;
//Ryan Dicky Pratama
//22116013
public class Main {
    public static void tampilkanMatriks(int [][] matriks) {
        for (int j=0; j < matriks.length; j++) {
            for (int k=0; k < matriks.length; k++) {
                System.out.print(matriks[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int [][] jumlahkanMatriks(int [][] matriksA, int [][] matriksB) throws Exception {
        if (matriksA.length != matriksB.length)
            throw new Exception("Dimensi matriksA dan matriksB tidak sama");

        int [][] hasil = new int[matriksA.length][matriksA.length];

        for (int j=0; j < matriksA.length; j++) {
            for (int k=0; k < matriksB.length; k++) {
                hasil[j][k] = matriksA[j][k] + matriksB[j][k];
            }
        }

        return hasil;
    }

    public static int [][] perkalianMatriks(int [][] matriksA, int [][] matriksB ) {
        int [][] hasil = new int[matriksA.length][matriksA.length];
        // tambahkan kode di sini
         for (int j=0; j < matriksA.length; j++) {
             for (int k=0; k < matriksB.length; k++) {
                 hasil[j][k] = matriksA[j][k] * matriksB[j][k];
             }
         }
        return  hasil;
    }


    public static void main(String[] args) throws Exception {
        int [][] matriksA = new int[2][2];
        matriksA[0][0] = 7;
        matriksA[0][1] = 1;
        matriksA[1][0] = 4;
        matriksA[1][1] = 8;

        int [][] matriksB = new int[2][2];
        matriksB[0][0] = 5;
        matriksB[0][1] = 2;
        matriksB[1][0] = 8;
        matriksB[1][1] = 3;

        System.out.println("Matriks A");
        tampilkanMatriks(matriksA);
        System.out.println();
        System.out.println("Matriks B");
        tampilkanMatriks(matriksB);

        System.out.println();
        System.out.println("Hasil penjumlahan matriks");
        tampilkanMatriks(
                jumlahkanMatriks(matriksA, matriksB)
        );

        System.out.println();
        System.out.println("Hasil perkalian matriks");
        tampilkanMatriks(
                perkalianMatriks(matriksA, matriksB)
        );

    }
}
