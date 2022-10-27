
package com.portfolio.mi.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHabilidad {
    @NotBlank
    private String titulo;
    @NotBlank
    private int porcentaje;
    
    public dtoHabilidad() {
    }

    public dtoHabilidad(String titulo, int porcentaje) {
        this.titulo = titulo;
        this.porcentaje = porcentaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
