package MyProjectForGithub
import java.util.*
import java.util.Collections.max
import kotlin.math.max

import kotlin.math.min

fun toCharacterArray(str: String): Array<Char> {
    return str.toCharArray().toTypedArray()
}
fun main() {
}
    // Задача 1
fun lessFive () { //1
        val numbers = arrayOf(1, 1, 2, 3, 4, 5, 8, 13, 21, 34, 55, 89)
        for (t in numbers) {
            if (t <= 5) {
                println(t)
            }
        }
    }

    //Задача 2
fun commonElements () { //2
        val numbers = arrayOf(1, 1, 2, 3, 4, 5, 8, 13, 21, 34, 55, 89)
        val numbers2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
        for (t in numbers) {
            for (n in numbers2) {
                if (t == n) {
                    println(t)
                }
            }

        }
    }

    //Задача 3
fun sort () { //3
        val numbers = arrayOf(1, 10, 15, 2, 3, 4, 7, 5, 8, 13, 21, 152, 34, 55, 89)

        numbers.sort()
        println("Sorted array: ${numbers.contentToString()}")
        numbers.sortDescending()
        println("Sorted array: ${numbers.contentToString()}")
    }

    //Задача 4
fun merging () { //4
        val numbers = arrayOf(1, 1, 2, 3, 4, 5, 8, 13, 21, 34, 55, 89)
        val numbers2 = arrayOf(-1, -3, -9)
        var numbers3 = numbers + numbers2
        println(numbers3.asList())
        numbers3.sort()
        println("Sorted array: ${numbers3.contentToString()}")
    }

    //Задача 5
    fun maxMeaning () { //5
        val numbers = arrayOf(500, 5874, 560, 400, 5874, 20)
        numbers.sortDescending()


        println("Sorted array: ${numbers.take(3)}")
    }
    //Задача 6???????????????????????????????????

//    val a: Int = 651
//    val s = Integer.toHexString(a)
//    var d = a.toString()
//    println(s)
//    println(d)

    //Задача 7 треугольник паскаля ????????????

//
//    fun computeTriangle(n: Int): List<List<Int>> {
//        require(n >= 0) { "Rows can't be negative!" }
//        return when (n) {
//            0 -> listOf<List<Int>>()
//            else -> (2..n).fold(listOf(listOf(1))) { acc, _ ->
//                acc.plusElement(listOf(1) + acc.last().zipWithNext(Int::plus) + listOf(1))
//            }
//        }
//    }

    //Задача 8

  fun polydrom () { //6
      println("Введите слово")

      val str = readLine()!!.toString()

      val chars: Array<Char> = toCharacterArray(str)
      println(chars.contentToString())
      val reversdeChars = chars.reversedArray()
      println(reversdeChars.contentToString())

      println(chars.contentEquals(reversdeChars))

  }
    //Задача 9

fun timeArray () { //7
    var time = arrayOf(60, 60, 24, 7)
    println("Enter seconds")
    var a = readLine()!!.toInt()
    val sec = a % time[0] // вычислили секунды для выводы
    a -= sec
    a = a / time[0]          //общее количество минут
    val min = a % time[1]
    a = a - min
    a = a / time[1]          //общее количество часов
    val chas = a % time[2]
    a = a - chas
    a = a / time[2]          //общее количество дней
    val dni = a % time[3]
    println("Дни: $dni, Часы: $chas, Минуты: $min, Секунды: $sec.")
}

    //Задача 10

fun numArray () { //8
    println("Введите три цифры через запятую")

    val strArray = readLine()!!.toString().split(",").toTypedArray()
    println(strArray[0])
    println(strArray[1])
    println(strArray[2])
    println(strArray[0].toInt() * strArray[2].toInt())
}


    //Задача 11

fun firsLastElement () { //9
    println("Введите цифры через запятую")
    val strArray = readLine()!!.toString().split(",").toTypedArray()
    println(strArray[0])
//   val reversdeChars = strArray.reversedArray()
//   println(reversdeChars.contentToString()[1])

    println(strArray.last())
}

    //Задача 12?????????????????????????

    /*println("Введите имя файла")
    var strArray = readLine()!!.toString()
    var parts = strArray.split('.')

    println(parts[1])*/

//    if (parts.equals(2)) {
//            println(parts[1])
//        }
//    else {
//        println("Неверное имя файла")
//    }
//
//    if ()
//    var strArray = readLine()!!.toString().split(".").toTypedArray()

