package qcuco.tienda.model;

import qcuco.tienda.model.enums.EstadoPedido;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Long id;
    private String codigo;
    private Usuario usuario;
    private Date fecha;
    private EstadoPedido estado;
    private String direccionEnvio;
    private Double subtotal;
    private Double gastosEnvio;
    private Double total;
    private List<LineaPedido> lineas;

    public Pedido(Long id, String codigo, Usuario usuario, Date fecha, EstadoPedido estado, String direccionEnvio, Double subtotal, Double gastosEnvio, Double total, List<LineaPedido> lineas) {
        this.id = id;
        this.codigo = codigo;
        this.usuario = usuario;
        this.fecha = fecha;
        this.estado = estado;
        this.direccionEnvio = direccionEnvio;
        this.subtotal = subtotal;
        this.gastosEnvio = gastosEnvio;
        this.total = total;
        this.lineas = lineas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(Double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<LineaPedido> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaPedido> lineas) {
        this.lineas = lineas;
    }
}
