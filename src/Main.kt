
fun main() {
    val Producto = Tienda()
    while (true){
        println("""
            buen dia, ingreses alfunas de las siguentes opciones 
            1 crear nuevo producto
            2 vender producto 
            3 Reponer stock
            4 aplicar descuentos 
            5 mostrar informacion de los productos
            6 modificar precios
            7 total de inventario
            8 eliminar producto por codigp
            9 salir
        """.trimIndent())
        when(readLine()?.toIntOrNull()){

            1->{
              Producto.crearproducto()
            }
            2->{
                Producto.productos[0].vender(0)
            }
            3->{
                Producto.productos[0].reponer(0)
            }
            4->{
                Producto.productos[0].aplicarDescuento(5.0)
            }
            5->{
                Producto.mostrarProductos()
            }
            6->{
                Producto.productos[1].aumentarPrecio(5.0)
            }
            7->{
                Producto.run { productos.calcularValorTotalInventario(0) }
            }
            8->{
                Producto.eliminarProductoPorCodigo("")
            }
            9->{
                return

            }
        }



    }
}