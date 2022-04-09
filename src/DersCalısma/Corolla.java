package DersCalısma;

public class Corolla extends Toyota {

    String hiz = "Corolla max 200 km hiz yaparlar";
    String yakit = "Corolla benzinli veya elektriklidir";
    String marka = "Arabalar üretildikleri markalara sahiptir";
    String vites = "Triptonic";


    public void motor() {
        System.out.println("Corolla araclar cevreci motor kullanırlar");
    }

    public void yakitTüketimi() {
        System.out.println("Corolla 5.6 lt yakit tüketirler ");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        Corolla arb1 = new Corolla();
        System.out.println(arb1.Hareket);//Araba
        System.out.println(arb1.hiz);
        System.out.println(arb1.yakit);
        System.out.println(arb1.marka);
        System.out.println(arb1.sirketMerkezi);
        System.out.println(arb1.vites);
        arb1.motor();

        Toyota arb2 = new Corolla();
        System.out.println(arb2.marka);
        arb2.motor();

      Araba arb3 = new Araba();
        arb3.motor();

    }

}