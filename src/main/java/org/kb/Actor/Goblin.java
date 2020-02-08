package org.kb.Actor;

import org.kb.WeaponType;

public class Goblin extends Monster {


    public Goblin() {
        setWeaponType(WeaponType.MACE);
        setHp(50);
        setStrength(15);
        setAlive(true);
    }



    @Override
    public int attack() {
       return getWeaponType().getDamage() + getStrength();
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "hp=" + hp +
                ", alive=" + alive +
                ", strength=" + strength +
                ", weaponType=" + weaponType +
                '}';
    }
}
