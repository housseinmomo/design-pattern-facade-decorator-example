public class main {
    public static void main(String[] args) {
        System.out.println("Design pattern facade + Decorator");

        Oiseau oiseau = new Oiseau("Mugen");

        // Ma facade qui va me permettre de masquer la complexite des implementations lier a l'envole des oiseaux
        EnvoleProcess envoleProcess = new EnvoleProcess(oiseau);

        envoleProcess.voler();
    }
}
