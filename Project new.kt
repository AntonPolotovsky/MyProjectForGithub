package MyProjectForGithub

import  MyProjectForGithub.*
import kotlin.system.exitProcess

fun main() {
    var start: Int
    do {
        println(
            "Запустите категорию, которую хотите изучить, выбрав ее по номеру: " +
                    "\n" +
                    "1. Переменные и математические операции." +
                    "\n" +
                    "2. Логические конструкции." +
                    "\n" +
                    "3. Циклы." +
                    "\n" +
                    "4. Массивы."
        )
        try {
            mainProgramm()
        } catch (e: Exception) {
            println("Необходимо сделать правильный выбор!")
        }
        println("Для возврата в  самое начало нажмите 1, для окончания работы любую клавшу.")
        start = readLine()!!.toInt()
    } while (start == 1)
    println("Спасибо за внимание.")
}


fun mainProgramm() {
    val mainStart = readLine()!!.toInt()
    if (mainStart == 1) {
        do {
            println(
                "Выберети приграмму для изучения." +
                        "\n" +
                        "1. Изучение типов переменных." +
                        "\n" +
                        "2. Прочитать мою краткую биографию." +
                        "\n" +
                        "3. Изучить возможные операции с переменными." +
                        "\n" +
                        "0. для выхода."
            )
            try {
                myProgramms1(readLine()!!.toInt())
            } catch (e: Exception) {
                println("Необходимо сделать правильный выбор!")
            }
            println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
            val start = readLine()!!.toInt()
        } while (start == 1)
        println("Спасибо!")
    } else if (mainStart == 2) {
        do {
            println(
                "Выберети приграмму для изучения." +
                        "\n" +
                        "1. Сравнить два целых числа." +
                        "\n" +
                        "2. Сравнить число по заданным параметрам." +
                        "\n" +
                        "3. Рассчитатать конечную сумму депозита,в зависимости от первоначальной суммы." +
                        "\n" +
                        "4. Научиться выбирать операции из списка." +
                        "\n" +
                        "5. Поработать с упрощенным калькулятором." +
                        "\n" +
                        "6. Поработать с арифметическим калькулятором." +
                        "\n" +
                        "7. Узнать сколько лет месяцев и т.д. в заданном количестве секунд." +
                        "\n" +
                        "8. Поработать с конвертером валют." +
                        "\n" +
                        "0. для выхода."
            )
            try {
                myProgramms2(readLine()!!.toInt())
            } catch (e: Exception) {
                println("Необходимо сделать правильный выбор!")
            }
            println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
            val start = readLine()!!.toInt()
        } while (start == 1)
        println("Спасибо!")
    } else if (mainStart == 3) {
        do {
            println(
                "Выберети приграмму для изучения." +
                        "\n" +
                        "1. Посмотреть простой расчет роста или убыли насленения." +
                        "\n" +
                        "2. Посмотреть рассчет роста или убыли населения по заданным параметрам." +
                        "\n" +
                        "3. Посмотреть работу программы по рассчету депозита, используя цикл For." +
                        "\n" +
                        "4. Посмотреть работу программы по рассчету депозита, используя цикл While." +
                        "\n" +
                        "5. Поработать с циклом по умножению и возможностью прерватьоперацию." +
                        "\n" +
                        "6. Поработать с арифметической прогрессией." +
                        "\n" +
                        "7. Построить тетрацию, заданной величины." +
                        "\n" +
                        "8. Вывести ряд Фиббоначи, заданной длины." +
                        "\n" +
                        "9. Построить равнобедренный треугольник из чисел, заданных размеров." +
                        "\n" +
                        "10. Рассчитать значение факториала." +
                        "\n" +
                        "11. Построить треугольник Паскаля, заданного размера." +
                        "\n" +
                        "0. для выхода."
            )
            try {
                myProgramms3(readLine()!!.toInt())
            } catch (e: Exception) {
                println("Необходимо сделать правильный выбор!")
            }
            println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
            val start = readLine()!!.toInt()
        } while (start == 1)
        println("Спасибо!")
    } else if (mainStart == 4) {
        do {
            println(
                "Выберети приграмму для изучения." +
                        "\n" +
                        "1. Вывести все цифры меньше 5." +
                        "\n" +
                        "2. Создание списка общих элементов массивов." +
                        "\n" +
                        "3. Сортировка по возрастанию и убыванию." +
                        "\n" +
                        "4. Слияние нескольких массивов в один." +
                        "\n" +
                        "5. Найти три максимальных элемета массива." +
                        "\n" +
                        "6. Определим, является ли слово полидромом." +
                        "\n" +
                        "7. Посчитаем секунды." +
                        "\n" +
                        "8. Составим массив из введеных чисел." +
                        "\n" +
                        "9. Первый и последний элемент массива." +
                        "\n" +
                        "10. Посчитаем по формуле n+nn+nnn." +
                        "\n" +
                        "11. выведем все четные числа, пока не дойдем до 237." +
                        "\n" +
                        "12. Выведем элементы отличные элементы массивов." +
                        "\n" +
                        "13. Выведем список всех элементов массива." +
                        "\n" +
                        "14. Сложим все цифры числа" +
                        "\n" +
                        "15. Посчитаем, сколько раз симбол встречается в строке." +
                        "\n" +
                        "16. Поменяем значения переенных местами." +
                        "\n" +
                        "17. Найдем все числа, которые делятся на 15." +
                        "\n" +
                        "18. Узнаем, все числа в массиве уникальны." +
                        "\n" +
                        "19. Выведем самое длинное и самое частоупотребляемое слово." +
                        "\n" +
                        "0. для выхода."
            )
            try {
                myProgramms4(readLine()!!.toInt())
            } catch (e: Exception) {
                println("Необходимо сделать правильный выбор!")
            }
            println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
            val start = readLine()!!.toInt()
        } while (start == 1)
        println("Спасибо!")
    } else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }
}

