package qcuco.tienda.model;

public class LineaCarrito {
    private Long id;
    private Producto producto;
    private Integer cantidad;
    private Carrito carrito;

    public LineaCarrito(Long id, Producto producto, Integer cantidad, Carrito carrito) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.carrito = carrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
