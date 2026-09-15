package com.upiiz.layers.categorias.entities;

import jakarta.persistence.*;

//Capa de base de datos
@Entity
@Table(name="categoria")
public class CategoriaEntity {
    public CategoriaEntity(String descripcion, Long id) {
        this.descripcion = descripcion;
        this.id = id;
    }
    public CategoriaEntity(String descripcion){
        this.descripcion = descripcion;
    }

    public CategoriaEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
