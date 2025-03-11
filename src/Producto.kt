
data class Producto(
    val codigo: String,
    var nombre: String,
    var precio: Double,
    var cantidadEnStock: Int
    ) {
    fun vender(cantidad: Int) {
        if (cantidadEnStock >= cantidad) {
            cantidadEnStock -= cantidad
            println("la venta se a realizado con exito.")
        } else {
            println("el producto no es suficioente")
        }
    }

    fun reponer(cantidad: Int) {
        cantidadEnStock += cantidad
        println("Se han agregado con exito.")
    }

    fun aplicarDescuento(porcentaje: Double) {
        println("ingrese el descuento a aplicar")
        val descuento =  readLine()
        val descuentoaplicado = precio * (descuento / 100)
        precio -= descuentoaplicado
        println("el descuento se ha realizado con exito: $precio")
    }
    val productos = mutableListOf<Producto>()

    fun mostrarInformacion() {
        println("Código: $codigo, Nombre: $nombre, Precio: $precio, Stock: $cantidadEnStock")
    }

    fun aumentarPrecio(incremento: Double) {
        println("ingrese la cantidad a subir a los precios")
        val incremento =  readLine()
        val precio = precio += incremento
        println("Se ha aumentado el precio")
    }



    fun calcularValorTotalInventario() {

        val totalinventario = cantidadEnStock * precio
        println(" el total de inventario es $totalinventario")

    }

    fun crearProducto(codigo: String, nombre: String, precio: Double, cantidadEnStock: Int) {
        val producto = Producto(codigo, nombre, precio, cantidadEnStock)
        productos.add(producto)
        println("Producto creado: ${producto.nombre}")
    }

    fun eliminarProductoPorCodigo(codigo: String) {
        val productoEliminado = productos.removeIf { it.codigo == codigo }
        if (productoEliminado) {
            println("Producto con código $codigo ha sido eliminado.")
        } else {
            println("No se encontró un producto con código $codigo.")
        }
    }

    fun mostrarProductos() {
        if (productos.isEmpty()) {
            println("No hay productos en la tienda.")
        } else {
            for (producto in productos) {
                producto.mostrarInformacion()
            }
        }
    }

}