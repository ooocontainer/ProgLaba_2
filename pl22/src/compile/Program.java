package compile;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Articuno articuno = new Articuno("Articuno", 1);
        Glameow glameow = new Glameow("Glameow", 1);
        Purugly purugly = new Purugly("Purugly", 1);
        NidoranF nidoranF = new NidoranF("Nidoran-F", 1);
        Nidorina nidorina = new Nidorina("Nidorina", 1);
        Nidoqueen nidoqueen = new Nidoqueen("Nidoqueen", 1);


        b.addAlly(p1);

        b.addFoe(articuno);
        b.addFoe(glameow);
        b.addFoe(purugly);
        b.addFoe(nidoranF);
        b.addFoe(nidorina);
        b.addFoe(nidoqueen);

        b.go();
    }

    public static boolean chance(double d) { // Проверка метода на конфуз и т.д.
        return d > Math.random();
    }
}
