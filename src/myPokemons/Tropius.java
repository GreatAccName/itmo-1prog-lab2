// Tropius.java
package lib.myPokemons;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;

public class Tropius extends Pokemon {
    public Tropius(String myName, int myLvl) {
        super(myName, myLvl);
        //           hp   att  def  spAtt spDef speed
        this.setStats(99D, 68D, 83D, 72D, 87D, 51D);
        this.setType(Type.GRASS, Type.FLYING);

        this.addMove(new DoubleTeam());
        this.addMove(new TeeterDance());
    }
}
