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
}
