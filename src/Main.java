public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero hero[] = {magic, medic, warrior};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
            if (hero[i] instanceof Medic) {
                ((Medic) hero[i]).increaseExperience();
            }
        }
    }
}