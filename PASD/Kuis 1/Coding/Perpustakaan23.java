public class Perpustakaan23 {
    buku23[] daftarBuku = new buku23[100];
    mahasiswa23[] daftarMahasiswa = new mahasiswa23[100];
    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    public void tambahBuku(String kode, String judul, String penulis) {
        daftarBuku[jumlahBuku] = new buku23(kode, judul, penulis);
        jumlahBuku++;
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tambahMahasiswa(String nim, String nama) {
        daftarMahasiswa[jumlahMahasiswa] = new mahasiswa23(nim, nama);
        jumlahMahasiswa++;
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public buku23 cariBuku(String kode) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kode)) {
                return daftarBuku[i];
            }
        }
        return null;
    }

    public mahasiswa23 cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].NIM.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public void tampilkanPeminjaman() {
        System.out.println("\nDaftar Peminjaman Buku:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].jmlhpinjamBuku > 0) {
                System.out.print(daftarMahasiswa[i].nama + " meminjam: ");
                for (int j = 0; j < daftarMahasiswa[i].jmlhpinjamBuku; j++) {
                    System.out.print(daftarMahasiswa[i].bukuPinjam[j].judul + " ");
                }
                System.out.println();
            }
        }
    }
}