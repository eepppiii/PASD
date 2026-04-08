import java.util.Scanner;

public class MatakuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Matakuliah23[] arrayofMatakuliah23 = new Matakuliah23[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke- " + (i + 1));
            System.out.print("Kode :");
            kode = sc.nextLine();
            System.out.print("Nama :");
            nama = sc.nextLine();
            System.out.print("SKS :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("================");

            arrayofMatakuliah23[i] = new Matakuliah23();
            arrayofMatakuliah23[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah23[i].cetakInfo();
        }

    }
}
