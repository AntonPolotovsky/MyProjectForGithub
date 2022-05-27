package MyProjectForGithub

import kotlin.math.pow

fun main() {
}

fun populationIn10Years(a: Int) {
    var population = a
    val grouthOfPopulation = population / 1000 * 14
    val mortalityOfPopulation = population / 1000 * 8
    for (years in 1..10) {
        population = population + grouthOfPopulation - mortalityOfPopulation
    }
    println("Население составит: $population")
}

fun populationWithOptions(a: Int) {
    var population = a
    var grouthOfPopulation = 14
    var mortalityOfPopulation = 8
    var finalGrouth = 0
    var finalMortality = 0
    for (years in 1..10) {
        finalGrouth += grouthOfPopulation
        while (grouthOfPopulation > 7) {
            grouthOfPopulation--
            break
        }
    }
    for (years in 1..10) {
        finalMortality += mortalityOfPopulation
        while (mortalityOfPopulation > 6) {
            mortalityOfPopulation--
            break
        }
    }
    population = population + (population / 1000 * (finalGrouth - finalMortality))
    println("Население составит: $population")
}

fun dipositWithFor(a: Float, term: Int, rate: Float) {
    var deposit = a
    var a: Int
    for (a in 1..term) {
        deposit += deposit / 100 * rate
    }
    println("Сумма депозита: $deposit")
}

fun depositWithWhile(a: Float, term: Int, rate: Float) {
    var deposit = a
    var a = 1
    while (a in 1..term) {
        deposit += deposit / 100 * rate
        a++
    }
    println("Сумма депозита: $deposit")
}

fun multiplicationCycle() {
    var stopNumber = 0
    while (stopNumber != 1) {
        println("Enter first number: ")
        val firstNumber = readLine()!!.toInt()
        println("Enter second number: ")
        val secondNUmber = readLine()!!.toInt()
        println("Multiplication result is: ${firstNumber * secondNUmber}")
        println("If you want to stop enter 1, to continue enter any other number: ")
        stopNumber = readLine()!!.toInt()
    }
}
fun arithmeticProgression(a: Int, lastElement: Int, magnifer: Int) {
    var firstElement = a
    var progress = 1
    var a = 0
    while (progress in 1..lastElement) {
        print("$firstElement, ")
        firstElement += magnifer
        progress++
    }
    println()
}

//Задача 7

fun tetration(a: Double, b: Double) {
    println("Enter the value of the first element: ")
    val element = b
    var valueDegree = a
    var result = valueDegree * valueDegree
    var a = 0
    for (progress in 1..3) {
        valueDegree = valueDegree * valueDegree
    }
    println("Degree: $valueDegree")
    print("Result: ")
    println(element.pow(valueDegree))
}

fun fibonacciSeries(a: Int) {
    val lastElement = a
    var firstElement = 0
    var secondElement = 1
    var thirdElement: Int

    var subsequence = 1
    print("$firstElement ")
    for (subsequence in 1..lastElement) {
        print("$secondElement ")
        thirdElement = firstElement + secondElement
        firstElement = secondElement
        secondElement = thirdElement
    }
    println()
}

//Задача 9
fun triangl(znachenie: Int) {
    var stroki = 1
    while (stroki <= znachenie) {
        var treugolnik = 0
        while (treugolnik < znachenie - stroki) {
            print(" ")
            treugolnik++
        }
        var stolbci = 1
        while (stolbci <= stroki) {
            if (stroki in 1..9) {
                print("$stroki ")
            } else {
                print(stroki)
            }
            stolbci++
        }
        println()
        stroki++
    }
}

//Задача 10
fun factorial(znachenie: Int) {
    var peremennaya = 1
    var factorial = 1
    if (znachenie < 0) {
        println("неверно введено значение.")
    } else if (znachenie == 0) {
        println("Значение факториала: 1")
    } else {
        while (peremennaya in 1..znachenie) {
            factorial = factorial * peremennaya
            peremennaya++
        }
        println("Значение факториала: $factorial")
    }
}

//Задача 11
fun pascalTriangl(numberOfLanes: Int) {
    var value = 1
    for (lanes in 0..numberOfLanes - 1) {    // печать строк
        var treugolnik = 0                         //вписываем треугольник из пробелов
        while (treugolnik < numberOfLanes - lanes) {
            print("  ")
            treugolnik++
        }
        for (elements in 0..lanes) {        //заполнение значенией
            if (elements == 0 || lanes == 0)
                value = 1
            else
                value = value * (lanes - elements + 1) / elements
            System.out.printf("%4d", value)
        }
        println()
    }
}

