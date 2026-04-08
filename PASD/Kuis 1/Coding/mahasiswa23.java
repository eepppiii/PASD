public class mahasiswa23 {
    String NIM;
    String nama;
    buku23[] bukuPinjam = new buku23[2];
    int jmlhpinjamBuku;

    public mahasiswa23(String NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    public boolean pinjamBuku(buku23 buku23) {
        if (jmlhpinjamBuku >= 2) {
            System.out.println("Gagal" + nama + "Sudah Menerima 2 Buku.");
            return false;
        }
        if (buku23.statusPeminjaman) {
            System.out.println("Gagal Buku Sedang Dipinjam.");
            return false;
        }
        bukuPinjam[jmlhpinjamBuku] = buku23;
        jmlhpinjamBuku++;
        buku23.statusPeminjaman = true;
        System.out.println("Berhasil! Meminjam buku" + buku23.judul);
        return true;
    }

    public boolean kembalianBuku(String kodeBuku) {
        for (int i = 0; i < jmlhpinjamBuku; i++) {
            if (bukuPinjam[i].kodeBuku.equals(kodeBuku)) {
                bukuPinjam[i].statusPeminjaman = false;
                for (int j = i; j < jmlhpinjamBuku - 1; j++) {
                    bukuPinjam[j] = bukuPinjam[j + 1];
                }
                bukuPinjam[jmlhpinjamBuku - 1] = null;
                jmlhpinjamBuku--;
                System.out.println(nama + " mengembalikan buku.");
                return true;
            }
        }

        System.out.println("Buku tidak ditemukan.");
        return false;
    }

    public void tampilPinjam() {
        if (jmlhpinjamBuku > 0) {
            System.out.println("Mahasiswa: " + nama + "(" + NIM + ")");
            for (int i = 0; i < jmlhpinjamBuku; i++) {
                System.out.println(bukuPinjam[i].judul);
            }
            System.out.println();
        }
    }

}
