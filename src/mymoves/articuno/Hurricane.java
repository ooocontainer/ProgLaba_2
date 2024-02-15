package mymoves.articuno;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import compile.Program;

public class Hurricane extends SpecialMove {

    public Hurricane(double pow, double acc) {
        super(Type.FLYING, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Program.chance(0.3)) { //Шанс 30% на confusing
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        return "бьет Hurricane";
    }



}
