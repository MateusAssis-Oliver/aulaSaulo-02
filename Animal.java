import java.util.Random;

public abstract class Animal {
    
    String nome;
    String corPredominante;
    String habitat;
    int id ;

    public Animal(String nome, String corPredominante, String habitat){
        this.nome = nome;
        this.corPredominante = corPredominante;
        this.habitat = habitat;
        radonId();

    }

    public String getCorPredominante() {
        return corPredominante;
    }
    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void radonId(){

        Random random = new Random();
        this.id  = random.nextInt(10);

    }

    public void showCaracteristicasP(){

        System.out.println("\n\nNome : " + this.nome + 
        "\nCor Predominante : " + this.corPredominante +
        "\nHabitat : " + this.habitat +
        "\nId : " + this.id );

    }


}
