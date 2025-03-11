
fun main() {
    val tienda = Tienda()
    val proceso = Int
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
         proceso = readlnOrNull()
        when(proceso){

            1->{
              tienda.crearproducto()
            }
            2->{
                tienda.productos[0].vender(0)
            }
            3->{
                tienda.productos[0].reponer(0)
            }
            4->{
                tienda.productos[0].aplicarDescuento(5.0)
            }
            5->{
                tienda.mostrarProductos()
            }
            6->{
                tienda.productos[1].aumentarPrecio(5.0)
            }
            7->{
                tienda.run { productos.calcularValorTotalInventario(0) }
            }
            8->{
                tienda.eliminarProductoPorCodigo("")
            }
            9->{
                return

            }
        }



    }
}