public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        setUpah(upah);
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }
    public double getUpah() {
        return upah;
    }
    public double Gaji(){
        return  upah;
    }
    public String toString() {
        return String.format("Pegawai Tetap\t: %s\nNo. KTP\t\t: %s\nUpah\t\t: Rp. %.0f\nPendapatan\t: Rp. %.0f\n",
                getNama(), getNoKTP(), upah, Gaji());
    }


}