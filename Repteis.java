public class Repteis extends Animal {
    
    public Repteis(String nome, String corPredominante, String habitat, int numPatas, boolean anfibio) {
        super(nome, corPredominante, habitat);
        
        this.numPatas = numPatas;
        this.anfibio = anfibio;

    }

    int numPatas;
    boolean anfibio;


    public int getNumPatas() {
        return numPatas;
    }
    
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void showCaracteristicasF(){

        showCaracteristicasP();
        System.out.println(
        "Numero De Patas : "+ this.numPatas +
        "\nAnfibio ? : " + this.anfibio );

    }
}