//    if (strArray != 2) {


    //Задача 13
    fun plusCount () { //10
        println("Введите значение a ")
        var a = readLine()!!.toString()
        var b = a.toInt()
        var c = (a + a).toInt()
        var d = (a + a + a).toInt()
        var sum = b + c + d
        println("ответ по формуле: a+aa+aaa равен: $sum")
    }

    //Задача 14
fun evenNumbers () { //11
        val array = arrayOf(254, 24, 97, 817, 432, 748, 32, 656, 321, 3463, 856, 237, 34, 324, 63)
        for (x in array) {
            if (x == 237) {
                break
            } else if (x % 2 == 0) {

                println(x)
            }
        }
    }

    //Задача 15
    fun nonElements () { //12
    val numbers = arrayOf(1, 1, 2, 3, 4, 5, 8, 13, 21, 34, 55, 89)
    val numbers2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    for (number in numbers) {
        var count = 0
        for (number2 in numbers2) {
            if (number == number2) {
                break
            } else {
                count++
                if (count == numbers2.size) {
                    println(number)
                }
            }
        }
    }
    }

    //Задача 16
    fun listOfElements () { //13
        val numbers = arrayOf(1, 2, 3, 4, 5)

        for (number in numbers) print("$number ")
    }

    //Задача 17
  fun numbersSum () { //14
        println("Введите число ")
        val word = readLine()!!.toString()
        var result: Long = 0
        for (number in word) {
            val digit = number - '0'
            result += digit
        }
        println(result)
    }


//    val str = readLine()!!.toString()
//    var sum = 0
//    for(c in str) {
//        val digit = c - '0'
//
//            sum += digit
//    }
//    println (sum)

    //Задача 18
    fun countSymbol () { //15
        val num = 1
        val numbers = arrayOf(1, 1, 2, 3, 4, 5, 1, 8, 13, 21, 34, 55, 89)
        var count = 0
        for (x in numbers) {
            if (x == num) {
                count += 1

            }

        }

        println(count)
    }

    //Задача 19
    fun changePosition () { //16
        println("Введите значение Х: ")
        var x = readLine()!!.toString()
        println("Введите значение Y: ")
        var y = readLine()!!.toString()
        var c = y
        y = x
        x = c
        println("После смены значений переменных, x = $x, y = $y")
    }

    //Задача 20
    fun quater () { //17
        var array = arrayOf(15, 20, 30, 21, 45, 84, 60, 90, 100)
        for (i in array) {
            if (i % 15 == 0)
                println(i)
        }
    }

    //Задача 21
    fun unicNumbers () { //18
        val array = arrayOf(15, 20, 15, 30, 21, 45, 15, 84, 60, 90, 100)
        for (number in array) {
            var count = 0
            for (otherNumber in array) {
                if (number != otherNumber) {
                    count++
                    if (count == array.lastIndex) {
                        println(number)
                    }
                }
            }
        }
    }

    //Задача 22
    fun longAndOften () { //19
        val text = "good morning good my name is Anton Anton Anton"

        var maxLetterWord = ""
        var wordWord = ""
        val words = text.split(" ")
        for (word in words) {
            var count = 1
            var count2 = 1
            var maxCount = 0
            var maxWord = ""
            var wWord = ""
            //println(word.count()) //количество букв в слове
            for (otherWord in words) {
                if (word.count() > otherWord.count()) {
                    count++
                    maxLetterWord = word
                }
                if (count == words.size) {
                    println("The longest word -> $maxLetterWord")
                }
            }
        }


        val countByElement = words.groupingBy { it }.eachCount()
        val maximumElement = countByElement.maxByOrNull { it.value }?.key
        println("The most common word -> $maximumElement")

    }





//            if (word.equals(otherWord)) {
//                count2++
//                }
//            else {
//                if (count2 > maxCount) {
//                   maxCount = count
//                   maxWord = word
//                }
//            wWord = word
//                count2 = 1
//            }
//
//        }
//
//        if (count > maxCount) {
//            maxCount = count
//            maxWord = word
//
//        }
//        println(maxWord)
//    }





//    var chastoe = 0
//    var kolvo = 0
//    for (i in text) {
//        if (text.count(i) > kolvo){
//            kolvo = text.count(i)
//            chastoe = i
//        }
//    }

//    for (word in words) {
//        var count2 = 0
//        for (otherWord in words) {
//            if (word == otherWord){
//                count2++
//                wordWord = word
//            }
//            if (count2 == words.size) {
//                println(wordWord)
//            }
//
//        }
//
//    }
//    println(wordWord)








//    }





