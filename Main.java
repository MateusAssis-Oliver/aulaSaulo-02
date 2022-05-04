import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        
        ArrayList<Animal> animais = new ArrayList<Animal>();

        Peixe p = new Peixe("Teste", "azul", "agua", 2, 1.50);
        Repteis r = new Repteis("Teste2", "red", "habitat", 2, true);
        Mamiferos m = new Mamiferos("Teste3", "Roza", "terra", 2.3, "grama");

        
        animais.add(p);
        animais.add(r);
        animais.add(m);

        for (Animal i : animais) {

            
            if( i instanceof  Peixe ){

                if( ( (Peixe) i).getId() < 10) {

                    ((Peixe) i).showCaracteristicasF();
                }

            }
            else if( i instanceof  Mamiferos ) {

                if( ( (Mamiferos) i).getId() < 10) {

                    ((Mamiferos) i).showCaracteristicasF();

                }

            }else if(i instanceof  Repteis ) {

                if( ( (Mamiferos) i).getId() < 10) {

                    ((Mamiferos) i).showCaracteristicasF();

                }

            }
        }
    }
}