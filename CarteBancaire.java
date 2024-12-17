class CarteBancaire extends MoyenPaiement {
    public CarteBancaire(String titulaire) {
        super(titulaire);
    }

    @Override
    public void effectuerPaiement(double montant) {
        verifierPaiement(); // Appel à la méthode commune
        System.out.println("Paiement de " + montant + " euros effectué par Carte Bancaire.");
    }
}