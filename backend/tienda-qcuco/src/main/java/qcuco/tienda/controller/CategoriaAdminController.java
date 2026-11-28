package qcuco.tienda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import qcuco.tienda.dto.CategoriaCrearDto;
import qcuco.tienda.dto.CategoriaDto;
import qcuco.tienda.service.CategoriaService;
import qcuco.tienda.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/admin/categorias")
public class CategoriaAdminController {

    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    public CategoriaAdminController(CategoriaService categoriaService, ProductoService productoService) {
        this.categoriaService = categoriaService;
        this.productoService = productoService;
    }

    // Listar categorías (administración)
    @GetMapping
    public ResponseEntity<List<CategoriaDto>> listarCategoriasAdmin() {
        List<CategoriaDto> c = categoriaService.listar();
        return ResponseEntity.ok(c);
    }

    // Crear una categoría
    @PostMapping
    public ResponseEntity<CategoriaDto> crearCategoria(@RequestBody CategoriaCrearDto c) {
        CategoriaDto categoria = categoriaService.crearCategoria(c);

        return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
    }

    // Modificar una categoría
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaDto> modificar(@PathVariable Long id, @RequestBody CategoriaCrearDto c) {
        CategoriaDto categoria = categoriaService.modificarCategoria(id, c);
        return ResponseEntity.ok(categoria);
    }

    // Eliminamos una categoría
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        categoriaService.eliminar(id);
        return ResponseEntity.noContent().build();

    }
}
