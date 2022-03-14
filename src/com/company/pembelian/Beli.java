package com.company.pembelian;
import com.company.Main;
import java.util.Scanner;

public class Beli {

    public static void isi1() {
        int harga, jumlah, pilihan;

        Scanner aa = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("Masukan Pilihan: ");
        pilihan = aa.nextInt();

        if (pilihan ==4) {
            Main.menu();
        }

        System.out.print("Masukan Jumlah: ");
        jumlah = aa.nextInt();

        if (pilihan == 1 || pilihan == 2) {
            harga = 23000 * jumlah;
        } else {
            harga = 28000 * jumlah;
        }
        System.out.println("Total Harga: " + harga);
    }

    public static void isi2() {
        int harga, jumlah, pilihan;

        Scanner aa = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("Masukan Pilihan: ");
        pilihan = aa.nextInt();

        if (pilihan == 4) {
            Main.menu();
        }

        System.out.print("Masukan Jumlah: ");
        jumlah = aa.nextInt();

        if (pilihan == 1) {
            harga = 23000 * jumlah;
        } else if (pilihan == 2) {
            harga = 27000 * jumlah;
        } else {
            harga = 24000 * jumlah;
        }
        System.out.println("Total Harga: " + harga);
    }

    public static void isi3() {
        int harga, jumlah, pilihan;

        Scanner aa = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("Masukan Pilihan: ");
        pilihan = aa.nextInt();

        if (pilihan == 4) {
            Main.menu();
        }
        System.out.print("Masukan Jumlah: ");
        jumlah = aa.nextInt();

        if (pilihan == 1) {
            harga = 29000 * jumlah;
        } else {
            harga = 30000 * jumlah;
        }
        System.out.println("Total Harga: " + harga);
    }

    public static void ucapan() {
        int pilihan;
        Scanner aa = new Scanner(System.in);
        System.out.println("\n================================");
        System.out.println("Mohon ditunggu, pesanan segera datang!");
        System.out.print("Ingin memesan kembali? (1 = kembali, 2 = keluar) :  ");
        pilihan = (char) aa.nextInt();
        if (pilihan == 1) {
            Main.menu();
        }else{
            System.exit(0);
        }
    }
}
