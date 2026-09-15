package com.upiiz.layers.categorias.dto;

//Contestar al cliente
public class CategoriaDto {
    private Long id;
    private String decripcion;

    public CategoriaDto() {
    }

    public CategoriaDto(Long id, String decripcion) {
        this.id = id;
        this.decripcion = decripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
}
