package model;

import java.util.Arrays;
import java.util.Objects;

public class Apartamento {
    private int planta;
    private String puerta;
    private Propietario [] propietarios;

    public Apartamento(int planta, String puerta, Propietario[] propietarios) {
        this.planta = planta;
        this.puerta = puerta;
        this.propietarios = propietarios;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Propietario[] getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario[] propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return planta == that.planta && Objects.equals(puerta, that.puerta) && Objects.deepEquals(propietarios, that.propietarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planta, puerta, Arrays.hashCode(propietarios));
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "planta=" + planta +
                ", puerta='" + puerta + '\'' +
                ", propietarios=" + Arrays.toString(propietarios) +
                '}';
    }
}
