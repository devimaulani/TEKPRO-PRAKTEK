public class PasienRawatJalan extends Pasien {
    public PasienRawatJalan(String nama, int umur, String rekamMedis) {
        super(nama, umur, rekamMedis);
    }

    @Override
    public void terimaPerawatan() {
        System.out.println("Pasien " + nama + " menerima konsultasi rawat jalan.");
    }
}