fun myProgramms1(choice1: Int) {
    if (choice1 == 1) {
        workWithVariables()
    } else if (choice1 == 2) {
        shortBiography()
    } else if (choice1 == 3) {
        try {
            println("Введите последовательно 4 переменные: ")
            operationsWithVariables(
                readLine()!!.toInt(),
                readLine()!!.toInt(),
                readLine()!!.toInt(),
                readLine()!!.toInt()
            )
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректно 4 переменные! Иначе программа закончит свою работу! ")
            operationsWithVariables(
                readLine()!!.toInt(),
                readLine()!!.toInt(),
                readLine()!!.toInt(),
                readLine()!!.toInt()
            )
        }
    } else if (choice1 == 0) {
        println("Спасибо за внимание!")
    } else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }
}

fun myProgramms2(choice2: Int) {
    if (choice2 == 1) {
        try {
            println("Введите два числа последовательно: ")
            usualCompare(readLine()!!.toInt(), readLine()!!.toInt()) { a, b ->
                a == b
            }
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Аккуратно введите два числа последовательно! Иначе программа закончит свою работу! ")
            usualCompare(readLine()!!.toInt(), readLine()!!.toInt()) { a, b ->
                a == b
            }
        }
    } else if (choice2 == 2) {
        try {
            println("Введите сравниваемое значение: ")
            specifiedCompare(readLine()!!.toInt()) { a ->
                a in 3..8
            }
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Аккуратно введите сравниваемое значение! Иначе программа закончит свою работу! ")
            specifiedCompare(readLine()!!.toInt()) { a ->
                a in 3..8
            }
        }
    } else if (choice2 == 3) {
        try {
            println("Введите сумму вклада: ")
            variationOfDeposit(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректную сумму вклада! Иначе программа закончит свою работу! ")
            variationOfDeposit(readLine()!!.toInt())
        }
    } else if (choice2 == 4) {
        try {
            println(
                "Введите номер операции:\n" +
                        "1. Сложение\n" +
                        "2. Вычитание\n" +
                        "3. Умножение"
            )
            shortMathOperations(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println(
                "Введите правильный номер операции, во избежаннии прекращения работы программы:\n" +
                        "1. Сложение\n" +
                        "2. Вычитание\n" +
                        "3. Умножение"
            )
            shortMathOperations(readLine()!!.toInt())
        }
    } else if (choice2 == 5) {
        try {
            println("Введите два числа последовательно: ")
            smalMathProgramm(readLine()!!.toInt(), readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректно два числа последовательно! Иначе программа закончит свою работу! ")
            smalMathProgramm(readLine()!!.toInt(), readLine()!!.toInt())
        }
    } else if (choice2 == 6) {
        try {
            println("Введите два числа последовательно: ")
            easyCalculator(readLine()!!.toDouble(), readLine()!!.toDouble())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректно два числа последовательно! Иначе программа закончит свою работу! ")
            easyCalculator(readLine()!!.toDouble(), readLine()!!.toDouble())
        }
    } else if (choice2 == 7) {
        try {
            println("Введите некоторое количество секунд: ")
            timeCalculator(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Аккуратно введите некоторое количество секунд! Иначе программа закончит свою работу! ")
            timeCalculator(readLine()!!.toInt())
        }
    } else if (choice2 == 8) {
        try {
            println("Введите колчество рублей для конвертации: ")
            currencyConverter(readLine()!!.toInt()) { nazv ->
                nazv >= 4 || nazv < 1
            }
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Аккуратно введите колчество рублей для конвертации! Иначе программа закончит свою работу!")
            currencyConverter(readLine()!!.toInt()) { nazv ->
                nazv >= 4 || nazv < 1
            }
        }
    } else if (choice2 == 0) {
        println("Спасибо за внимание!")
    } else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }
}

fun myProgramms3(choice3: Int) {
    if (choice3 == 1) {
        try {
            println("Введите количество населения для рассчета: ")
            populationIn10Years(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректное количество населения для рассчета! Иначе программа закончит свою работу! ")
            populationIn10Years(readLine()!!.toInt())
        }
    } else if (choice3 == 2) {
        try {
            println("Введите количество населения для рассчета: ")
            populationWithOptions(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректное количество населения для рассчета! Иначе программа закончит свою работу! ")
            populationWithOptions(readLine()!!.toInt())
        }
    } else if (choice3 == 3) {
        try {
            println("Введите последовательно сумму депозита, срок в месяцах и ставку: ")
            dipositWithFor(
                readLine()!!.toFloat(),
                readLine()!!.toInt(),
                readLine()!!.toFloat()
            )
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректные значения: суммы депозита, срока в месяцах и ставку! Иначе программа закончит свою работу! ")
            dipositWithFor(
                readLine()!!.toFloat(),
                readLine()!!.toInt(),
                readLine()!!.toFloat()
            )
        }

    } else if (choice3 == 4) {
        try {
            println("Введите последовательно сумму депозита, срок в месяцах и ставку: ")
            depositWithWhile(
                readLine()!!.toFloat(),
                readLine()!!.toInt(),
                readLine()!!.toFloat()
            )
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректные значения: суммы депозита, срока в месяцах и ставку! Иначе программа закончит свою работу! ")
            depositWithWhile(
                readLine()!!.toFloat(),
                readLine()!!.toInt(),
                readLine()!!.toFloat()
            )
        }
    } else if (choice3 == 5) {
        try {
            println("Введите последовательно два значания: ")
            multiplicationCycle()
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Корректно вводите последовательно два значания, во избежании окончания работы программы! ")
            multiplicationCycle()
        }
    } else if (choice3 == 6) {
        try {
            println(
                "Введите последовательно стартовое число прогрессии, число, на которое будет увеличиваться прогрессия " +
                        "\n" +
                        "и номер последнего элемента"
            )
            arithmeticProgression(
                readLine()!!.toInt(),
                readLine()!!.toInt(),
                readLine()!!.toInt()
            )
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println(
                "Корректно вводите последовательно стартовое число прогрессии, число, на которое будет увеличиваться прогрессия " +
                        "\n" +
                        "и номер последнего элемента" +
                        "\n" +
                        "Иначе программа закончит свою работу!"
            )
            arithmeticProgression(
                readLine()!!.toInt(),
                readLine()!!.toInt(),
                readLine()!!.toInt()
            )
        }
    } else if (choice3 == 7) {
        try {
            println("Введите последовательно число для тетрации и степень: ")
            tetration(readLine()!!.toDouble(), readLine()!!.toDouble())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректно последовательно число для тетрации и степень! Иначе программа закончит свою работу! ")
            tetration(readLine()!!.toDouble(), readLine()!!.toDouble())
        }
    } else if (choice3 == 8) {
        try {
            println("Введите номер последнего элемента ряда Фиббоначи: ")
            fibonacciSeries(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректно номер последнего элемента ряда Фиббоначи! Иначе программа закончит свою работу! ")
            fibonacciSeries(readLine()!!.toInt())
        }
    } else if (choice3 == 9) {
        try {
            println("Введите значение, до которого будем строить треугольник: ")
            triangl(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректное значение, до которого будем строить треугольник! Иначе программа закончит свою работу!")
            triangl(readLine()!!.toInt())
        }
    } else if (choice3 == 10) {
        try {
            println("Введите любое неотрицательное значаение: ")
            factorial(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите любое неотрицательное значаение, иначе программа закончит свою работу! ")
            factorial(readLine()!!.toInt())
        }
    } else if (choice3 == 11) {
        try {
            println("Введите количество строк: ")
            pascalTriangl(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("The input data must be number, not string! ")
            println("Введите корректно количество строк! Иначе программа закнчит работу! ")
            pascalTriangl(readLine()!!.toInt())
        }
    } else if (choice3 == 0) {
        println("Спасибо за внимание!")
    } else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }
}

fun myProgramms4(choice4: Int) {
    if (choice4 == 1) {
        println("Введите массив цифр через запятую.")
        lessFive()
    } else if (choice4 == 2) {
        println("Введите первый массив чисел через запятую, а затем второй, так же через запятую.")
        commonElements()
    } else if (choice4 == 3) {
        println("Введите Массив.")
        sort()
    } else if (choice4 == 4) {
        println("Введите первый массив чисел через запятую, а затем второй, так же через запятую.")
        merging()
    } else if (choice4 == 5) {
        println("Введите Массив.")
        maxMeaning()
    } else if (choice4 == 6) {
        println("Введите слово")
        polydrom()
    } else if (choice4 == 7) {
        try {
            println("Введите некоторое количество секунд: ")
            timeArray(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            timeArray(readLine()!!.toInt())
        }
    } else if (choice4 == 8) {
        try {
            println("Введите три цифры через запятую")
            numArray(readLine()!!.toString().split(",").toTypedArray())
        } catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            numArray(readLine()!!.toString().split(",").toTypedArray())
        }
    } else if (choice4 == 9) {
        try {
            println("Введите цифры через запятую")
            firsLastElement(readLine()!!.toString().split(",").toTypedArray())
        } catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            firsLastElement(readLine()!!.toString().split(",").toTypedArray())
        }
    } else if (choice4 == 10) {
        try {
            println("Введите значение а")
            plusCount(readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            plusCount(readLine()!!.toInt())
        }
    } else if (choice4 == 11) {
        println("Введите массив значений")
        try {
            evenNumbers(readLine()!!.toString().split(",").map { it.toInt() })
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 12) {
        println("Введите первый массив чисел через запятую, а затем второй, так же через запятую.")
        try {
            nonElements(
                readLine()!!.toString().split(",").map { it.toInt() },
                readLine()!!.toString().split(",").map { it.toInt() })
            { number, number2 ->
                number == number2
            }
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 13) {
        println("Введите массив чисел через запятую.")
        try {
            listOfElements(readLine()!!.toString().split(",").map { it.toInt() })
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 14) {
        println("Введите число.")
        try {
            numbersSum(readLine()!!.toString())
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 15) {
        println("Сначала введите массив чисел, после введите число, которое будем проверять на повторение.")
        try {
            countSymbol(readLine()!!.toString().split(",").map { it.toInt() }, readLine()!!.toInt())
            { x, num ->
                x == num
            }
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 16) {
        println("Сначала введите значение x, после значение y.")
        try {
            changePosition(readLine()!!.toInt(), readLine()!!.toInt())
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 17) {
        println("Введите через запятую  значение массива для сравнения.")
        try {
            quarter(readLine()!!.toString().split(",").map { it.toInt() }) { i ->
                i % 15 == 0
            }
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 18) {
        println("Введите через запятую значение массива для сравнения.")
        try {
            unicNumbers(readLine()!!.toString().split(",").map { it.toInt() }) { number, otherNumber ->
                number != otherNumber
            }
        } catch (e: NumberFormatException) {
            println("Введите верно")
        }
    } else if (choice4 == 19) {
        try {
            longAndOften(readLine()!!.toString().split(", ").toTypedArray()) { word, otherWord ->
                word.count() > otherWord.count()
            }
        } catch (e: Exception) {
            println("Введите верно")
        }
    } else if (choice4 == 0) {
        println("Спасибо за внимание!")
    } else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }
}

