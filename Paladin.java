package Practic.Day11.Ex2;

public class Paladin extends Hero implements Healer{

    static final int COUNT_HEALTH = 25;
    static final int HEAL_TEAMMATE = 15;

    public Paladin(){
        physAttack = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if(health + COUNT_HEALTH > MAX_HEALTH){
            health = MAX_HEALTH;
        } else {
            health +=COUNT_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + HEAL_TEAMMATE > 100){
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE;
        }
    }

    @Override
    public String toString() {
        return "Paladin{health="+health+"}";
    }
}
