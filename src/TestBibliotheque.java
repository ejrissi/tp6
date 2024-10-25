
public class TestBibliotheque {

    public static void main(String[] args) {

        Bibliotheque biblio = new Bibliotheque(10);
        Documents doc1 = new Documents("Document 1", 101, 50);

        Article article1 = new Article("Article 1", 102, 30, "Auteur 1");
        Livre livre1 = new Livre("Livre 1", 103, 200, "Auteur 2", "Éditeur 1");
        Periodiques periodique1 = new Periodiques("Periodique 1", 104, 40, (float) 2.2);

        biblio.ajouter(doc1);
        biblio.ajouter(article1);
        biblio.ajouter(livre1);
        biblio.ajouter(periodique1);

        System.out.println("\nla liste de tous les documents avec leurs types.");

        biblio.Inventaire_doc();

        System.out.println("le nombre de documents. :" + biblio.getNombre_doc());

        System.out.println(" Liste des livres:");

        Bibliotheque biblioLivres = biblio.liste_livre();
        biblioLivres.Inventaire_doc();

        
        
        System.out.println("\n Liste des périodiques:");
        Bibliotheque biblioPeriodiques = biblio.liste_periodique();
        biblioPeriodiques.Inventaire_doc();


        System.out.println("\n Liste des articles:");
        Bibliotheque biblioArticles = biblio.liste_article();
        biblioArticles.Inventaire_doc();


        System.out.println("\n Liste des document simple");

        Bibliotheque bibliodocument =biblio.liste_docsimples();

        bibliodocument.Inventaire_doc();



    }

}
