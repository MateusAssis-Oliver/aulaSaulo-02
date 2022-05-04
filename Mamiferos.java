public class Mamiferos extends Animal {

    public Mamiferos(String nome, String corPredominante, String habitat, double velocidade, String tipoAlimentação) {
        super(nome, corPredominante, habitat);
        
        this.velocidade = velocidade; 
        this.tipoAlimentação = tipoAlimentação;
    }
    double velocidade; 
    String tipoAlimentação;


    public String getTipoAlimentação() {
        return tipoAlimentação;
    }
    public void setTipoAlimentação(String tipoAlimentação) {
        this.tipoAlimentação = tipoAlimentação;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void showCaracteristicasF(){

        showCaracteristicasP();

        System.out.println(
        "Velocidade : "+ this.velocidade +
        "\nTipo De Alimentação : " + this.tipoAlimentação );

    }


    
}
