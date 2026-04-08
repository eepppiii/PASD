public class Datadosen23 {
    public void dataSemuaDosen(Dosen23[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].cetakInfo(i + 1);
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen23 d : arrayOfDosen) {
            if (d.jeniskelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen23 d : arrayOfDosen) {
            if (d.jeniskelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata Usia Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata Usia Wanita : " + (totalWanita / jmlWanita));
    }

    public void infoDosenPalingTua(Dosen23[] arrayOfDosen) {
        Dosen23 tertua = arrayOfDosen[0];

        for (Dosen23 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo(1);
    }

    public void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        Dosen23 termuda = arrayOfDosen[0];

        for (Dosen23 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo(1);
    }
}

