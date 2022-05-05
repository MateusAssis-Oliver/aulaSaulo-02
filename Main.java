import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<Animal>();

        Peixe p = new Peixe("Atum", "azul", "agua", 2, 1.50);
        Repteis r = new Repteis("Largaticha", "Cinza", "Terra", 2, true);
        Mamiferos m = new Mamiferos("Cavalo", "Marom", "Terra", 2.3, "Grama");

        animais.add(p);
        animais.add(r);
        animais.add(m);

        for (Animal i : animais) {

            if (i instanceof Peixe) {

                if (((Peixe) i).getId() < 10) {

                    ((Peixe) i).showCaracteristicasF();
                }

            } else if (i instanceof Mamiferos) {

                if (((Mamiferos) i).getId() < 10) {

                    ((Mamiferos) i).showCaracteristicasF();

                }

            } else if (i instanceof Repteis) {

                if (((Repteis) i).getId() < 10) {

                    ((Repteis) i).showCaracteristicasF();

                }

            }
        }

        System.out.print("\n\n");

        for (Animal j : animais) {
            
            if (j instanceof Peixe) {

                System.out.println( "id Peixe : " + ( (Peixe) j).getId() );

            } else if (j instanceof Mamiferos) {
            
                System.out.println( "id Mamiferos : " + ( (Mamiferos) j).getId() );

            } else if (j instanceof Repteis) {
            
                System.out.println( "id Repteis : " + ( (Repteis) j).getId() );
            }
        }
    }
}



