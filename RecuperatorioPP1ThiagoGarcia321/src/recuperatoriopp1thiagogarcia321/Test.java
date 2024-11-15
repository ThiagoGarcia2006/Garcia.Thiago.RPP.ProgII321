package recuperatoriopp1thiagogarcia321;

public class Test {

 
    public static void main(String[] args) {
        
        Animal leon = new Mamifero("León", 5, 190.5, Dieta.CARNIVORO);
        Animal aguila = new Ave("Águila", 3, 2.0);
        Animal iguana = new Reptil("Iguana", 2, "Escamas rugosas", "Ectotérmica");
        Animal leonDuplicado = new Mamifero("León", 5, 200.0, Dieta.OMNIVORO);
        Animal loro = new Ave("Loro", 2, 0.8);

        
        Zoo zoo = new Zoo();

        try {
            
            zoo.agregarAnimal(leon);
            zoo.agregarAnimal(aguila);
            zoo.agregarAnimal(iguana);
            zoo.agregarAnimal(loro);
            zoo.agregarAnimal(leonDuplicado);

        } catch (NullPointerException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (AnimalRepetidoException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        
        System.out.println("Animales en el zoológico: ");
        zoo.mostrarAnimales();

        
        System.out.println("Vacunación de animales: ");
        zoo.vacunarAnimales();
        
            
    
    }
    
}
