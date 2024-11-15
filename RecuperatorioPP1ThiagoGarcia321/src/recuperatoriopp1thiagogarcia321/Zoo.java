package recuperatoriopp1thiagogarcia321;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    
    private List<Animal> animales;

    public Zoo() {
        this.animales = new ArrayList<>();
    }

    
    public void agregarAnimal(Animal animal) {
        if(animal == null){
            throw new NullPointerException("Me pasate un null");
        }
        if (animales.contains(animal)) {
            throw new AnimalRepetidoException();
        } 
        animales.add(animal);      
    }

    public void mostrarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales en el zoológico.");
        } else {
            animales.forEach(System.out::println);
        }
    }

    public void vacunarAnimales() {
        for (Animal animal : animales) {
            if (animal instanceof Vacunable) {
                ((Vacunable) animal).vacunar();
            } else {
                System.out.println("No se puede vacunar al animal " + animal.getNombre());
            }
        }
    }
}
