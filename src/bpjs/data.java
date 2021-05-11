/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpjs;

import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class data {

    //overload
    void identitas() {
        System.out.println("===ISIKAN DATA DIRI ANDA===");
        System.out.println("-----------------------------------------------");
    }
    //mendefinisikan variable
    String nama;
    String TTL;
    String alamat;
    String noHP;
    String NIK;
    //menerapkan method getter dan setter
    void setNama(String newNama){
        this.nama = newNama;
    }
    public String getNama(){
        return nama;
    }
    void setTTL(String newTTL){
        this.TTL = newTTL;
    }
    public String getTTL(){
        return TTL;
    }
    void setAlamat(String newAlamat){
        this.alamat = newAlamat;
    }
    public String getAlamat(){
        return alamat;
    }
    //overload
    void identitas(String NIK, String noHP) {
        System.out.println("NIK\t : " + NIK);
        System.out.println("No HP\t : " + noHP);
        System.out.println("-----------------------------------------------");
    }

    //override
    void iuran() {
        Scanner input = new Scanner(System.in); //menginisialisasikan objek scanner
        int kelas1 = 34000, kelas2 = 56000, kelas3 = 72000; //mendefinisikan variable
        System.out.println("==<<Pilih kategori kelas BPJS Anda>>==");
        System.out.println("-----------------------------------------------");
        System.out.println("* Kelas 1 = " + kelas1 + "/bulan");
        System.out.println("* Kelas 2 = " + kelas2 + "/bulan");
        System.out.println("* Kelas 3 = " + kelas3 + "/bulan");
        System.out.println("-----------------------------------------------");
        System.out.print("Pilihan anda : ");
        int kelas = input.nextInt();    //pengisian variable oleh user
        System.out.println("-----------------------------------------------");
        //pilihan kondisi untuk user
        if (kelas == 1) {
            System.out.println("Anda memilih kelas 1 BPJS dengan biaya 34000/bulan");
            System.out.println("-----------------------------------------------");
            System.out.println("Masukkan nominal uang iuran anda : ");
            int iuran = input.nextInt();
            if (iuran == kelas1) {
                System.out.println("-----------------------------------------------");
                System.out.println("Nominal iuran BPJS kelas 1 cukup");
                System.out.println("-----------------------------------------------");
                System.out.println("===TERIMAKASIH===");
            } else if (iuran >= kelas1) {
                int kembalian = iuran - kelas1;
                System.out.println("-----------------------------------------------");
                System.out.println("Kembalian Anda : " + kembalian);
                System.out.println("-----------------------------------------------");
                System.out.println("===TERIMAKASIH===");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Nominal iuran BPJS kelas 1 kurang");
            }
        } else if (kelas == 2) {
            System.out.println("Anda memilih kelas 2 BPJS dengan biaya 56000/bulan");
            System.out.println("-----------------------------------------------");
            System.out.println("Masukkan nominal uang iuran anda : ");
            int iuran = input.nextInt();
            if (iuran == kelas1) {
                System.out.println("-----------------------------------------------");
                System.out.println("Nominal iuran BPJS kelas 1 cukup");
                System.out.println("-----------------------------------------------");
                System.out.println("===TERIMAKASIH===");
            } else if (iuran >= kelas2) {
                int kembalian = iuran - kelas2;
                System.out.println("-----------------------------------------------");
                System.out.println("Kembalian Anda : " + kembalian);
                System.out.println("===TERIMAKASIH===");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Nominal iuran BPJS kelas 1 kurang");
            }
        } else if (kelas == 3) {
            System.out.println("Anda memilih kelas 3 BPJS dengan biaya 72000/bulan");
            System.out.println("-----------------------------------------------");
            System.out.println("Masukkan nominal uang iuran anda : ");
            int iuran = input.nextInt();
            if (iuran == kelas3) {
                System.out.println("-----------------------------------------------");
                System.out.println("Nominal iuran BPJS kelas 1 cukup");
                System.out.println("-----------------------------------------------");
                System.out.println("===TERIMAKASIH===");
            } else if (iuran >= kelas3) {
                int kembalian = iuran - kelas3;
                System.out.println("-----------------------------------------------");
                System.out.println("Kembalian Anda : " + kembalian);
                System.out.println("-----------------------------------------------");
                System.out.println("===TERIMAKASIH===");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Nominal iuran BPJS kelas 1 kurang");
            }
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Angka yang Anda masukkan tidak valid");
        }
    }
}
