package UD4

import kotlin.Boolean
import kotlin.CharArray
import kotlin.Int
import kotlin.String
import kotlin.io.print
import kotlin.io.println
import kotlin.text.toCharArray

internal object {
    fun decimalABinario(numero: Int): String {
        if (numero == 0 || numero == 1) {
            return numero.toString()
        } else {
            return UD4..decimalABinario(numero / 2) + numero % 2
        }
    }

    object Recursividad {
        var limite: Int = 10
        var frase: String = "Hola soy una frase al reves"
        var frase_char: CharArray = frase.toCharArray()

        fun main() {
            System.gc() //Limpia lo que pueda antes de medir

            var inicioEjecucion = System.nanoTime()
            var memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

            // PROGRAMA A REALIZAR
            imprimir(1)

            var finEjecucion = System.nanoTime()
            var memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

            println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns")
            println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes")

            inicioEjecucion = System.nanoTime()
            memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

            // PROGRAMA A REALIZAR
            imprimir_bucle()

            finEjecucion = System.nanoTime()
            memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

            println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns")
            println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes")

            //   System.out.println(suma(10));
            println(digitos(537473))

            println(potencia(2, 4))

            del_reves(38472)

            println()

            del_reves_char(frase_char.size - 1)

            println()

            del_reves_char_sin_vector(frase.length - 1)
            println(esBinario(18601))
        }

        fun imprimir(num: Int) {
            if (num <= limite) {
                println(num)
                imprimir(num + 1)
            }
        }

        fun imprimir_bucle() {
            for (i in 1..10000) {
                println(i)
            }
        }

        fun suma(nums: Int): Int {
            if (nums == 0) {
                return 0
            } else {
                return nums + suma(nums - 1)
            }
        }

        fun digitos(numero: Int): Int {
            if (numero < 10) {
                return 1
            } else {
                return 1 + digitos(numero / 10)
            }
        }

        fun potencia(base: Int, exponente: Int): Int {
            if (exponente == 0) {
                return 1
            } else {
                return base * potencia(base, exponente - 1)
            }
        }

        fun del_reves(numero: Int) {
            if (numero < 10) {
                print(numero)
            } else {
                print(numero % 10)
                del_reves(numero / 10)
            }
        }

        fun del_reves_char(posicion: Int) {
            if (posicion >= 0) {
                print(frase_char[posicion])
                del_reves_char(posicion - 1)
            }
        }

        fun del_reves_char_sin_vector(posicion: Int) {
            if (posicion >= 0) {
                print(frase.get(posicion))
                del_reves_char(posicion - 1)
            }
        }

        fun esBinario(numero: Int): Boolean {
            if (numero > 9) {
                if (numero % 10 != 0 && numero % 10 != 1) {
                    return false
                } else {
                    return esBinario(numero / 10)
                }
            } else {
                if (numero == 0 || numero == 1) {
                    return true
                } else {
                    return false
                }
            }
        }
    }
}


