public class Peixe extends Animal {
    
    public Peixe(String nome, String corPredominante, String habitat, int numeroBarbatanas, Double comprimento) {
        super(nome, corPredominante, habitat);
        
        this.numeroBarbatanas = numeroBarbatanas;
        this.comprimento = comprimento;
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

    public void showCaracteristicasF(){

        showCaracteristicasP();
        System.out.println(
        "Numero Barbatanas : "+ this.numeroBarbatanas +
        "\nComprimento : " + this.comprimento );

    }


    
    
}
