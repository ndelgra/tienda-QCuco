package qcuco.tienda.service;

import org.springframework.stereotype.Service;
import qcuco.tienda.dto.CategoriaCrearDto;
import qcuco.tienda.dto.CategoriaDto;
import qcuco.tienda.exception.BlankException;
import qcuco.tienda.exception.DuplicatedException;
import qcuco.tienda.exception.ResourceNotFoundException;
import qcuco.tienda.model.Categoria;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    List<Categoria> categorias = new ArrayList<>();
    private long idGenerada = 1;

    public CategoriaService() {
        // Creamos unas categorías de prueba en memoria
        categorias.add(new Categoria(idGenerada++, "Camisetas", "Camisetas y tops para niños y niñas"));
        categorias.add(new Categoria(idGenerada++, "Pantalones", "Pantalones largos, cortos y vaqueros"));
        categorias.add(new Categoria(idGenerada++, "Abrigos", "Chaquetas, abrigos y ropa de invierno"));
    }

    private CategoriaDto convertToDTO (Categoria c) {
        //Convertimos cada categoría en una categoriaDto
        CategoriaDto categoriaDto = new CategoriaDto(c.getId(), c.getNombre(), c.getDescripcion());
        return categoriaDto;
    }

    public List<CategoriaDto> listar() {
        List<CategoriaDto> categoriasDTO = new ArrayList<>();

        for (Categoria c : categorias) {
            //incluimos nuestras categorías convertidas a dto dentro de nuestra lista y la devolvemos
            categoriasDTO.add(convertToDTO(c));
        }

        return categoriasDTO;
    }

    public CategoriaDto consultar (Long id) {
        /*Revisamos si existe alguna categoría que coincida con el id que nos mandan; si se encuentra
        la categoría, la devolvemos transformada en DTO. Si no la encontramos devolvemos una excepción
        que notifique el error exacto
         */
        for (Categoria c: categorias) {
            if (c.getId().equals(id)) {
                return convertToDTO(c);
            }
        }

        throw new ResourceNotFoundException("Error 404: No se ha encontrado una categoría coincidente");
    }

    private void validar(CategoriaCrearDto c) {
    //Validamos si el nombre recibido como parámetro está vacío o entra en conflicto con otro nombre existente
        if (c == null || estaVacio(c.getNombre())) {
            throw new BlankException("Error 400: El nombre no puede estar vacío");
        }

        if (nombreRepetido(c.getNombre())) {
            throw new DuplicatedException("Error 409: Ya existe una categoría con ese nombre");
        }

    }

    private boolean estaVacio(String s) {
        //Comprobamos si el parámetro que llega está vacío o no
        return s == null || s.isBlank();
    }

    private boolean nombreRepetido(String s) {
        //Comprobamos si ese nombre ya existe
        for (Categoria c: categorias) {
            if (s.equalsIgnoreCase(c.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public CategoriaDto crearCategoria(CategoriaCrearDto c) {
        /*Realizamos nuestras validaciones y si no lanzan una excepción se crea un objeto
        categoría que se añadirá a nuestra lista y devolvemos nuestra categoría convertida
        a DTO gracias a nuestro método
         */
        validar(c);

        Categoria categoria = new Categoria();
        categoria.setId(idGenerada++);
        categoria.setDescripcion(c.getNombre());
        categoria.setDescripcion(c.getDescripcion());

        categorias.add(categoria);

        return convertToDTO(categoria);
    }

    /*public CategoriaDto modificarCategoria(CategoriaDto c) {
        
    }*/

}

