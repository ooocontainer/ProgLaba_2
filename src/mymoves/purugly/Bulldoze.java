package mymoves.purugly;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove {

    public Bulldoze(double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        p.setMod(Stat.ATTACK, +60);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        p.setMod(Stat.ATTACK, -1);
    }

}
