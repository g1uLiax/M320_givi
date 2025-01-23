public class Character {
    private String name;
    private IWeaponBehavior weaponBehavior;

    public Character(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " is walking through the forest.");
    }

    public void fight() {
        if(weaponBehavior != null) {
            weaponBehavior.useWeapon();
        } else {
            System.out.println(name + " has no weapon equipped");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IWeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
