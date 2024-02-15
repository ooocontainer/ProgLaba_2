package mypokemons;

import mymoves.nidoranF.Blizzard;
import mymoves.nidoranF.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon {

    public NidoranF (String name,  int level) {

        super(name, level);

        super.setType(Type.POISON);
        super.setStats(55, 47, 52, 40, 40, 41);

        Blizzard blizzard = new Blizzard(110, 70);
        PoisonSting poisonSting = new PoisonSting(15, 100);

        super.setMove(blizzard, poisonSting);
    }
}
