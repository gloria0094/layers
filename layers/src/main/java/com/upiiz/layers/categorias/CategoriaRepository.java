package com.upiiz.layers.categorias;

import com.upiiz.layers.categorias.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Capa de persistencia -omr -jpa
//Extends - heredar
//Implements - Implementar una interface
@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
    //Agregar metodos
    Optional<CategoriaEntity> findByDescripcionIgnoreCase(String descripcion);

}
