package org.kb;

public class Player extends Creature implements AbleToAttack {
    private WeaponType weaponType;

    public Player(WeaponType weaponType) {
        setHp(100);
        setStrength(100);
        setAlive(true);
        this.weaponType = weaponType;
    }

    @Override
    public int attack() {
        if (getWeaponType().equals(WeaponType.MACE)) {
            setHp(getHp() + 10);
        }
        return (getWeaponType().getDamage() + 1) + getStrength();
    }
}
