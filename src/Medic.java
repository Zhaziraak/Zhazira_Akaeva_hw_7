public class Medic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Medic вылечил всех героев в бою");
    }

    private double healPoints;

    public void increaseExperience(){
        healPoints = healPoints * 0.1;
        System.out.println("Медик применил суперспособность");
    }
}
