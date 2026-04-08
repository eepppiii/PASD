import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen23[] arrayDosen23 = new Dosen23[jumlah];
        String kode, nama;
        boolean jeniskelamin;
        int usia;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke- " + (i + 1));
            System.out.print("Kode :");
            kode = sc.nextLine();
            System.out.print("Nama :");
            nama = sc.nextLine();
            while (true) {
                System.out.print("Jenis Kelamin (L/P) : ");
                String jk = sc.nextLine();

                if (jk.equalsIgnoreCase("L")) {
                    jeniskelamin = true;
                    break;
                } else if (jk.equalsIgnoreCase("P")) {
                    jeniskelamin = false;
                    break;
                } else {
                    System.out.println("Input tidak valid! Masukkan L atau P.");
                }
            }
            System.out.print("Usia :");
            usia = Integer.parseInt(sc.nextLine());

            arrayDosen23[i] = new Dosen23(kode, nama, jeniskelamin, usia);
        }
        System.out.println("\n===== DATA DOSEN =====");
        for (int i = 0; i < jumlah; i++) {
            arrayDosen23[i].cetakInfo(i);
        }
        Datadosen23 data = new Datadosen23();

        System.out.println("\n===== SEMUA DATA DOSEN =====");
        data.dataSemuaDosen(arrayDosen23);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayDosen23);

        System.out.println("\n===== RATA-RATA USIA PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayDosen23);

        data.infoDosenPalingTua(arrayDosen23);
        data.infoDosenPalingMuda(arrayDosen23);

    }
}
