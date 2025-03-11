class Tienda {
    val productos = mutableListOf<Producto>()

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

