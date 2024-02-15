package mypokemons;

import mymoves.glameow.Growl;
import mymoves.glameow.Swagger;
import mymoves.glameow.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glameow extends Pokemon {

    public Glameow (String name,  int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(49, 55, 42, 42, 37, 85);

        Swagger swagger = new Swagger(110, 70);
        Growl growl = new Growl(100, 40);
        WorkUp workUp = new WorkUp(0, 0);

        super.setMove(swagger, growl, growl);
    }

}
