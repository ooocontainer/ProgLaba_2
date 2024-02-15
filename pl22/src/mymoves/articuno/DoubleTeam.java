package mymoves.articuno;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        p.setMod(Stat.EVASION, +1);

    }

    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет DoubleTeam";
    }
}
