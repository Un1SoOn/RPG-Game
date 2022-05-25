package Practic.Day11.Ex2;

public class Magician extends Hero implements MagicAttack{

    int magicAttack = 20;

    public Magician(){
        physAttack = 5;
        magicDef = 0.8;
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
        return "Magician{health="+health+"}";
    }
}
