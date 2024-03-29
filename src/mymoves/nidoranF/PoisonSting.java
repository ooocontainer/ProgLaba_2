package mymoves.nidoranF;

import compile.Program;
import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {

    public PoisonSting (double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, +15);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Program.chance(0.3)) { //Шанс 30% на poisoning
            Effect.poison(p);
        }
    }

}
