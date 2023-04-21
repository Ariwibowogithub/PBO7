package karyawan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan tetap
        System.out.print("Masukkan nama karyawan tetap: ");
        String namaTetap = input.nextLine();
        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnakTetap = input.nextInt();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        KaryawanTetap karyawanTetap = new KaryawanTetap(namaTetap, jumlahAnakTetap, gajiPokok);
        System.out.println("Total gaji karyawan tetap " + karyawanTetap.nama + " adalah " + karyawanTetap.totalGaji());

        input.nextLine(); // Membuang karakter newline pada buffer

        // Input data karyawan kontrak
        System.out.print("Masukkan nama karyawan kontrak: ");
        String namaKontrak = input.nextLine();
        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnakKontrak = input.nextInt();
        System.out.print("Masukkan upah harian: ");
        double upahHarian = input.nextDouble();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();

        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(namaKontrak, jumlahAnakKontrak, upahHarian, jumlahHari);
        System.out.println(
                "Total gaji karyawan kontrak " + karyawanKontrak.nama + " adalah " + karyawanKontrak.totalGaji());
    }
}
