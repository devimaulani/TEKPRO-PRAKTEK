// Subclass Perawat dari PersonelMedis
class Perawat extends PersonelMedis {
    public Perawat(String nama, String id) {
        super(nama, id);
    }

    @Override
    public void bekerja() {
        System.out.println("Perawat " + nama + " sedang membantu dokter.");
    }
}
