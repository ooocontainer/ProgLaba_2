package mymoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends SpecialMove {

    public SampleMove(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect.confuse(p);
    }

    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет Hurricane";
    }
}
