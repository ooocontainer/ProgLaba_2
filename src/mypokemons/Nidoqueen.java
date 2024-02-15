package mypokemons;

import mymoves.nidoranF.Blizzard;
import mymoves.nidoranF.PoisonSting;
import mymoves.nidoqueen.ShadowClaw;
import mymoves.glameow.Growl;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina {

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
