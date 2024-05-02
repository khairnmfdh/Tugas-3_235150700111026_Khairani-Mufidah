public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
    }
    public double getUpahPerJam(){
        return upahPerJam;
    }
    public int getTotalJam(){
        return totalJam;
    }
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }
    public double Gaji(){
        if(totalJam<=40){
            return upahPerJam*totalJam;
        }else{
            int jamNormal =40;
            int jamLebih = totalJam - jamNormal;
            return (jamNormal * upahPerJam) + (1.5 * jamLebih *  upahPerJam);
    }
    }
    public String toString() {
        return String.format("Pegawai Harian\t: %s\nNo. KTP\t\t: %s\nUpah/jam\t: Rp. %.0f\nTotal jam kerja\t: %d\nPendapatan\t: Rp. %.0f\n",
                getNama(), getNoKTP(), upahPerJam, totalJam, Gaji());
    }
}