import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        
        ArrayList<Animal> animais = new ArrayList();

        Peixe p = new Peixe("Teste", "azul", "agua", 2, 1.50);

        
        animais.add(p);

        for (Animal i : animais) {
            
        }
    }
}