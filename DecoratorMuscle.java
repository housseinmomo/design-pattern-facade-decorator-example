public abstract class DecoratorMuscle implements Muscle{

    protected Muscle muscle;

    public DecoratorMuscle(Muscle newMuscle){
        this.muscle = newMuscle;
    }

    @Override
    public String getTypeMuscle() {
        return this.muscle.getTypeMuscle();
    }
}
