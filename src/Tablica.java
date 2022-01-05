import java.util.Random;

public class Tablica {
    int[] tab;

    public Tablica(int n) {
        this.tab = new int[n];
    }

    public void wypelnij(int k) {
        Random myRandom = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = myRandom.nextInt(k + 1);
        }
    }

    public void wyswietl() {
        for (int j : tab) {
            System.out.println(j + "");
        }
    }

    public int szukaj(int x) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public int szukaj2(int x) {
        int i = 0;
        int index = -1;
        // dla tab uporządkowanej (...&& tab[i] < x)
        while (i < tab.length && tab[i] != x) {
            i++;
        }
        //dla tab uporządkowanej (...&& tab[i] == x)
        if (i != tab.length) index = i;
        return index;
    }


    public void usun(int k) {
        int index = szukaj(k);
        int[] newtab = new int[tab.length-1];
        if (index != -1) {
            for (int i = 0; i < index; i++) {
                newtab[i]=tab[i];
            }
            for (int j = index+1; j<tab.length;j++){
                newtab[j-1] = tab[j];
            }
            tab = newtab;
        }else {System.out.println("Blad usuwania: nie znaleziono elementu!");}
    }

    public int suma(){
        int wynik = 0;
        for (int j : tab) {
            wynik += j;
        }
        return wynik;
    }
    public int srednia(){
        return suma()/ tab.length;
    }
    public void zamiana(int index1, int index2){
        int temp = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = temp;
    }

}
