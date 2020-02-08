package org.kb.Actor;

import org.kb.AbleToAttack;
import org.kb.WeaponType;

public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {
        setHp(100);
        setStrength(25);
        setAlive(true);
        weaponType = playerWeapon;
    }

    @Override
    public int attack() {
        if (getWeaponType().equals(WeaponType.MACE)) {
            setHp(getHp() + 10);
        }
        return (getWeaponType().getDamage() + 1) + getStrength();
    }

    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", alive=" + alive +
                ", strength=" + strength +
                ", weaponType=" + weaponType +
                '}';
    }
}
