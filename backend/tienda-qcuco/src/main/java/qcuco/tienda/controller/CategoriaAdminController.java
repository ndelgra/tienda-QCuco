package qcuco.tienda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import qcuco.tienda.dto.CategoriaCrearDto;
import qcuco.tienda.dto.CategoriaDto;
import qcuco.tienda.service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/api/admin/categorias")
public class CategoriaAdminController {

    private final CategoriaService categoriaService;

    public CategoriaAdminController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
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


}
