public class RelacherMuscle extends DecoratorMuscle{
    public RelacherMuscle(Muscle newMuscle) {
        super(newMuscle);
        System.out.println("L'oiseau relache son " + muscle.getTypeMuscle());
    }
}
