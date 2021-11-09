// Lab2.java
package lib;

import ru.ifmo.se.pokemon.*;
import lib.myMoves.*;
import lib.myPokemons.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle battle = new Battle();

        int lvl = 12;
        battle.addAlly(new Pansage("Forelock", lvl));
        battle.addAlly(new Gabite("TorpedoEars", lvl));
        battle.addAlly(new Manectric("Pony", lvl));

        battle.addFoe(new Tropius("NotTRex", lvl));
        battle.addFoe(new Snivy("Arrogant", lvl));
        battle.addFoe(new Chimecho("Rag", lvl));

        // battle.addAlly(new Gabite("TorpedoEars", lvl));
        // battle.addFoe(new Manectric("Pony", lvl));

        battle.go();
    }
}
/*
myPokemons:
Pansage Gabite Manectric Tropius Snivy Chimecho
Names:
Forelock TorpedoEars Pony NotTRex Arrogant Rag

myMoves:
DynamicPunch
Bulldoze
LeechLife
StoneEdge
Confusion
ChargeBeam
Swagger
ShadowBall
DoubleTeam
TeeterDance
PlayNice
SweetScent

--------------------

Pansage:
Dynamic Punch
Bulldoze
Leech Life
Stone Edge

Gabite:
Confusion
Charge Beam
Swagger

Manectric:
Confusion
Charge Beam
Swagger
Shadow Ball

Tropius:
Double Team
Teeter Dance

Snivy:
Double Team
Teeter Dance
Play Nice

Chimecho:
Double Team
Teeter Dance
Play Nice
Sweet Scent

--------------------

Для задания нескольких параметров эффекта методы можно вызывать цепочкой.
Например, следующий код создает новый эффект,
который в течение 3 ходов с вероятностью 50%
будет снижать атаку покемона на 1 ступень.
Effect e = new Effect().chance(0.5).turns(3).stat(Stat.ATTACK, -1);
Effect.confuse(def);
def.setMod(Stat.HP, (int) Math.round(damage));

/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/

/usr/libexec/java_home -V
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home

--------------------
in helios

javac -cp Pokemon.jar -d .. myMoves/*.java
javac -cp Pokemon.jar:.. -d .. myPokemons/*.java

echo "Manifest-Version: 1.0" > MANIFEST.MF
echo "Main-Class: lib.Lab2" >> MANIFEST.MF
echo "Class-Path: Pokemon.jar" >> MANIFEST.MF

jar cmf MANIFEST.MF Lab2.jar ../lib/
javac -classpath Pokemon.jar:.. -d .. Lab2.java

jar tf Lab2.jar
java -jar Lab2.jar
*/
