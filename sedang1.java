public class sedang1 {
    public static void main(String[] args) {
        double tabungan=100000,totalTabungan = 0;

        System.out.println("======= Jumlah Tabungan Siswa =======");
        for (int bulan = 1; bulan <= 12; bulan++) {
            if (bulan != 1) {
                tabungan += 50000;
            }
            totalTabungan += tabungan;
            System.out.println("Bulan ke-" + bulan + ": " + tabungan + " Rupiah");
        }   
        
        System.out.println("Total tabungan selama 12 bulan: " + totalTabungan + " Rupiah");
    }
    
}
