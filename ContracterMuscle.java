public class ContracterMuscle extends DecoratorMuscle{

    public ContracterMuscle(Muscle newMuscle) {
        super(newMuscle);
    }

    @Override
    public String nomMuscle(){
        return muscle.nomMuscle();
    }

    @Override
    public String etatMuscle(){
        return "contracte";
    }

}
