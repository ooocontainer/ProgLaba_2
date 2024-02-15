package mymoves.nidoranF;

import compile.Program;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, +110);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Program.chance(0.1)) { //Шанс 10% на freezing
            Effect.freeze(p);
        }
    }

}
