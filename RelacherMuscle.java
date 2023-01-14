public class RelacherMuscle extends DecoratorMuscle{

    public RelacherMuscle(Muscle newMuscle) {
        super(newMuscle);
    }


    @Override
    public String nomMuscle(){
        return muscle.nomMuscle();
    }

    @Override
    public String etatMuscle(){
        return "relache";
    }


}
