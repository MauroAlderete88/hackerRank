
/*

Link https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

* Español-
* Dados cinco enteros positivos, encuentre los valores mínimos y máximos que se pueden calcular sumando exactamente
* cuatro de los cinco enteros. A continuación, imprima los valores mínimos y máximos respectivos como una sola
* línea de dos enteros largos separados por espacio.
*
* English-
* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
* four of the five integers. Then print the respective minimum and maximum values as a single
* line of two space-separated long integers.
* */

fun main(args: Array<String>) {
    var total : Int =0
    var lista : Array<Int> = arrayOf(2,7,22,12)
    var arrayResultados : MutableList<Int> = arrayListOf()


    for (m in 0 until lista.size) {
    var posicion = lista.get(m)
            for (i in 0 until lista.size) {
                total += lista[i]
            }
            arrayResultados.add(total - posicion )
            total=0
    }

    arrayResultados.sort()
    println(" El valor mas bajo posible es : ${arrayResultados.first()}")
    println("El valor mas alto posible es : ${arrayResultados.get(arrayResultados.size-1)}")

}
