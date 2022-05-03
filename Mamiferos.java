public class Mamiferos extends Animal {

    public Mamiferos(String nome, String corPredominante, String habitat) {
        super(nome, corPredominante, habitat);
        
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
    
}
