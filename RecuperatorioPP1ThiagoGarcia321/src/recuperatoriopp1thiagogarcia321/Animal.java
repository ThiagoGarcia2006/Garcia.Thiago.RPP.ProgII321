package recuperatoriopp1thiagogarcia321;

import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal other = (Animal) o;
        return nombre.equals(other.nombre) && edad == other.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
