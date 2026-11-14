package qcuco.tienda.model;

public class LineaCarrito {
    private Integer id;
    private Producto producto;
    private Integer cantidad;
    private Carrito carrito;

    public LineaCarrito(Integer id, Producto producto, Integer cantidad, Carrito carrito) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.carrito = carrito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
