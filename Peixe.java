public class Peixe extends Animal {
    
    public Peixe(String nome, String corPredominante, String habitat, int numeroBarbatanas, Double comprimento) {
        super(nome, corPredominante, habitat);
        
    }

    int numeroBarbatanas;
    double comprimento;


    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public int getNumeroBarbatanas() {
        return numeroBarbatanas;
    }
    public void setNumeroBarbatanas(int numeroBarbatanas) {
        this.numeroBarbatanas = numeroBarbatanas;
    }

    public void showCaracteristicas() {

    }


    
    
}
