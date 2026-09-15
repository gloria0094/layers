package com.upiiz.layers.categorias;

import com.upiiz.layers.categorias.dto.CategoriaDto;
import com.upiiz.layers.categorias.dto.NuevaCategoriaDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Capa de presentación - {JSON} -Navegador, cliente REST(Insomnia, postman)
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private CategoriaServicelmpl categoriaServicelmpl;

    CategoriaController(CategoriaServicelmpl categoriaServicelmpl){
        this.categoriaServicelmpl= categoriaServicelmpl;
    }
    //Varios point o rutas
    //get de todas las categorias
    //Get de una categoria
    //Post de una categoria
    @PostMapping()
    public CategoriaDto save(@RequestBody NuevaCategoriaDto nuevaCategoriaDto){
        return categoriaServicelmpl.save(nuevaCategoriaDto);
    }
}
