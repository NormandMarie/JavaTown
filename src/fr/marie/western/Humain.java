package fr.marie.western;

public abstract class Humain {
   private String nom;

    private String BoissonFav;


    public Humain(String nom) {
        this.nom = nom;
        this.BoissonFav = "eau";
    }

    public Humain(String nom, String BoissonFav) {
        this.nom = nom;
        this.BoissonFav = BoissonFav;
    }

    public String quelEstTonNom() {
        return nom;
    }


    public void parler(String texte) {
        System.out.println(nom + " - " + texte);
    }

    public String getBoissonFav() {
        return BoissonFav;
    }

    void sePresenter (){
        System.out.println("Bonjour mon nom est " + this.nom + " ma boisson préfère est " + this.BoissonFav);
    }
    public void boire() {
        parler("Ah ! un bon verre de " + BoissonFav + " ! GLOUPS !");
    }

}
