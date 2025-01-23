public class Main {
    public static void main(String []args) {
        Character mage = new Mage("L'électricien");
        mage.setWeaponBehavior(new RodBehavior());
        mage.walk();
        mage.fight();

        Character fighter = new Fighter("Oupie Goupie");
        fighter.walk();
        fighter.fight();

        Character villain = new Villain("Larry");
        villain.setWeaponBehavior(new AxeBehavior());
        villain.walk();
        villain.fight();
        mage.fight();
    }
}
