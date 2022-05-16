package MyProjectForGithub
import kotlin.math.*
import HomeWork.variationOfDeposit

fun main() {
    do {
        println("Запустите программу, которую хотите изучить, выбрав ее по номеру: " +
                "\n" +
                "1. Изучение типов переменных." +
                "\n" +
                "2. Прочитать мою краткую биографию." +
                "\n" +
                "3. Изучить возможные операции с переменными." +
                "\n" +
                "4. Сравнить два целых числа." +
                "\n" +
                "5. Сравнить два числа по заданным параметрам." +
                "\n" +
                "6. Рассчитатать конечную сумму депозита,в зависимости от первоначальной суммы." +
                "\n" +
                "7. Научиться выбирать операции из списка." +
                "\n" +
                "8. Поработать с упрощенным калькулятором." +
                "\n" +
                "9. Поработать с арифметическим калькулятором." +
                "\n" +
                "10. Узнать сколько лет месяцев и т.д. в заданном количестве секунд." +
                "\n" +
                "11. Поработать с конвертером валют." +
                "\n" +
                "12. Посмотреть простой расчет роста или убыли насленения." +
                "\n" +
                "13. Посмотреть рассчет роста или убыли населения по заданным параметрам." +
                "\n" +
                "14. Посмотреть работу программы по рассчету депозита, используя цикл For." +
                "\n" +
                "15. Посмотреть работу программы по рассчету депозита, используя цикл While." +
                "\n" +
                "16. Поработать с циклом по умножению и возможностью прерватьоперацию." +
                "\n" +
                "17. Поработать с арифметической прогрессией." +
                "\n" +
                "18. Построить тетрацию, заданной величины." +
                "\n" +
                "19. Вывести ряд Фиббоначи, заданной длины." +
                "\n" +
                "20. Построить равнобедренный треугольник из чисел, заданных размеров." +
                "\n" +
                "21. Рассчитать значение факториала." +
                "\n" +
                "22. Построить треугольник Паскаля, заданного размера." +
                "\n")
        myProgramms (readLine()!!.toInt())
        println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
        val start = readLine()!!.toInt()

    }
    while ( start == 1)

    println("Спасибо за внимание.")
}

fun myProgramms (choice: Int) {

//    val choice = readLine()!!.toInt()

    if (choice == 1) {
        HomeWork.workWithVariables()
    }
    else if (choice == 2) {
        HomeWork.shortBiography()
    }
    else if (choice == 3) {
        println("Введите последовательно 4 переменные: ")
        HomeWork.operationsWithVariables(readLine()!!.toInt(), readLine()!!.toInt(),readLine()!!.toInt(),readLine()!!.toInt())
    }
    else if( choice == 4){
        println("Введите два числа последовательно: ")
        HomeWork.usualCompare(readLine()!!.toInt(), readLine()!!.toInt())
    }
    else if (choice == 5) {
        println("Введите сравниваемое значение: ")
        HomeWork.specifiedCompare(readLine()!!.toInt())
    }
    else if (choice == 6) {
        println("Введите сумму вклада: ")
        HomeWork.variationOfDeposit(readLine()!!.toInt())
    }
    else if (choice ==7) {
        println("Введите номер операции:\n"+
                "1. Сложение\n"+
                "2. Вычитание\n"+
                "3. Умножение")
        HomeWork.shortMathOperations(readLine()!!.toInt())
    }
    else if (choice == 8) {
        println("Введите два числа последовательно: ")
        HomeWork.smalMathProgramm(readLine()!!.toInt(), readLine()!!.toInt())
    }
    else if (choice == 9) {
        println("Введите два числа последовательно: ")
        HomeWork.easyCalculator(readLine()!!.toDouble(), readLine()!!.toDouble())
    }
    else if (choice == 10) {
        println("Введите некоторое количество секунд: ")
        HomeWork.timeCalculator(readLine()!!.toInt())
    }
    else if (choice == 11) {
        println("Введите колчество рублей для конвертации: ")
        HomeWork.currencyConverter(readLine()!!.toInt())
    }
    else if (choice == 12) {
        println("Введите количество населения для рассчета: ")
        HomeWork.populationIn10Years(readLine()!!.toInt())    }
    else if (choice == 13) {
        println("Введите количество населения для рассчета: ")
        HomeWork.populationWithOptions(readLine()!!.toInt())
    }
    else if (choice == 14) {
        println("Введите последовательно сумму депозита, срок в месяцах и ставку: ")
        HomeWork.dipositWithFor(readLine()!!.toFloat(), readLine()!!.toInt(), readLine()!!.toFloat())
    }
    else if (choice == 15) {
        println("Введите последовательно сумму депозита, срок в месяцах и ставку: ")
        HomeWork.depositWithWhile(readLine()!!.toFloat(), readLine()!!.toInt(), readLine()!!.toFloat())
    }
    else if (choice == 16) {
        println("Введите последовательно два значания: ")
        HomeWork.multiplicationCycle()
    }
    else if (choice == 17) {
        println("Введите последовательно стартовое число прогрессии, число, на которое будет увеличиваться прогрессия " +
                "\n" +
                "и номер последнего элемента")
        HomeWork.arithmeticProgression(readLine()!!.toInt(),readLine()!!.toInt(), readLine()!!.toInt() )
    }
    else if (choice == 18) {
        println("Введите последовательно число для тетрации и степень: ")
        HomeWork.tetration(readLine()!!.toDouble(), readLine()!!.toDouble())
    }
    else if (choice == 19) {
        println("Введите номер последнего элемента ряда Фиббоначи: ")
        HomeWork.fibonacciSeries(readLine()!!.toInt())
    }
    else if (choice == 20) {
        println("Введите значение, до которого будем строить треугольник: ")
        HomeWork.triangl(readLine()!!.toInt())
    }
    else if (choice == 21) {
        println("Введите любое неотрицательное значаение: ")
        HomeWork.factorial(readLine()!!.toInt())
    }

    else if (choice == 22) {
        println("Введите количество строк: ")
        HomeWork.pascalTriangl(readLine()!!.toInt())
    }
    else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }


}




