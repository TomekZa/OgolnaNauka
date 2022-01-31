package pl.tomek.nauka.metodaFabrykująca;

import pl.tomek.nauka.domena.Kot;
import pl.tomek.nauka.enumy.Zwierzeta;
import pl.tomek.nauka.interfejsy.Fabryka;
import pl.tomek.nauka.interfejsy.Znacznik;

public class ZwierzeSerwis {

    public void utworzZwierze(Zwierzeta zwierzeta) {

        switch (zwierzeta) {

            case KOT:
                KotProducent kotProducent = new KotProducent();
                Znacznik kot = kotProducent.utwórz();
                break;

            case PIES:
                PiesProducent piesProducent = new PiesProducent();
                Znacznik pies = piesProducent.utwórz();
                break;
            default:
                System.out.println("Nie ma takiego zwierzecia");
        }
    }
}
