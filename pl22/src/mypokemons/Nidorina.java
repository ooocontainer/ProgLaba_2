package mypokemons;

import mymoves.glameow.Growl;
import mymoves.nidoranF.Blizzard;
import mymoves.nidoranF.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidorina extends Pokemon {

    public Nidorina (String name,  int level) {
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(70, 62, 67, 55, 55, 56);

        Blizzard blizzard = new Blizzard(110, 70);
        PoisonSting poisonSting = new PoisonSting(15, 100);
        Growl growl = new Growl(0, 100);

        super.setMove(poisonSting, growl);
    }
}
