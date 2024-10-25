



public class Documents {

    private  String titre;
    private  int num_id;
    private  int nb_page;

    public void Edition() {
        System.out.println("\nTitre :" + getTitre() + " numero :" + getNum_id()+ " nombre de page " + getNb_page());

    }

    public Documents(String titre, int num_id, int nb_page) {
        this.titre = titre;
        this.num_id = num_id;
        this.nb_page = nb_page;

        
    
    }

    public String getTitre() {
        return titre;
    }

    public int getNum_id() {
        return num_id;
    }

    public int getNb_page() {
        return nb_page;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNum_id(int num_id) {
        this.num_id = num_id;
    }

    public void setNb_page(int nb_page) {
        this.nb_page = nb_page;
    }


    

    






}
