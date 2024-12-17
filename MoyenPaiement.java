abstract class MoyenPaiement implements Paiement {
    protected String titulaire; // Nom du titulaire du compte

    public MoyenPaiement(String titulaire) {
        this.titulaire = titulaire;
    }

    // Méthode concrète commune
    public void verifierPaiement() {
        System.out.println("Vérification du paiement pour le titulaire : " + titulaire);
    }

    // Méthode abstraite de Paiement (héritée de l'interface)
    @Override
    public abstract void effectuerPaiement(double montant);
}