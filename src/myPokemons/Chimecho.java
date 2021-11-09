// Chimecho.java
package lib.myPokemons;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;

public class Chimecho extends Pokemon {
    public Chimecho(String myName, int myLvl) {
        super(myName, myLvl);
        //           hp   att  def  spAtt spDef speed
        this.setStats(75D, 50D, 80D, 95D, 90D, 65D);
        this.setType(Type.PSYCHIC);

        this.addMove(new DoubleTeam());
        this.addMove(new TeeterDance());
        this.addMove(new PlayNice());
        this.addMove(new SweetScent());
    }
}
