package model;

import java.util.Objects;

public class Apartamento {
    private String planta;
    private String puerta;
    private int propietarios;

    public Apartamento(String planta, String puerta, int propietarios) {
        this.planta = planta;
        this.puerta = puerta;
        this.propietarios = propietarios;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public int getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(int propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return propietarios == that.propietarios && Objects.equals(planta, that.planta) && Objects.equals(puerta, that.puerta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planta, puerta, propietarios);
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "planta='" + planta + '\'' +
                ", puerta='" + puerta + '\'' +
                ", propietarios=" + propietarios +
                '}';
    }
}
