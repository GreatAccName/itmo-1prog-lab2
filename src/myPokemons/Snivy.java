// Snivy.java
package lib.myPokemons;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;

public class Snivy extends Pokemon {
    public Snivy(String myName, int myLvl) {
        super(myName, myLvl);
        //           hp   att  def  spAtt spDef speed
        this.setStats(45D, 45D, 55D, 45D, 55D, 63D);
        this.setType(Type.GRASS);

        this.addMove(new DoubleTeam());
        this.addMove(new TeeterDance());
        this.addMove(new PlayNice());
    }
}
