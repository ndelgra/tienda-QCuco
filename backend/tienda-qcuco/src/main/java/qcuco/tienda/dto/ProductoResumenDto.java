package qcuco.tienda.dto;

import qcuco.tienda.model.enums.Sexo;

import java.math.BigDecimal;

public class ProductoResumenDto {
    private Long id;
    private String nombre;
    private BigDecimal precio;
    private String imagenUrl;
    private Boolean destacado;
    private String nombreCategoria;
    private Sexo sexo;

    public ProductoResumenDto() {
    }

    public ProductoResumenDto(Long id, String nombre, BigDecimal precio, String imagenUrl, Boolean destacado, String nombreCategoria, Sexo sexo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.imagenUrl = imagenUrl;
        this.destacado = destacado;
        this.nombreCategoria = nombreCategoria;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Boolean getDestacado() {
        return destacado;
    }

    public void setDestacado(Boolean destacado) {
        this.destacado = destacado;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
