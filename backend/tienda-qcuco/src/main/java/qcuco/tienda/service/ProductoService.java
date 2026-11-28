package qcuco.tienda.service;

import org.springframework.stereotype.Service;
import qcuco.tienda.dto.CategoriaDto;
import qcuco.tienda.model.Categoria;
import qcuco.tienda.model.Producto;
import qcuco.tienda.model.enums.EstadoProducto;
import qcuco.tienda.model.enums.Sexo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductoService {
    private List<Producto> productos = new ArrayList<>();
    private long idGenerada = 1;

    private final CategoriaService categoriaService;

    public ProductoService(CategoriaService categoriaService){
        this.categoriaService = categoriaService;

        // Camisetas
        productos.add(new Producto(
                idGenerada++,
                "CAM-001",
                "Polo de bebé",
                "Polo de bebé de manga corta, textura seersucker",
                new BigDecimal("9.99"),
                15,
                "https://dam.elcorteingles.es/producto/www-001086413701508-s0.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(1),
                Sexo.NINIO,
                EstadoProducto.ACTIVO,
                "9-12 meses",
                "Blanco roto"
        ));

        productos.add(new Producto(
                idGenerada++,
                "CAM-002",
                "Camiseta de bebé",
                "Camiseta de bebé de manga larga, 100% algodón y con estampado",
                new BigDecimal("12.99"),
                10,
                "https://dam.elcorteingles.es/producto/www-5605300232882-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(1),
                Sexo.NINIA,
                EstadoProducto.ACTIVO,
                "12-18 meses",
                "Rosa"
        ));

        productos.add(new Producto(
                idGenerada++,
                "CAM-003",
                "Camiseta con cuello",
                "Camiseta basica de manga larga, con cuello para bebé",
                new BigDecimal("5.99"),
                20,
                "https://dam.elcorteingles.es/producto/www-001089950717150-s0.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(1),
                Sexo.UNISEX,
                EstadoProducto.ACTIVO,
                "6-9 meses",
                "Blanco"
        ));

        productos.add(new Producto(
                idGenerada++,
                "CAM-004",
                "Camiseta Tommy Hilfiger",
                "Camiseta de niño de manga corta, de Tommy Hilfiger",
                new BigDecimal("19.90"),
                12,
                "https://dam.elcorteingles.es/producto/www-001096410503054-s0.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(1),
                Sexo.NINIO,
                EstadoProducto.ACTIVO,
                "12-18 meses",
                "Blanco"
        ));

        //Pantalones
        productos.add(new Producto(
                idGenerada++,
                "PAN-001",
                "Pantalon de niña con cinturon",
                "Pantalón de bebé niña 100% algodón y con cinturón floral",
                new BigDecimal("22.99"),
                10,
                "https://dam.elcorteingles.es/producto/www-5605300101331-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(2),
                Sexo.NINIA,
                EstadoProducto.ACTIVO,
                "9-12 meses",
                "Azul"
        ));

        productos.add(new Producto(
                idGenerada++,
                "PAN-002",
                "Pantalon de pierna ancha",
                "Pantalón de bebé con pierna ancha y cintura elástica",
                new BigDecimal("24.95"),
                15,
                "https://dam.elcorteingles.es/producto/www-001041240204739-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(2),
                Sexo.NINIA,
                EstadoProducto.ACTIVO,
                "12-18 meses",
                "Rosa palo"
        ));

        productos.add(new Producto(
                idGenerada++,
                "PAN-003",
                "Pantalón vaquero cargo",
                "Pantalón de bebé cargo, pierna ancha y con bolsillos",
                new BigDecimal("17.99"),
                15,
                "https://dam.elcorteingles.es/producto/www-001086400501341-s0.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(2),
                Sexo.NINIO,
                EstadoProducto.ACTIVO,
                "6-9 meses",
                "Azul Pálido"
        ));

        productos.add(new Producto(
                idGenerada++,
                "PAN-004",
                "Pantalón largo de bebé",
                "Pantalón largo de bebé con bolsillos",
                new BigDecimal("30"),
                20,
                "https://dam.elcorteingles.es/producto/www-001032824200532-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(2),
                Sexo.UNISEX,
                EstadoProducto.ACTIVO,
                "6 meses",
                "Vainilla"
        ));


        // Abrigos
        productos.add(new Producto(
                idGenerada++,
                "ABR-001",
                "Parka de bebé",
                "Parka engomada de bebé, estampada de STITCH",
                new BigDecimal("32.99"),
                5,
                "https://dam.elcorteingles.es/producto/www-001052116700361-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(3),
                Sexo.NINIA,
                EstadoProducto.ACTIVO,
                "18 meses",
                "Blanco"
        ));

        productos.add(new Producto(
                idGenerada++,
                "ABR-002",
                "Abrigo de bebé",
                "Abrigo de niño acolchado con capucha",
                new BigDecimal("61.95"),
                5,
                "https://dam.elcorteingles.es/producto/www-8447333419673-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(3),
                Sexo.NINIO,
                EstadoProducto.ACTIVO,
                "12-18 meses",
                "Azul Marino"
        ));

        productos.add(new Producto(
                idGenerada++,
                "ABR-003",
                "Abrigo de vestir",
                "Abrigo de vestir de niña, acolchado y con capucha",
                new BigDecimal("29.99"),
                10,
                "https://dam.elcorteingles.es/producto/www-001089988904291-s0.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(3),
                Sexo.NINIA,
                EstadoProducto.ACTIVO,
                "18-24 meses",
                "Rosa"
        ));

        productos.add(new Producto(
                idGenerada++,
                "ABR-004",
                "Plumas de bebé",
                "Plumas de bebé acolchado con capucha, estampado del espacio",
                new BigDecimal("54.95"),
                10,
                "https://dam.elcorteingles.es/producto/www-001041230001822-00.jpg?impolicy=frontWebHQ",
                false,
                new Date(),
                obtenerCategoria(3),
                Sexo.NINIO,
                EstadoProducto.ACTIVO,
                "12-18 meses",
                "Azul"
        ));
    }

    private Categoria obtenerCategoria(long id) {
        CategoriaDto dto = categoriaService.consultar(id);

        return new Categoria(dto.getId(),  dto.getNombre(), dto.getDescripcion());
    }

    public boolean tieneProductos(long idCategoria) {
        for (Producto p : productos) {
            if (p.getCategoria().getId().equals(idCategoria)) {
                return true;
            }
        }
        return false;
    }
}
