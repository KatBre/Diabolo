package org.kb;

public class Goblin extends Monster {


    public Goblin() {
        WeaponType weaponType = WeaponType.MACE;
        int hp = 100;
        int strength = 200;
    }


    @Override
    public int attack() {
        return 0;
    }


}
