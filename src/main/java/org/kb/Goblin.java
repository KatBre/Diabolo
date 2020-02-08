package org.kb;

public class Goblin extends Monster {


    public Goblin() {
        setWeaponType(WeaponType.MACE);
        setHp(50);
        setStrength(80);
        setAlive(true);
    }



    @Override
    public int attack() {
       return getWeaponType().getDamage() + getStrength();
    }


}
