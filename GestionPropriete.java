package abstract_tp;

public interface GestionPropriete {
	public static final int MAX_PROPRIETES=30;
	void afficherPropriétés();
	boolean ajouter(Propriété p);
	boolean supprimer(Propriété p);

}
