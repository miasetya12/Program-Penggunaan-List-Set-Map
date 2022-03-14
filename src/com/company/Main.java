package com.company;
import java.util.Scanner;
import com.company.boba.*;
import com.company.pembelian.*;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("\n==SELAMAT DATANG DI TOKO LUVIE BOBA==");
        System.out.println(" 1 D'Boba");
        System.out.println(" 2 Dalgona Series");
        System.out.println(" 3 Biscoff Series");
        System.out.println(" 4 ---Keluar---");
        System.out.print("Silahkan Masukan Pilihan Anda: ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.print("================================\n");
        if (pilihan==1) {
            Varian.ori();
            Beli.isi1();
            Beli.ucapan();
        }else if(pilihan==2){
            Varian.dalgona();
            Beli.isi2();
            Beli.ucapan();

        }else if(pilihan==3){
            Varian.biscoff();
            Beli.isi3();
            Beli.ucapan();
        }else if(pilihan==4){
            System.exit(0);
        }else{
            System.out.println("Pilihan yang anda masukan salah");
            System.out.println("Masukan pilihan yang benar \n");
            menu();
        }
    }
}
