// Pansage.java
package lib.myPokemons;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;

public class Pansage extends Pokemon {
    public Pansage(String myName, int myLvl) {
        super(myName, myLvl);
        //           hp   att  def  spAtt spDef speed
        this.setStats(50D, 53D, 48D, 53D, 48D, 64D);
        this.setType(Type.GRASS);

        this.addMove(new DynamicPunch());
        this.addMove(new Bulldoze());
        this.addMove(new LeechLife());
        this.addMove(new StoneEdge());
    }
}
