package org.kb.Actor;

import org.kb.WeaponType;

public class Ghul extends Monster {


    public Ghul() {
        setWeaponType(WeaponType.UNARMED);
        setHp(70);
        setStrength(5);
        setAlive(true);
    }


    @Override
    public int attack() {
        return getWeaponType().getDamage() + getStrength();
    }

    @Override
    public String toString() {
        return "Ghul{" +
                "hp=" + hp +
                ", alive=" + alive +
                ", strength=" + strength +
                ", weaponType=" + weaponType +
                '}';
    }
}
