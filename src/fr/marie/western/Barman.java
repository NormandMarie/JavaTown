package fr.marie.western;

public class Barman extends Humain {
    String NomBar;

    public Barman(String nom, String NomBar) {
        super(nom, "vin");
        this.NomBar = NomBar;

    }

    public Barman(String nom) {
        super(nom, "vin");
        this.NomBar = "Chez " + super.quelEstTonNom();

    }

    @Override
    public void sePresenter() {
        parler("Bonjour, je suis " + this.quelEstTonNom() + " et mon bar est le " + this.NomBar + ".");

    }

    @Override
    public void parler(String texte) {
        System.out.println(super.quelEstTonNom() + " - " + texte + " Coco.");
    }
}