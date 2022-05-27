package MyProjectForGithub

inline fun usualCompare(a: Int, b: Int, condition: (Int, Int) -> Boolean) {
    if (condition(a, b)) {
        println("Числа равны")
    } else if (a < b) {
        println("Первое число меньше второго")
    } else {
        println("Первое число больше второго")
    }
}

inline fun specifiedCompare(a: Int, condition: (Int) -> Boolean) {
    if (condition(a)) {
        println("Число больше 5 и меньше 10")
    } else {
        println("Неизвестное число")
    }
}

fun variationOfDeposit(a: Int) {
    when {
        (a <= 100) -> println("Сумма вклада с процентами: ${a * 1.05}")
        ((a > 101) and (a <= 200)) -> println("Сумма вклада с процентами: ${a * 1.07}")
        (a > 200) -> println("Сумма вклада с процентами: ${a * 1.1}")
    }
}

fun shortMathOperations(a: Int) {
    when {
        (a == 1) -> println("Вы выбрали сложение")
        (a == 2) -> println("Вы выбрали вычитание")
        (a == 3) -> println("Вы выбрали умножение")
        else -> println("Операция не определена")
    }
}

fun smalMathProgramm(b: Int, c: Int) {
    println(
        "Введите номер операции:\n" +
                "1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение"
    )
    val a = readLine()!!.toInt()
    when {
        (a == 1) -> println("Результат операции: ${b + c}")
        (a == 2) -> println("Результат операции: ${b - c}")
        (a == 3) -> println("Результат операции: ${b * c}")
        else -> println("Операция не определена")
    }
}

fun easyCalculator(b: Double, c: Double) {
    println(
        "Введите номер операции:\n" +
                "1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "5. Остаток отцелочисленного деления\n"
    )
    val a = readLine()!!.toInt()
    when {
        (a == 1) -> println("Результат сложения: ${b + c}")
        (a == 2) -> println("Результат вычитания: ${b - c}")
        (a == 3) -> println("Результат умножения: ${b * c}")
        (a == 4) -> println("Результат деления: ${b / c}")
        (a == 5) -> println("Остаток от целочисленного деления: ${b % c}")
        else -> println("Операция не определена")
    }
}

fun timeCalculator(seconds: Int) {
    var a = seconds
    val sec = a % 60 // вычислили секунды для выводы
    a -= sec
    a /= 60          //общее количество минут
    val min = a % 60
    a -= min
    a /= 60          //общее количество часов
    val chas = a % 24
    a -= chas
    a /= 24          //общее количество дней
    val dni = a % 7
    a -= dni
    a /= 7          //общее количество недель
    val ned = a % 4
    a -= ned
    a /= 4          //общее количество месяцев
    val mes = a % 12
    a -= mes
    a /= 12          //общее количество лет
    val god = a
    when (god) {
        1, 21, 31, 41, 51, 61, 71, 91 -> print("$god Год, ")
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54, 62, 63, 64, 72, 73, 74, 82, 83, 84, 92, 93, 94 -> print(
            "$god Года, "
        )
        else -> {
            print("$god Лет, ")
        }
    }
    when (mes) {
        1 -> print("$mes Месяц, ")
        2, 3, 4 -> print("$mes Месяца, ")
        else -> {
            print("$mes Месяцев, ")
        }
    }
    when (ned) {
        1 -> print("$ned Неделя, ")
        2, 3, 4 -> print("$ned Недели, ")
    }
    when (dni) {
        1 -> print("$dni День, ")
        2, 3, 4 -> print("$dni Дня, ")
        else -> {
            print("$dni Дней, ")
        }
    }
    when (chas) {
        1, 21 -> print("$chas Час, ")
        2, 3, 4, 22, 23 -> print("$chas Часа, ")
        else -> {
            print("$chas Часов, ")
        }
    }
    when (min) {
        1, 31, 41, 51 -> print("$min Минута, ")
        2, 3, 4, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> print("$min Минуты, ")
        else -> {
            print("$min Минут, ")
        }
    }
    when (sec) {
        1, 31, 41, 51 -> println("$sec Секуда.")
        2, 3, 4, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> println("$sec Секунды.")
        else -> {
            println("$sec Секунд.")
        }
    }
}

inline fun currencyConverter(rub: Int, condition: (Int) -> Boolean) {
    println(
        "Введите Валюту:\n" +
                "1. Доллары\n" +
                "2. Евро\n" +
                "3. Фунт"
    )
    val nazv = readLine()!!.toInt()
    if (condition(nazv)) {
        println("Вы не верно выбрали валюту")
    } else if (nazv == 1) {
        println("Введите курс")
        val kurs = readLine()!!.toInt()
        val denigi = rub / kurs
        val rez1 = denigi % 100
        val rez2 = denigi % 10
        if (rez1 in 11..20) {
            print("$denigi Долларов")
        } else if (rez2 == 1) {
            print("$denigi Доллар.")
        } else if (rez2 in 2..4) {
            print("$denigi Доллара.")
        } else {
            print("$denigi Долларов.")
        }

    } else if (nazv == 2) {
        println("Введите курс")
        val kurs = readLine()!!.toInt()
        val denigi = rub / kurs
        val rez1 = denigi % 100
        val rez2 = denigi % 10
        if (rez1 in 11..20) {
            print("$denigi Евро")
        } else if (rez2 == 1) {
            print("$denigi Евро.")
        } else if (rez2 in 2..4) {
            print("$denigi Евро.")
        } else {
            print("$denigi Евро.")
        }
    } else if (nazv == 3) {
        println("Введите курс")
        val kurs = readLine()!!.toInt()
        val denigi = rub / kurs
        val rez1 = denigi % 100
        val rez2 = denigi % 10

        if (rez1 in 11..20) {
            print("$denigi Фунтов")
        } else if (rez2 == 1) {
            print("$denigi Фунт.")
        } else if (rez2 in 2..4) {
            print("$denigi Фунта.")
        } else {
            print("$denigi Фунтов.")
        }
    }
    println()
}

