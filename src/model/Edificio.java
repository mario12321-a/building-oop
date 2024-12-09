package model;

import java.util.Objects;

public class Edificio {
    private String direccion;
    private String municipio;
    private String Apartamentos;

    public Edificio(String direccion, String municipio, String apartamentos) {
        this.direccion = direccion;
        this.municipio = municipio;
        Apartamentos = apartamentos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getApartamentos() {
        return Apartamentos;
    }

    public void setApartamentos(String apartamentos) {
        Apartamentos = apartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(direccion, edificio.direccion) && Objects.equals(municipio, edificio.municipio) && Objects.equals(Apartamentos, edificio.Apartamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, municipio, Apartamentos);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", municipio='" + municipio + '\'' +
                ", Apartamentos='" + Apartamentos + '\'' +
                '}';
    }
}
