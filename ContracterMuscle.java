public class ContracterMuscle extends DecoratorMuscle{

    public ContracterMuscle(Muscle newMuscle) {
        super(newMuscle);
        System.out.println("L'oiseau contracte " + muscle.getTypeMuscle());
    }
}
