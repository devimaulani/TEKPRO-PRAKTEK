// Kelas utama untuk menjalankan simulasi
public class SmartHospital {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr. Andi", "D001", "Bedah");
        Perawat perawat1 = new Perawat("Suster Ani", "P001");
        Pasien pasien1 = new Pasien("Budi", 30, "Riwayat A");
        Administrasi admin = new Administrasi();
        Apotek apotek = new Apotek();

        dokter1.bekerja();
        dokter1.aturJadwal("Senin - Jumat, 08:00 - 15:00");
        dokter1.catatRekamMedis("Pemeriksaan awal: kondisi stabil.");
        System.out.println("Rekam Medis: " + dokter1.lihatRekamMedis());
        dokter1.buatResep("Paracetamol 500mg");

        perawat1.bekerja();
        pasien1.terimaPerawatan();

        admin.prosesPembayaran(500000);
        apotek.tebusObat("Paracetamol 500mg");
    }
}
