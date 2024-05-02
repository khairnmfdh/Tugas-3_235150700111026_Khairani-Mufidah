public class Main {
    public static void main(String[] args) {
    //PEGAWAI TETAP
    PegawaiTetap pegawaiT1 = new PegawaiTetap("Daniel", "356709276291", 5000000.0);
    PegawaiTetap pegawaiT2 = new PegawaiTetap("Matthew", "356709276292", 6000000.0);
    PegawaiTetap pegawaiT3 = new PegawaiTetap("Victoria", "356709276293", 7000000.0);
    //PEGAWAI HARIAN
    PegawaiHarian pegawaiH1 = new PegawaiHarian("Selena", "356709276294", 75000.0, 30);
    PegawaiHarian pegawaiH2 = new PegawaiHarian("Taylor", "356709276295", 80000.0, 55);
    PegawaiHarian pegawaiH3 = new  PegawaiHarian("Shawn", "356709276296", 76000.0, 60);
    //SALES
    Sales sales1 = new Sales("Harry", "356709276297", 50, 100000.0);
    Sales sales2 = new Sales("Niall", "356709276298", 20, 150000.0);
    Sales sales3 = new Sales("Zayn", "356709276291", 15, 200000.0);

    Pegawai[] pegawai = new Pegawai[9];
    pegawai[0] = pegawaiT1;
    pegawai[1] = pegawaiT2;
    pegawai[2] = pegawaiT3;
    pegawai[3] = pegawaiH1;
    pegawai[4] = pegawaiH2;
    pegawai[5] = pegawaiH3;
    pegawai[6] = sales1;
    pegawai[7] = sales2;
    pegawai[8] = sales3;
    
    for (Pegawai p : pegawai) {
        if (p instanceof PegawaiTetap){
        System.out.println("============================");
        System.out.println("==== DATA PEGAWAI TETAP ====");
        System.out.println("============================");
        System.out.println(p+"\n");
    } else if(p instanceof PegawaiHarian){
        System.out.println("=============================");
        System.out.println("==== DATA PEGAWAI HARIAN ====");
        System.out.println("=============================");
        System.out.println(p+"\n");
    }else if(p instanceof Sales){
        System.out.println("=============================");
        System.out.println("======== DATA SALES =========");
        System.out.println("=============================");
        System.out.println(p+"\n");
        }
    }
    }
}