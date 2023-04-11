package fr.marie.western;

public class Dame extends Humain implements VisagePale{
    private String couleurRobe;
    private boolean estLibre;

    public Dame(String nom, String boissonFavorite, String couleurRobe, boolean estLibre) {
        super(nom, boissonFavorite);
        this.couleurRobe = couleurRobe;
        this.estLibre = estLibre;
    }
    public Dame(String nom,String couleurRobe) {
        super(nom,"lait");
        this.couleurRobe = couleurRobe;
        this.estLibre = true;
    }

    @Override
    public void sePresenter() {
        String etat = estLibre ? "libre" : "retenu";
        parler("Bonjour, je suis "+ this.quelEstTonNom() + " et ma robe est de couleur " + couleurRobe + ". Je suis actuellement " + etat + ".");
    }
    @Override
    public  String quelEstTonNom() {
        return "Miss "+ super.quelEstTonNom() ;
    }

    public void changerEtat(boolean estLibre) {
        this.estLibre = estLibre;
    }
    public void SeFaireKidnapper(){
        if (estLibre) {
            estLibre = false;
            hurler();
        }
    }
    private void hurler() {
        parler("Aaaah ! Au secours !");
    }

    void libérer(Cowboy Cowboy) {
        if (!estLibre) {
            estLibre = true;
            parler("merci beaucoup " + Cowboy.quelEstTonNom() + " de m'avoir libérer!!");
        }
    }

     void ChangerRobe(String couleur){
        this.couleurRobe =  couleur;
        parler(" Regardez ma nouvelle robe "+ couleur + " !");
    }

    @Override
    public void scalp(Indien indien) {
        indien.nombreDePlumes += 1;
        parler("Aïe ma tête !");
    }
}
