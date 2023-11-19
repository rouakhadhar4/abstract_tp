package abstract_tp;

public class Fiscalité {

    public static void main(String[] args) {
        Personne p1 = new Personne(14433369, "khadhar", "roua");
        Personne p2 = new Personne(144333680, "hlaili", "ahlem");
        Personne p3 = new Personne(144333900, "khadhar", "hatem");

        Lotissement L = new Lotissement(10);
        PropriétéPrivée p4 = new PropriétéPrivée(1, p1, "Corniche", 350, 4);
        Villa v = new Villa(2, p2, "Dar Chaabane", 400, 6, true);
        Appartement A = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        PropriétéProfessionnelle A1 = new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true);
        PropriétéProfessionnelle A2 = new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false);

        L.ajouter(p4);
        L.ajouter(v);
        L.ajouter(A);
        L.ajouter(A1);
        L.ajouter(A2);

        L.afficherPropriétés();
        System.out.println("Le nombre des pièces : " + L.getnbPièces());
        System.out.println(L.getPropriétéByIndice(3));

        Propriété appartementHammamet = L.getPropriétéByIndice(3);
        if (L.supprimer(appartementHammamet)) {
            System.out.println("Appartement de Hammamet est supprimé avec succès.");
        } else {
            System.out.println("Impossible de supprimer Hammamet.");
        }

        L.afficherPropriétés();
        System.out.println("La propriété privée qui paie le moins d'impôts:");

        PropriétéPrivée a = null;

        for (int i = 0; i < L.nombre; i++) {
            if (L.getPropriétéByIndice(i) instanceof PropriétéPrivée) {
                PropriétéPrivée b = (PropriétéPrivée) L.getPropriétéByIndice(i);
                if (a == null || a.calculImpot() > b.calculImpot()) {
                    a = b;
                }
            }
        }

        if (a != null) {
            System.out.println("Propriétaire: " + a.toString());
            System.out.println("Montant des impôts qu'il va payer: " + a.calculImpot());
        } else {
            System.out.println("Aucune propriété privée trouvée dans le lotissement.");
        }
    
        System.out.println("******Lotissement privee*******");

        Lotissement lt = new LotissementPrivée(10);
        lt.ajouter(p4);
        lt.ajouter(v);
        lt.ajouter(A);
        System.out.println(L.getPropriétéByIndice(2));
        

        lt.afficherPropriétés();
        System.out.println("Le nombre des pièces : " + lt.getnbPièces());
        
        
}
}
