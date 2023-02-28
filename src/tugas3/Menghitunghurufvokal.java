package projects.src.tugas3;

public class Menghitunghurufvokal {
    public static void main(String[] args) {
        String kalimat = "aku belajar pemrograman";
        int m = kalimat.length();
        String HurufVokal = "aiueo";
        int n = HurufVokal.length();
        int jumlah = 0;

        System.out.println("Contoh: "+kalimat);
        System.out.println("Output: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(HurufVokal.charAt(i)==kalimat.charAt(j)) {
                    jumlah++;
                }
            }
            System.out.println(HurufVokal.charAt(i)+" = "+jumlah);
            jumlah = 0;
        }
    }
}
