# QCuco

## Descripción del proyecto
QCuco es una tienda online dedicada a la venta de ropa infantil, para bebés y niños pequeños, ofreciendo diferentes prendas adaptadas a sus necesidades.

## Integrantes del proyecto
- **Persona A:** Nuria Delgado
- **Persona B:** Nuria González

## Ramas de Git
- **Rama de Nuria Delgado:** ndelgado
- **Rama de Nuria González:** ngonzalez

## Correspondencia de clases
En nuestro proyecto mantendremos los nombres originales de las clases genéricas definidas en el enunciado, ya que consideramos que son claros y descriptivos.
<table>
    <tr>
      <th>Clase</th>
      <th>Descripción</th>
    </tr>
    <tr>
      <td>Categoria</td>
      <td>Representa las categorías en las que se organizan los productos.</td>
    </tr>
    <tr>
      <td>Producto</td>
      <td>Contiene la información de cada prenda de la tienda.</td>
    </tr>
    <tr>
      <td>Usuario</td>
      <td>Representa a los usuarios registrados en la tienda.</td>
    </tr>
    <tr>
      <td>Carrito</td>
      <td>Almacena los productos que un usuario desea comprar.</td>
    </tr>
    <tr>
      <td>LineaCarrito</td>
      <td>Representa cada producto y su cantidad dentro del carrito.</td>
    </tr>
    <tr>
      <td>Pedido</td>
      <td>Contiene la información de una compra realizada.</td>
    </tr>
    <tr>
      <td>LineaPedido</td>
      <td>Representa cada producto incluido en un pedido.</td>
    </tr>
</table>


### Enums adicionales
Además de los enums obligatorios, hemos añadido el enum "Sexo" para así clasificar los productos según si están destinados a niño, niña o unisex, facilitando así la organización y filtrado de la tienda.

<table>
    <tr>
      <th>Enum</th>
      <th>Valores</th>
      <th>Descripción</th>
    </tr>
    <tr>
      <td>Rol</td>
      <td>CLIENTE, ADMIN</td>
      <td>Identifica el tipo de usuario.</td>
    </tr>
    <tr>
      <td>EstadoPedido</td>
      <td>PENDIENTE, PAGADO, ENVIADO, ENTREGADO, CANCELADO</td>
      <td>Indica el estado en el que se encuentra un pedido.</td>
    </tr>
    <tr>
      <td>EstadoProducto</td>
      <td>ACTIVO, RETIRADO</td>
      <td>Indica si un producto está activo o ha sido retirado.</td>
    </tr>
    <tr>
      <td>Sexo</td>
      <td>NINIO, NINIA, UNISEX</td>
      <td>Permite clasificar los productos según su público destinatario.</td>
    </tr>
</table>

