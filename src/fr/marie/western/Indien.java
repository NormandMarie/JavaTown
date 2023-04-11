package fr.marie.western;

public class Indien extends Humain{
    int nombreDePlumes;
    String totem;
public Indien(String nom){
    super(nom,"le jus de racine");
    this.nombreDePlumes = 0;
    this.totem= "Coyote";
}
    @Override
    public void parler(String texte) {
        System.out.println(super.quelEstTonNom() + " - " + texte + "Ugh !");
    }
}
