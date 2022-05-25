package Practic.Day11.Ex2;

public class Shaman extends Hero implements MagicAttack, Healer{
    static final int COUNT_HEALTH = 50;
    static final int HEAL_TEAMMATE = 30;

    int magicAttack = 15;

    public Shaman(){
        physAttack = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if(health + COUNT_HEALTH > 100){
            health = MAX_HEALTH;
        } else {
            health += COUNT_HEALTH;
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
    public void magicalAttack(Hero hero) {
        double damage = magicAttack * (1- hero.magicDef);
        if(hero.health - damage < MIN_HEALTH){
            hero.health = 0;
        } else {
            hero.health -= damage;
        }
    }

    @Override
    public String toString() {
        return "Shaman{health="+health+"}";
    }
}
