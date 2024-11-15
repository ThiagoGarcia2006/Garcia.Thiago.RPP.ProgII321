package recuperatoriopp1thiagogarcia321;

class Mamifero extends Animal implements Vacunable {
    private double peso;
    private Dieta dieta;

    public Mamifero(String nombre, int edad, double peso, Dieta dieta) {
        super(nombre, edad); 
        this.peso = peso;
        this.dieta = dieta;
    }

    @Override
    public void vacunar() {
        System.out.println("Mamífero " + getNombre() + " vacunado.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Peso: " + peso + "kg, Dieta: " + dieta;
    }
}
