package qcuco.tienda.model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private Long id;
    private Usuario usuario;
    private List<LineaCarrito> lineas = new ArrayList<LineaCarrito>();

    public Carrito(Long id, Usuario usuario, List<LineaCarrito> lineas) {
        this.id = id;
        this.usuario = usuario;
        this.lineas = lineas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<LineaCarrito> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaCarrito> lineas) {
        this.lineas = lineas;
    }
}
