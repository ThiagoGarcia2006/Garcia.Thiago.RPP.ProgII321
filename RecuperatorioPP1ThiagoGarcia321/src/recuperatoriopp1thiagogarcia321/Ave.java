package recuperatoriopp1thiagogarcia321;

class Ave extends Animal implements Vacunable {
    private double envergadura;

    public Ave(String nombre, int edad, double envergadura) {
        super(nombre, edad); 
        this.envergadura = envergadura;
    }

    @Override
    public void vacunar() {
        System.out.println("Ave " + getNombre() + " vacunada.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Envergadura: " + envergadura + "m";
    }
}
