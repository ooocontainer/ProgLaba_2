package mymoves.nidoqueen;

import compile.Program;
import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {

    public  ShadowClaw(double pow, double acc){
        super(Type.GHOST, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, +70);
    }

}
