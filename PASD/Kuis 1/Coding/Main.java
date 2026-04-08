import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Perpustakaan23 perpus = new Perpustakaan23();
        int pilih;

        do {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {

                case 1:
                    System.out.print("Masukkan kode buku: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = sc.nextLine();
                    perpus.tambahBuku(kode, judul, penulis);
                    break;

                case 2:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();
                    perpus.tambahMahasiswa(nim, nama);
                    break;

                case 3:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    kode = sc.nextLine();

                    mahasiswa23 mhs = perpus.cariMahasiswa(nim);
                    buku23 buku = perpus.cariBuku(kode);

                    if (mhs != null && buku != null) {
                        mhs.pinjamBuku(buku);
                    } else {
                        System.out.println("Mahasiswa atau Buku tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    kode = sc.nextLine();

                    mhs = perpus.cariMahasiswa(nim);
                    if (mhs != null) {
                        mhs.kembalianBuku(kode);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 5:
                    perpus.tampilkanPeminjaman();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 6);
    }
}