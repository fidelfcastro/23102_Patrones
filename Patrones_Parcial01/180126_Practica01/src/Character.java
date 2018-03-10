public class Character {
    WeaponBehavior weapon;

    public Character(WeaponBehavior weapon){
        this.weapon = weapon;
    }
    public void fight(){
        System.out.print("In this fight ");
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
}
