package mypokemons;

import mymoves.glameow.Growl;
import mymoves.glameow.Swagger;
import mymoves.glameow.WorkUp;
import mymoves.purugly.Bulldoze;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Purugly extends Pokemon {

    public Purugly (String name, int level) {

        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(71, 82, 64, 64, 59, 112);

        Swagger swagger = new Swagger(0, 85);
        Growl growl = new Growl(0, 100);
        WorkUp workUp = new WorkUp(0, 0);
        Bulldoze bulldoze = new Bulldoze(60, 100);

        super.setMove(swagger, growl, workUp, bulldoze);
    }
}
