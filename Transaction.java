public class Transaction {
    public static void main(String[] args) {
        // Création des moyens de paiement
        MoyenPaiement paiementCarte = new CarteBancaire("Jean Dupont");
        MoyenPaiement paiementPayPal = new PayPal("Alice Martin");

        // Utilisation des moyens de paiement
        paiementCarte.effectuerPaiement(150.75);
        paiementPayPal.effectuerPaiement(89.99);
    }
}
