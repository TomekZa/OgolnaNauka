package pl.tomek.nauka.metodaFabrykująca;

import pl.tomek.nauka.domena.Pies;
import pl.tomek.nauka.enumy.Zwierzeta;
import pl.tomek.nauka.interfejsy.Fabryka;
import pl.tomek.nauka.interfejsy.Znacznik;

public class PiesProducent implements Fabryka {

    @Override
    public Znacznik utwórz() {
        System.out.println("Utworzono Psa");
        return new Pies();
    }
}
