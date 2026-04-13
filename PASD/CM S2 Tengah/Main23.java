import java.util.Scanner;

public class Main23 {

    static void insertionSort(Peminjaman23[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman23 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void sortByNim(Peminjaman23[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman23 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void binarySearchNIM(Peminjaman23[] sorted, String nimCari) {
        int low = 0, high = sorted.length - 1, idxFound = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = sorted[mid].mhs.nim.compareTo(nimCari);
            if      (cmp == 0) { idxFound = mid; break; }
            else if (cmp <  0)   low  = mid + 1;
            else                 high = mid - 1;
        }

        if (idxFound == -1) {
            System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
            return;
        }

        // Kumpulkan semua baris NIM yang sama
        int start = idxFound, end = idxFound;
        while (start > 0 && sorted[start - 1].mhs.nim.equals(nimCari)) start--;
        while (end < sorted.length - 1 && sorted[end + 1].mhs.nim.equals(nimCari)) end++;

        for (int i = start; i <= end; i++) sorted[i].tampilPeminjaman();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa23[] mahasiswas = {
            new Mahasiswa23("22001", "Andi",  "Teknik Informatika"),
            new Mahasiswa23("22002", "Budi",  "Teknik Informatika"),
            new Mahasiswa23("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku23[] bukus = {
            new Buku23("B001", "Algoritma",   2020),
            new Buku23("B002", "Basis Data",  2019),
            new Buku23("B003", "Pemrograman", 2021),
            new Buku23("B004", "Fisika",      2024)
        };

        Peminjaman23[] peminjamans = {
            new Peminjaman23(mahasiswas[0], bukus[0], 7),
            new Peminjaman23(mahasiswas[1], bukus[1], 3),
            new Peminjaman23(mahasiswas[2], bukus[2], 10),
            new Peminjaman23(mahasiswas[2], bukus[3], 6),
            new Peminjaman23(mahasiswas[0], bukus[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa23 m : mahasiswas) m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku23 b : bukus) b.tampilBuku();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman23 p : peminjamans) p.tampilPeminjaman();
                    break;

                case 4:
                    Peminjaman23[] sorted = peminjamans.clone();
                    insertionSort(sorted);
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman23 p : sorted) p.tampilPeminjaman();
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.next();
                    Peminjaman23[] sortedNim = peminjamans.clone();
                    sortByNim(sortedNim);
                    binarySearchNIM(sortedNim, nimCari);
                    break;

                case 0:
                    System.out.println("Terima kasih Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);

        sc.close();
    }
}
