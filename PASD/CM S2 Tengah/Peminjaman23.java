public class Peminjaman23 {
    Mahasiswa23 mhs;
    Buku23      buku;
    int         lamaPinjam;
    int         batasPinjam = 5;
    int         terlambat;
    int         denda;

    Peminjaman23(Mahasiswa23 mhs, Buku23 buku, int lamaPinjam) {
        this.mhs        = mhs;
        this.buku       = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int selisih = lamaPinjam - batasPinjam;
        if (selisih > 0) {
            terlambat = selisih;
            denda     = terlambat * 2000;
        } else {
            terlambat = 0;
            denda     = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul
                + " | Lama: "      + lamaPinjam
                + " | Terlambat: " + terlambat
                + " | Denda: "     + denda);
    }
}
