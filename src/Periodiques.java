public class Periodiques extends  Documents {

    private  float freq;
    public Periodiques(String titre, int num_id,int nb_page, float  f) {
        super(titre, num_id, nb_page);

        this.freq=f;
    }
    

    public void Edition() {
        super.Edition();
        System.out.println( "Frequence :" +getFreq() +" type: Periodique ");

    }


   

    public float getFreq() {
        return freq;
    }


    public void setFreq(float freq) {
        this.freq = freq;
    }

   
    

    
}
