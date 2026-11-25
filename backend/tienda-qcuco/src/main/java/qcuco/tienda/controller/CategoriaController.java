package qcuco.tienda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qcuco.tienda.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    //Listar categorías
    @GetMapping
    public ResponseEntity<?> listarCategorias() {
        return ResponseEntity.ok(categoriaService.listar());
    }

    //Consultar categorías
    @GetMapping("/{id]")
    public ResponseEntity<?> consultarCategorias(@PathVariable Long id) {
        return ResponseEntity.ok(categoriaService.consultar(id));
    }
}
