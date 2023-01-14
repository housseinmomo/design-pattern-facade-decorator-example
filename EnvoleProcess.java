
// Il s'agira de notre facade qui aura pour objectif de masquer la complexite de l'envol de l'oiseau
public class EnvoleProcess
{
    protected Oiseau oiseau;

    public EnvoleProcess(Oiseau oiseau){
        System.out.println("=> Debut du processus d'envol :  de " + oiseau.getNomOiseau());
        this.oiseau = oiseau;
    }

    public void DecrireActionOiseau(Oiseau oiseau, Muscle muscle){
        System.out.println(oiseau.getNomOiseau() + " " + muscle.etatMuscle() + " ses muscles " + muscle.nomMuscle());
    }

    public void voler(){
        // TODO: Faire en sorte que les ailes de l'oiseau se relevent

            // TODO: les muscles longitudinaux se contractent
            Muscle longitudinauxContracter = new ContracterMuscle(new Longitudinaux());
            DecrireActionOiseau(oiseau, longitudinauxContracter);

            // TODO: les muscles transversaux se relâchent
            Muscle transversauxRelacher = new RelacherMuscle(new Transversaux());
            DecrireActionOiseau(oiseau, transversauxRelacher);

            System.out.println("-> Les ailes de " + oiseau.getNomOiseau() + " se relevent");

        // TODO: Faire en sorte que les ailes s'abaissent

            // TODO: les muscles longitudinaux se relâchent
            Muscle longitudinauxRelacher = new RelacherMuscle(new Longitudinaux());
            DecrireActionOiseau(oiseau, longitudinauxRelacher);

            // TODO: les muscles transversaux se contractent
            Muscle transversauxContracter = new ContracterMuscle(new Transversaux());
            DecrireActionOiseau(oiseau, transversauxContracter);

            System.out.println("-> Les ailes de " + oiseau.getNomOiseau() + " s'abaissent");

        System.out.println("=> Fin du processus d'envole : " + oiseau.getNomOiseau() + " vole");


    }
}
