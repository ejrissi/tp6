public class Article extends  Documents 
{

    private  String nom_aut;


     public Article(String titre, int num_id, int nb_page,String nom) {
        super(titre, num_id, nb_page);

        this.nom_aut=nom;






       
    }


  


    public void Edition() {
        super.Edition();
        System.out.println(  "Nom auteur : " + getNom_aut() +" type: Article ");

    }

    public String getNom_aut() {
        return nom_aut;
    }

    public void setNom_aut(String nom_aut) {
        this.nom_aut = nom_aut;
    }

    
    
}
