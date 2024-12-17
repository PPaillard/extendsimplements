class PayPal extends MoyenPaiement {
    public PayPal(String titulaire) {
        super(titulaire);
    }

    @Override
    public void effectuerPaiement(double montant) {
        verifierPaiement(); // Appel à la méthode commune
        System.out.println("Paiement de " + montant + " euros effectué via PayPal.");
    }
}