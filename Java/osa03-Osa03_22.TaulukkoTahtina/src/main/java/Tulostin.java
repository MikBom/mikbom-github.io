
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
       
        for (int i = 0; i < taulukko.length; i++) {
            int luku = taulukko[i];
            
            for (int j = 0; j < luku; j++)

            System.out.print("*");// Kirjoita tulostuskoodi tänne
            System.out.println("");
        }
    }
}