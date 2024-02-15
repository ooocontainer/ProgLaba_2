package mypokemons;

import mymoves.nidoqueen.Growl;
import mymoves.nidoqueen.ShadowClaw;
import mymoves.nidoqueen.Blizzard;
import mymoves.nidoqueen.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Pokemon {

    public Nidoqueen (String name,  int level) {

        super(name, level);

        super.setType(Type.POISON);
        super.setStats(90, 92, 87, 75, 85, 76);

        Blizzard blizzard = new Blizzard(110, 70);
        PoisonSting poisonSting = new PoisonSting(15, 100);
        Growl growl = new Growl(0, 100);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);

        super.setMove(blizzard, poisonSting, growl, shadowClaw);

    }
}
