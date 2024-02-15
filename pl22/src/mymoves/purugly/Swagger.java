package mymoves.purugly;

import compile.Program;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.SPEED, +2);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.confuse(p);
    }
    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет Swagger";
    }

}
