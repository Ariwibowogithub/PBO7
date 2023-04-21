package karyawan;

// Class Karyawan
class Karyawan {
    static String nama;
    int jumlahAnak;
    double tunjanganAnak;

    // Constructor
    public Karyawan(String nama, int jumlahAnak) {
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
        this.tunjanganAnak = 200000 * jumlahAnak;
    }

    // Method untuk menghitung total gaji
    public double totalGaji() {
        return 0;
    }
}

// Class Karyawan Tetap yang merupakan turunan dari class Karyawan
class KaryawanTetap extends Karyawan {
    double gajiPokok;

    // Constructor
    public KaryawanTetap(String nama, int jumlahAnak, double gajiPokok) {
        super(nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    // Override method untuk menghitung total gaji
    @Override
    public double totalGaji() {
        return gajiPokok + tunjanganAnak;
    }
}

// Class Karyawan Kontrak yang merupakan turunan dari class Karyawan
class KaryawanKontrak extends Karyawan {
    double upahHarian;
    int jumlahHari;

    // Constructor
    public KaryawanKontrak(String nama, int jumlahAnak, double upahHarian, int jumlahHari) {
        super(nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    // Override method untuk menghitung total gaji
    @Override
    public double totalGaji() {
        return (upahHarian * jumlahHari) + tunjanganAnak;
    }
}
