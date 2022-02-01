package pl.tomek.nauka.metodaFabrykująca;

import pl.tomek.nauka.enumy.WybierzZwierze;
import pl.tomek.nauka.enumy.Zwierzeta;
import pl.tomek.nauka.interfejsy.FabrykaZwierząt;
import pl.tomek.nauka.interfejsy.Organizm;

public class ZwierzeSerwis {

    public void utworzZwierze(WybierzZwierze wybierzZwierze) {  // Napisać interfejs deklarującą metodę serwisu

        switch (wybierzZwierze) {

            case KOT:
                FabrykaZwierząt fabrykaKotów = new ProducentZwierzat();
                Organizm kot = fabrykaKotów.utworz(Zwierzeta.KOT);
                break;

            case PIES:
                FabrykaZwierząt fabrykaPsów = new ProducentZwierzat();
                Organizm pies = fabrykaPsów.utworz(Zwierzeta.PIES);
                break;

            default:
                System.out.println("Test z serwisu");
        }
    }
}
