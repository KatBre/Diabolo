package org.kb;

public abstract class Creature {
   private int hp;
   private boolean alive;
   private int strength;
   private WeaponType weaponType;

   public int getHp() {
      return hp;
   }

   public boolean isAlive() {
      return alive;
   }

   public int getStrength() {
      return strength;
   }

   public WeaponType getWeaponType() {
      return weaponType;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public void setAlive(boolean alive) {
      this.alive = alive;
   }

   public void setStrength(int strength) {
      this.strength = strength;
   }

   public void setWeaponType(WeaponType weaponType) {
      this.weaponType = weaponType;
   }
}
