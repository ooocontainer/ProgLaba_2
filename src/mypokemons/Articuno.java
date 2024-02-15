package mypokemons;

import mymoves.articuno.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Articuno extends Pokemon {
    public Articuno (String name, int level) {
        super (name, level);

        super.setType(Type.ICE, Type.FLYING);
        super.setStats(90, 85, 100, 95, 125, 85);

        Hurricane hurricane = new Hurricane(110, 70);
        AerialAce aerialAce = new AerialAce(60, 0);
        Agility agility = new Agility(0, 0);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);


        super.setMove(hurricane, aerialAce, agility,doubleTeam);

    }
}
