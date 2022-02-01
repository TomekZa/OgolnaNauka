package pl.tomek.nauka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.tomek.nauka.enumy.WybierzZwierze;
import pl.tomek.nauka.enumy.Zwierzeta;
import pl.tomek.nauka.formatowanie.Linia;
import pl.tomek.nauka.metodaFabrykująca.ZwierzeSerwis;
import pl.tomek.nauka.metody.PrzyjmujeZwracaTyp;

@SpringBootApplication
public class NaukaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaukaApplication.class, args);

        uruchom();

    }

    public static void uruchom() {
        PrzyjmujeZwracaTyp przyjmujeZwracaTyp = new PrzyjmujeZwracaTyp();

        String tekst = przyjmujeZwracaTyp.drukuj("To jest jakiś tekst");

        System.out.println(tekst);

        Linia.linia();

        ZwierzeSerwis zwierzeSerwis = new ZwierzeSerwis();

        zwierzeSerwis.utworzZwierze(WybierzZwierze.KOT);

    }

}
