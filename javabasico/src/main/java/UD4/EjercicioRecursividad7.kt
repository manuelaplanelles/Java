package UD4

object EjercicioRecursividad7 {
    fun sumaHastaN(n: Int): Int {
        var suma = 0
        var cadena = ""

        for (i in 1..n) {
            suma += i
            cadena += i

            if (i < n) {
                cadena += "+"
            }
        }
        cadena += " = " + suma
        println(cadena)
        return suma
    }
}
