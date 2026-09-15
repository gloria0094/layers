package com.upiiz.layers.categorias;

import com.upiiz.layers.categorias.dto.CategoriaDto;
import com.upiiz.layers.categorias.dto.NuevaCategoriaDto;

import java.util.List;

//Contrato - Entre programadores
public interface CategoriaService {
    //Request -nombre,etc
    //Response - id, nombre, etc
    //Request - descripción
    //Response - id, descripción
    //Guarde la categoria
    CategoriaDto save(NuevaCategoriaDto nuevaCategoriaDto);
    //Muestre todas las categorias
    List<CategoriaDto> findAll();
    //Actualice una categoria
    CategoriaDto update(Long id, NuevaCategoriaDto updateCategoriaDto);
    //Borre una categoria
    void delete(Long id);

}
