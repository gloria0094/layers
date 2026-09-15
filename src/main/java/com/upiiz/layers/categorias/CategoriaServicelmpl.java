package com.upiiz.layers.categorias;

import com.upiiz.layers.categorias.dto.CategoriaDto;
import com.upiiz.layers.categorias.dto.NuevaCategoriaDto;
import com.upiiz.layers.categorias.entities.CategoriaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

//Capa de negocio
@Service
public class CategoriaServicelmpl implements CategoriaService{

    private CategoriaRepository categoriaRepository;

    CategoriaServicelmpl(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }


    @Override
    public CategoriaDto save(NuevaCategoriaDto nuevaCategoriaDto) {
        categoriaRepository.findByDescripcionIgnoreCase(nuevaCategoriaDto.getDescripcion()).ifPresent(e ->{
            //Mandar un error
            throw  new IllegalArgumentException("La categoria ya existe en el sistema");
            //Terminar metodo
        });
        CategoriaEntity nuevaCategoria = new CategoriaEntity(nuevaCategoriaDto.getDescripcion());
        CategoriaEntity categoriaGuardada= categoriaRepository.save(nuevaCategoria);
        return new CategoriaDto(categoriaGuardada.getId(),categoriaGuardada.getDescripcion());

        //Reglas de negocios
        //Una de ellas que no se duplique el nombre de la categoria
        //No importa si es con mayuscula o minuscula
        //No se debe publicar
    }

    @Override
    public List<CategoriaDto> findAll() {
        return List.of();
    }

    @Override
    public CategoriaDto update(Long id, NuevaCategoriaDto updateCategoriaDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
