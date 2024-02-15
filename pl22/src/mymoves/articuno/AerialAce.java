package mymoves.articuno;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {

    public AerialAce(double pow, double acc) {
        super(Type.FLYING, pow, acc);
    }



    @Override // переопределяет метод дискрайб
    protected String describe() {
        return "бьет AerialAce";
    }
}
