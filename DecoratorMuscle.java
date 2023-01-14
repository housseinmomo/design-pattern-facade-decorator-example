public abstract class DecoratorMuscle implements Muscle{

    protected Muscle muscle;

    public DecoratorMuscle(Muscle newMuscle){
        this.muscle = newMuscle;
    }

    @Override
    public String nomMuscle(){
        return muscle.nomMuscle();
    }

    @Override
    public String etatMuscle(){
        return muscle.etatMuscle();
    }


}
