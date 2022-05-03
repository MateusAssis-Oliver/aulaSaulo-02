public class Repteis extends Animal {
    
    public Repteis(String nome, String corPredominante, String habitat) {
        super(nome, corPredominante, habitat);
        
    }

    int numPatas;
    boolean anfibio;


    public int getNumPatas() {
        return numPatas;
    }
    
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
}
