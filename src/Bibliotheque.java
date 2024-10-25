

public class Bibliotheque {

    Documents[] listdoc;
    private int nombre_doc;
    private int capcite;

    public Bibliotheque(int capcite) {
        this.listdoc = new Documents[capcite];
        this.nombre_doc = 0;
        this.capcite = capcite;
    }

    public int getCapcite() {
        return capcite;
    }

    public void ajouter(Documents d) {
        if (nombre_doc < capcite) {
            listdoc[nombre_doc] = d;
            nombre_doc++;
            trie();
        } else {
            System.out.println("La capacité est maximale !");
        }
    }




  
    public void trie() {
        for (int i = 0; i < getNombre_doc() - 1; i++) {
            for (int j = i + 1; j < getNombre_doc(); j++) {
               
                if (listdoc[i] != null && listdoc[j] != null) {
                    if (listdoc[i].getNum_id() > listdoc[j].getNum_id()) {
                        Documents temp = listdoc[i];
                        listdoc[i] = listdoc[j];
                        listdoc[j] = temp;
                    }
                }
            }
        }
    }
    

    void supprim_doc(int num)
    {
        boolean trouve =false;

        for (int i = 0; i <getNombre_doc()-1; i++) {

            if(this.listdoc[i].getNum_id()==num)
            {
                for (int j = i; j < getNombre_doc(); j++) {

                    
                    listdoc[i] = listdoc[j];

                    
                    

                    
                }
                
                nombre_doc--;
            }

            trouve=true;
            
        }

        if(trouve==false)
        {
            System.out.println("ne trouve pas ");
        }
    }

    public Documents[] getListdoc() {
        return listdoc;
    }

    public void setListdoc(Documents[] listdoc) {
        this.listdoc = listdoc;
    }

    public int getNombre_doc() {
        return nombre_doc;
    }

    public void setNombre_doc(int nombre_doc) {
        this.nombre_doc = nombre_doc;
    }

    public void setCapcite(int capcite) {
        this.capcite = capcite;
    }

    
    public void Inventaire_doc() {
        for (Documents doc : listdoc) {
            if (doc != null) {  
                if (doc instanceof Livre) {
                    System.out.print("Livre: ");


                } 
                
                
                else if (doc instanceof Article) {
                    System.out.print("Article: ");
                }
                
        else if (doc instanceof Periodiques) {
                    System.out.print("Periodique: ");
                }
             else {
                    System.out.print("Document simple: ");
                }
                doc.Edition();
            }
        }
    }
    
     



    public Bibliotheque liste_livre() {

        Bibliotheque biblioLivres = new Bibliotheque(this.capcite);
        for (Documents doc : listdoc) {
            if (doc instanceof Livre) {
                biblioLivres.ajouter(doc);
            }
        }
        return biblioLivres;
    }

    public Bibliotheque liste_article() {
        Bibliotheque biblioArticles = new Bibliotheque(this.capcite);
        for (Documents doc : listdoc) {
            if (doc instanceof Article && !(doc instanceof Livre)) {
                biblioArticles.ajouter(doc);
            }
        }
        return biblioArticles;
    }


    public Bibliotheque liste_periodique() {
        Bibliotheque biblioPeriodiques = new Bibliotheque(this.capcite);
        for (Documents doc : listdoc) {
            if (doc instanceof Periodiques) {
                biblioPeriodiques.ajouter(doc);
            }
        }
        return biblioPeriodiques;
    }

    public Bibliotheque liste_docsimples() {
        Bibliotheque biblioDocsSimples = new Bibliotheque(this.capcite);
        for (Documents doc : listdoc) {
            if (!(doc instanceof Article || doc instanceof Periodiques)) {
                biblioDocsSimples.ajouter(doc);
            }
        }
        return biblioDocsSimples;
    }


    


}



