package mymoves.articuno;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {

    public Agility(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        p.setMod(Stat.SPEED, +2);
    }

    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет Agility";
    }
}
