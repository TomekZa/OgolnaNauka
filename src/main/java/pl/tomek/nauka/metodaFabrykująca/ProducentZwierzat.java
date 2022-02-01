package pl.tomek.nauka.metodaFabrykująca;

import pl.tomek.nauka.domena.Kot;
import pl.tomek.nauka.domena.Pies;
import pl.tomek.nauka.enumy.Zwierzeta;
import pl.tomek.nauka.interfejsy.FabrykaZwierząt;
import pl.tomek.nauka.interfejsy.Organizm;

public class ProducentZwierzat implements FabrykaZwierząt {

    @Override
    public Organizm utworz(Zwierzeta zwierzeta) {

        switch (zwierzeta) {

            case KOT:
                System.out.println("Utworzono Kota");
                return new Kot();

            case PIES:
                System.out.println("Utworzono Psa");
                return new Pies();

            default:
                throw new UnsupportedOperationException("Nie ma takiego zwierzęcia");
        }

    }
}
