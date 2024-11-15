package recuperatoriopp1thiagogarcia321;

class Reptil extends Animal {
    private String tipoEscama;
    private String regulacionTemperatura;

    public Reptil(String nombre, int edad, String tipoEscama, String regulacionTemperatura) {
        super(nombre, edad); 
        this.tipoEscama = tipoEscama;
        this.regulacionTemperatura = regulacionTemperatura;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de escama: " + tipoEscama +
                ", Regulación de temperatura: " + regulacionTemperatura;
    }
}
