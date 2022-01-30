package pl.tomek.nauka.metodaFabrykująca;

import pl.tomek.nauka.domena.Kot;
import pl.tomek.nauka.interfejsy.Fabryka;
import pl.tomek.nauka.interfejsy.Znacznik;

public class KotProducent implements Fabryka {

    @Override
    public Znacznik utwórz() {
        return new Kot();
    }
}
