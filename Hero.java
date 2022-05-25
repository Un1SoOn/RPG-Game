package Practic.Day11.Ex2;

import Practic.Day11.Ex2.PhysAttack;

public abstract class Hero implements PhysAttack{
    int MIN_HEALTH = 0;
    int MAX_HEALTH = 100;
    int health;
    double  physDef;
    double magicDef;
    int physAttack;
    
    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAttack * (1-hero.physDef);
        if(hero.health - damage < MIN_HEALTH ){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= damage;
        }
    }
}
