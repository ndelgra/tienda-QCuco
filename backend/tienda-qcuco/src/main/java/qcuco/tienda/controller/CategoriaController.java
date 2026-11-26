package qcuco.tienda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qcuco.tienda.dto.CategoriaDto;
import qcuco.tienda.service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    //Listar categorías
    @GetMapping
    public ResponseEntity<List<CategoriaDto>> listarCategorias() {
        List<CategoriaDto> c = categoriaService.listar();
        return ResponseEntity.ok(c);
    }

    //Consultar categorías
    @GetMapping("/{id]")
    public ResponseEntity<CategoriaDto> consultarCategorias(@PathVariable Long id) {
        CategoriaDto c = categoriaService.consultar(id);
        return ResponseEntity.ok(c);
    }
}
