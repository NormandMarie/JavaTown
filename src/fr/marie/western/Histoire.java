package fr.marie.western;

public class Histoire {
    public static void main(String[] args) {
        Barman marie = new Barman("marie", " Neipa");
       Shérif lili = new Shérif("lili");
       Cowboy jo = new Cowboy("jo");
       Brigand CalamityJane = new Brigand("CalamityJane","Bourbon","romanesque",0,500 );
        Cowboy Clint = new Shérif("Clint");
        Ripoux riri =new Ripoux("rire", "bière","ripoux",3,500);
        DameBrigand jane = new DameBrigand("jane","bourbon");

        lili.sePresenter();
       marie.sePresenter();
        marie.boire();
        Dame alice = new Dame("Alice", "Stout", "rouge", true);


        alice.sePresenter();
       alice.SeFaireKidnapper();
        alice.sePresenter();
        alice.libérer(jo);
        alice.ChangerRobe("bleu");
        alice.sePresenter();
        Indien bryan = new Indien ("bryan");
         alice.scalp(bryan);
         bryan.sePresenter();
        CalamityJane.capture(alice);
        CalamityJane.sePresenter();
        alice.sePresenter();
        CalamityJane.seFaireEmprisonner(jo);
        CalamityJane.sePresenter();
        CalamityJane.boire();
        jo.libérer(alice);
        jo.tirer(CalamityJane);
        alice.quelEstTonNom();
        CalamityJane.quelEstTonNom();
        lili.rechercher(CalamityJane);
        CalamityJane.sePresenter();
        lili.rechercher(CalamityJane);
        CalamityJane.sePresenter();
        riri.seFaireEmprisonner(jo);
        jane.seFaireEmprisonner(jo);

    }
}