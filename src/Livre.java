



public  class  Livre extends  Article
{
    private  String nom_ed;


    public Livre(String titre, int num_id, int nb_page, String nom,String ed) {

        super(titre,num_id,nb_page,nom);
        this.nom_ed=ed;
    }

    public void Edition() {
        super.Edition();
        System.out.println( "Editeur :" +getNom_ed() +" type: Livre ");

    }


    public String getNom_ed() {
        return nom_ed;
    }

    public void setNom_ed(String nom_ed) {
        this.nom_ed = nom_ed;
    }







   


}