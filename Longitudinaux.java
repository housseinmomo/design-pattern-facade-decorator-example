public class Longitudinaux implements Muscle, Envole{

    public Longitudinaux() {}

    @Override
    public String getTypeMuscle() {
        return "Longitudinaux";
    }

    @Override
    public void voler() {
        System.out.println("Utilisation du muscle Longitudinaux");
    }
}
