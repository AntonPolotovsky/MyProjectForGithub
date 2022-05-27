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
inline fun lessFive() { //1
    try {
        lessFiveVarArg(readLine()!!.toString().split(",").map { it.toInt() })
        {
            it <= 5
        }
    } catch (e: java.lang.NumberFormatException) {
        println("Введите верно")
    }
}

inline fun lessFiveVarArg(numbers: List<Int>, condition: (Int) -> Boolean) {
    for (t in numbers) {
        if (condition(t)) {
            print("$t ")
        }
    }
    println()
}

//Задача 2
fun commonElements() { //2
    try {
        elements(
            readLine()!!.toString().split(",").map { it.toInt() },
            readLine()!!.toString().split(",").map { it.toInt() })
        { t, n ->
            t == n
        }
    } catch (e: NumberFormatException) {
        println("Введите верно")
    }
}

inline fun elements(numbers: List<Int>, numbers2: List<Int>, condition: (Int, Int) -> Boolean) { //2
     for (t in numbers) {
        for (n in numbers2) {
            if (condition(t, n)) {
                print("$t ")
            }
        }

    }
    println()
}

fun sort() { //3
    try {
        sortNum(readLine()!!.toString().split(",").map { it.toInt() })
    } catch (e: java.lang.NumberFormatException) {
        println("Введите верно")
    }
}
fun sortNum(numbers: List<Int>) {
    println(numbers)
    val t = numbers.sorted()
    println(t)
    val r = t.sortedDescending()
    println(r)
}
fun merging() { //4
    try {
        merge(
            readLine()!!.toString().split(",").map { it.toInt() },
            readLine()!!.toString().split(",").map { it.toInt() })
    } catch (e: java.lang.NumberFormatException) {
        println("Введите верно")
    }
}

fun merge(numbers: List<Int>, numbers2: List<Int>) {
    val numbers3 = numbers + numbers2
    println(numbers3)
    val sortedArray = numbers3.sorted()
    println(sortedArray)
}
fun maxMeaning() { //5
    meanings(readLine()!!.toString().split(",").map { it.toInt() })
}
fun meanings(numbers: List<Int>) {
    val sortedArray = numbers.sorted()
    val reversArray = sortedArray.sortedDescending()
    println("Sorted array: ${reversArray.take(3)}")
}
fun polydrom() { //6
    polydromAct(readLine()!!.toString())
}
fun polydromAct(str: String) {
    val chars: Array<Char> = toCharacterArray(str)
    val reversedChars = chars.reversedArray()
    if (chars.contentEquals(reversedChars)) {
        println("Слово является полиндромом.")
    } else {
        println("Слово не является полиндромом.")
    }
}
fun timeArray(a: Int) { //7
    val time = arrayOf(60, 60, 24, 7)
    var a = readLine()!!.toInt()
    val sec = a % time[0] // вычислили секунды для выводы
    a -= sec
    a /= time[0]          //общее количество минут
    val min = a % time[1]
    a -= min
    a /= time[1]          //общее количество часов
    val chas = a % time[2]
    a -= chas
    a /= time[2]          //общее количество дней
    val dni = a % time[3]
    println("Дни: $dni, Часы: $chas, Минуты: $min, Секунды: $sec.")
}

fun numArray(strArray: Array<String>) { //8
    println(strArray[0])
    println(strArray[1])
    println(strArray[2])
}

fun firsLastElement(strArray: Array<String>) { //9
    println("Первое число массива: " + strArray[0])
    println("Последнее число массива: " + strArray.last())
}

fun plusCount(a: Int) { //10
    val b = a
    val c = (a + a)
    val d = (a + a + a)
    val sum = b + c + d
    println("ответ по формуле: a+aa+aaa равен: $sum")
}

fun evenNumbers(array: List<Int>) { //11
    for (x in array) {
        if (x == 237) {
            break
        } else if (x % 2 == 0) {

            println(x)
        }
    }
}

inline fun nonElements(numbers: List<Int>, numbers2: List<Int>, condition: (Int, Int) -> Boolean) { //12
    for (number in numbers) {
         var count = 0
         for (number2 in numbers2) {
            if (condition(number,number2)) {
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

fun listOfElements(vararg numbers: List<Int>) { //13
    for (number in numbers)
        print("$number ")
}

fun numbersSum(word: String) { //14
    var result: Long = 0
    for (number in word) {
        val digit = number - '0'
        result += digit
    }
    println(result)
}

inline fun countSymbol(numbers: List<Int>, num: Int, condition : (Int, Int) -> Boolean) { //15
    var count = 0
    for (x in numbers) {
        if (condition(x,num)) {
            count += 1
        }
    }
    println("Количество повторений числа в массиве: $count.")
}

fun changePosition(x: Int, y: Int) { //16
    val c = y
    val y = x
    val x = c
    println("После смены значений переменных, x = $x, y = $y")
}

inline fun quarter(array: List<Int>, condition: (Int) -> Boolean)  //17
{
    for (i in array) {
        if (condition(i))
            println(i)
    }
}

inline fun unicNumbers(array: List<Int>, condition: (Int, Int) -> Boolean) {
    print("Уникальные числа из массива: ")
    for (number in array) {
        var count = 0
        for (otherNumber in array) {
            if (condition(number, otherNumber)) {
                count++
                if (count == array.lastIndex) {
                    print("$number ")
                }
            }
        }
    }
}

inline fun longAndOften(text: Array<String>, condition: (String, String) -> Boolean) { //19
    var maxLetterWord = ""
    val words = text
    for (word in text) {
        var count = 1
        for (otherWord in words) {
            if (condition(word, otherWord)) {
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

