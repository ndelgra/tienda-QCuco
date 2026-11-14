package qcuco.tienda.dto;

public class CategoriaCrearDto {
    private String nombre;
    private String descripcion;

    public CategoriaCrearDto() {
    }

    public CategoriaCrearDto(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
