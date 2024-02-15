package mymoves.nidoqueen;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {

    public Growl(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        p.setMod(Stat.ATTACK, -1);
    }

    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет Growl";
    }

}
