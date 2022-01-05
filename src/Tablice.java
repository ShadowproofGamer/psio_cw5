public class Tablice {
    public static void main(String[] args) {
        Tablica ar = new Tablica(100);
        ar.wypelnij(20);
        ar.wyswietl();
        int sr = ar.suma();
        System.out.println(sr);
    }
}
