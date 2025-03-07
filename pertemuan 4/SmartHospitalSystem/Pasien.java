// Class Pasien
class Pasien {
    private String nama;
    private int umur;
    private String rekamMedis;

    public Pasien(String nama, int umur, String rekamMedis) {
        this.nama = nama;
        this.umur = umur;
        this.rekamMedis = rekamMedis;
    }

    public void terimaPerawatan() {
        System.out.println("Pasien " + nama + " sedang menerima perawatan.");
    }
}
