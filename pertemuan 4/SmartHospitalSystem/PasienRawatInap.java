public class PasienRawatInap extends Pasien {
    public PasienRawatInap(String nama, int umur, String rekamMedis) {
        super(nama, umur, rekamMedis);
    }

    @Override
    public void terimaPerawatan() {
        System.out.println("Pasien " + nama + " dirawat di rumah sakit.");
    }
}
