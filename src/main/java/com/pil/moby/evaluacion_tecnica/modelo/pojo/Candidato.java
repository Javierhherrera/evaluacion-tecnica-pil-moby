package main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Candidato implements Comparable<Candidato> {
    private long id;
    private String nombre, apellido;
    private Integer aniosExperiencia;
    private Double pretensionSalarial;
    private List<Tecnologia> tecnologias;


    public Candidato(long id, String nombre, String apellido, Integer aniosExperiencia, Double pretensionSalarial) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.pretensionSalarial = pretensionSalarial;
        this.tecnologias = new ArrayList<>();
    }

    public void agregarTecnologia(Tecnologia tecnologia) {
        tecnologias.add(tecnologia);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidato candidato)) return false;
        return getId() == candidato.getId() && Objects.equals(getNombre(), candidato.getNombre()) && Objects.equals(getApellido(), candidato.getApellido()) && Objects.equals(getAniosExperiencia(), candidato.getAniosExperiencia()) && Objects.equals(getPretensionSalarial(), candidato.getPretensionSalarial()) && Objects.equals(getTecnologias(), candidato.getTecnologias());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido(), getAniosExperiencia(), getPretensionSalarial(), getTecnologias());
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public Double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Nombre y Apellido: ");
        sb.append(this.nombre).append(" ").append(this.apellido)
                .append("\t").append("--- ID: ").append(this.id)
                .append("\t").append("--- Años de Experincia: ").append(this.aniosExperiencia)
                .append("\t").append("--- Pretenciones Salariales: ").append(this.pretensionSalarial).append("\n")
                .append("TECNOLOGIAS: ").append("\n\t");
        for (Tecnologia tec : this.tecnologias) {
            sb.append("* ID: ").append(tec.id).append(" - ")
                    .append("NOMBRE: ").append(tec.nombre).append("\n\t");
        }
        return sb.toString();

    }

    public String toStringTecnologias() {
        StringBuilder tecnologiasString = new StringBuilder();
        for (Tecnologia tecnologia : tecnologias) {
            tecnologiasString.append(tecnologia.getId() + " - " + tecnologia.getNombre() + "\n");
        }
        return tecnologiasString.toString();
    }

    public int compareTo(Candidato c) {
        if(this.getId()<c.getId()){
            return -1;
        }else if(this.getId()>c.getId()){
            return 1;
        }else{
            return 0;
        }
    }

    public List<Tecnologia> ordenarTecnologia(List<Tecnologia> T){
        T.sort(Comparator.comparing(Tecnologia::getNombre));
        return T;
    }

    public int getCantidadTecnologias(){
        return this.getTecnologias().size();
    }
}
