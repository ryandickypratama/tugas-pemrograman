package TUGAS2;

import java.util.ArrayList;
import java.util.Scanner;
public class DATAMAHASISWA {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> NIM = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {

            System.out.println("\nprograman Data mahasiswa");
            System.out.println("=======================");
            System.out.println("1.Tambahkan");
            System.out.println("2.Tampilakan");
            System.out.println("3.Cari");
            System.out.println("4.Hapus");
            System.out.println("5.Keluar");
            System.out.print("pilih menu:");
            pilihan = input.nextInt();

            if (pilihan == 1 ) {
                System.out.print("masukan nama : ");
                String nm = input.next();
                nama.add(nm);

                System.out.print("masukan NIM : ");
                String nim = input.next();
                NIM.add(nim);

                System.out.print("masukan Alamat : ");
                String alm = input.next();
                alamat.add(alm);

            }else if (pilihan == 2) {
                System.out.println("Data mahasiswa");
                System.out.println("=============");

                for (int i = 0; i < nama.size(); i++) {
                    System.out.println(i+1+"."+nama.get(i));
                }
                System.out.println(" tekan 3 untuk cari data:");
            } else if (pilihan==3) {
                System.out.print(" Masukan Data :");
                int CARI= input.nextInt();
                if (CARI==1){
                    System.out.println(" 1. Masukan Nama:"+nama.get(0));
                    System.out.println(" 2. Masukan Nim"+ NIM.get(0));
                    System.out.println(" 3. Masukan Alamat"+ alamat.get(0));
                }
                if (CARI==2){
                    System.out.println(" 1. Masukan Nama:"+nama.get(1));
                    System.out.println(" 2. Masukan Nim"+ NIM.get(1));
                    System.out.println(" 3. Masukan Alamat"+ alamat.get(1));
                }
            } else if (pilihan==4) {
                System.out.println(" Masukan nama yang akan di hapus:");
                String nm = input.next();
                nama.remove(nm);
            } else if (pilihan==5) {
                System.out.println(" terima kasih");

            }
        } while (pilihan !=5);

    }
}