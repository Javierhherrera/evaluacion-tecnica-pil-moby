package main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.Objects;

public class Tecnologia {
    Long id;
    String nombre;

    public Tecnologia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tecnologia that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNombre(), that.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre());
    }

    @Override
    public String toString() {
        return "ID Tecnologia: " + id +
                ", Nombre Tecnología: " + nombre;
    }

    public Boolean esIdPar(){
        return this.id % 2 == 0;
    }
}
