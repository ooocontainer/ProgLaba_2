package mymoves.glameow;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WorkUp extends StatusMove {

    public WorkUp(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        p.setMod(Stat.ATTACK, +1);
    }

    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет WorkUp";
    }
}
