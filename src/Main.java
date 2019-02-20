import z1.Algorithmics;

public class Main {



    public static void main(String[] args) {
        Algorithmics a= new Algorithmics();
        System.out.println("Wynik: "+a.potegowanie(3,1));
        System.out.println("Silnia: "+a.silnia(3));
        System.out.println("ciag geometryczny "+ a.ciagGeometryczny(2,2,4));
        System.out.println("ciag arytmetyczny "+ a.ciagArytmetyczny(2,2,4));
        System.out.println("Czy doskonala: "+ a.czyLiczbaDoskonala(6));
        System.out.println("Czy doskonala: "+ a.czyLiczbaDoskonala(11));
        System.out.println("Czy doskonala: "+ a.czyLiczbaDoskonala(28));
        System.out.println("NWD: "+ a.getNWD(12,9));
        System.out.println("DtB: "+ a.decimalToBinary(12));
        System.out.println("Dziesietne: "+ a.binaryToDecimal("1100"));
        System.out.println("Czy pierwsza: "+a.czyPierwsza(12));
        a.liczbyPierwsze(5);
    }
}
