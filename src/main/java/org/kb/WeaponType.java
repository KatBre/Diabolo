package org.kb;

public enum WeaponType {
    SWORD (5),
    MACE (10),
    UNARMED (1);

    public int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }
}
