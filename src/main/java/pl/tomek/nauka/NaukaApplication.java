package pl.tomek.nauka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
    }

}
