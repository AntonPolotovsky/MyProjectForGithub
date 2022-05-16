package MyProjectForGithub

import kotlin.math.pow

fun main() {

}
fun populationIn10Years (a: Int) {
    var population = a
    val grouthOfPopulation = population / 1000 * 14
    val mortalityOfPopulation = population / 1000 * 8
    for (years in 1..10) {
        population = population + grouthOfPopulation - mortalityOfPopulation
    }
    println("Население составит: $population")
}

//Задача 2
fun populationWithOptions (a: Int) {
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
    //println(finalGrouth)
    //println(finalMortality)
    population = population + (population / 1000 * (finalGrouth - finalMortality))
    println("Население составит: $population")
}



//Задача 3
fun dipositWithFor (a: Float, term: Int, rate: Float) {

    //println("Enter the amount of deposit: ")
    var deposit = a // readLine()!!.toFloat()
    //println("Enter the term of deposit in months: ")
//        val term = readLine()!!.toInt()
//        val rate = 7
    var a: Int
    for (a in 1..term) {
        deposit += deposit / 100 * rate


    }
    println("Сумма депозита: $deposit")
}

//Задача 4
fun depositWithWhile (a: Float, term: Int, rate: Float) {

    //println("Enter the amount of deposit: ")
    var deposit = a  //readLine()!!.toFloat()
    //   println("Enter the term of deposit in months: ")
    // val term = readLine()!!.toInt()
    //val rate = 8
    var a = 1
    while (a in 1..term) {

        deposit += deposit / 100 * rate
        //println(deposit)
        a++

    }
    println("Сумма депозита: $deposit")
}


//Задача 5
fun multiplicationCycle () {
//
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

//Задача 6
fun arithmeticProgression (a: Int, lastElement: Int, magnifer: Int) {
    //  println("Enter the value of the first element of progression: ")
    var firstElement = a // readLine()!!.toInt()
    //   println("Enter the number by which the increase occurs in progresion: ")
    //  val lastElement = readLine()!!.toInt()
    //  println("Enter the value of the number by which the progression will be incremented: ")
    ///  val magnifer = readLine()!!.toInt()
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
    val element = b //  readLine()!!.toDouble()
    //println("Enter value degree: ")
    var valueDegree = a  //readLine()!!.toInt()
    var result = valueDegree * valueDegree
    // var progress = 1
    var a = 0
    for (progress in 1..3) {
        valueDegree = valueDegree * valueDegree


    }
    println("Degree: $valueDegree")

    print("Result: ")
    println(element.pow(valueDegree))
}




//задача 8
fun fibonacciSeries (a: Int) {

    //  println("Enter last element of the subsequence: ")
    val lastElement = a // readLine()!!.toInt()
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
        // subsequence++


    }
    println()
}
//Задача 9
fun triangl(znachenie: Int) {
//        println("Введите значение: ")
//        val znachenie = readLine()!!.toInt()
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
fun factorial (znachenie: Int) {
//        println("Введите любое неотрицательное значаение: ")
    //      val znachenie = readLine()!!.toInt()
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
fun pascalTriangl (numberOfLanes: Int) {

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

