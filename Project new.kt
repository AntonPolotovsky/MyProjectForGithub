package MyProjectForGithub

import  MyProjectForGithub.*
import kotlin.system.exitProcess

fun main() {
    try {
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
            mainProgramm()
            println("Для возврата в  самое начало нажмите 1, для окончания работы любую клавшу.")
//try
            val start = readLine()!!.toInt()
//catch
        } while (start == 1)

        println("Спасибо за внимание.")
    }
        catch (e: NumberFormatException) {
            println("Спасибо за внимание!")
        }
}



fun mainProgramm () {

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
                                "3. Изучить возможные операции с переменными."+
                                "\n" +
                                "0. для выхода."
                    )
                    myProgramms1(readLine()!!.toInt())


                    println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")

                    val start = readLine()!!.toInt()
                } while (start == 1)
                println("Спасибо!")
            }
        else if (mainStart == 2) {
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
                            "8. Поработать с конвертером валют."+
                            "\n" +
                            "0. для выхода."
                )
                myProgramms2(readLine()!!.toInt())
                println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
                val start = readLine()!!.toInt()
            }
            while (start == 1)
            println("Спасибо!")
        }
        else if (mainStart == 3) {
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
                            "11. Построить треугольник Паскаля, заданного размера."+
                            "\n" +
                            "0. для выхода."
                )
                myProgramms3(readLine()!!.toInt())
                println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
                val start = readLine()!!.toInt()
            }
            while (start == 1)
            println("Спасибо!")
        }


        else if (mainStart == 4) {
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
                                "19. Выведем самое длинное и самое частоупотребляемое слово."+
                                "\n" +
                                "0. для выхода."
                    )
                    myProgramms4(readLine()!!.toInt())
                    println("Для возврата в начало нажмите 1, для окончания работы любую клавшу.")
                    val start = readLine()!!.toInt()
                } while (start == 1)
                println("Спасибо!")
            }

        else {
                println("Неправильно выбрана операция. Попробуйте еще раз.")
            }
    }

          fun myProgramms1 (choice1: Int){
               if (choice1 == 1) {
                   MyProjectForGithub.workWithVariables()
               } else if (choice1 == 2) {
                   MyProjectForGithub.shortBiography()
               } else if (choice1 == 3) {
                   try {
                       println("Введите последовательно 4 переменные: ")
                       MyProjectForGithub.operationsWithVariables(
                           readLine()!!.toInt(),
                           readLine()!!.toInt(),
                           readLine()!!.toInt(),
                           readLine()!!.toInt()
                       )
                   } catch (e: NumberFormatException) {
                       println("The input data must be number, not string! ")
                       println("Введите корректно 4 переменные! Иначе программа закончит свою работу! ")
                       MyProjectForGithub.operationsWithVariables(
                           readLine()!!.toInt(),
                           readLine()!!.toInt(),
                           readLine()!!.toInt(),
                           readLine()!!.toInt()
                       )
                   }
               }
               else if (choice1 == 0) {
               }
               else {
                   println("Неправильно выбрана операция. Попробуйте еще раз.")
               }
           }

        fun myProgramms2 (choice2: Int) {
           if (choice2 == 1) {
                try {
                    println("Введите два числа последовательно: ")
                    MyProjectForGithub.usualCompare(readLine()!!.toInt(), readLine()!!.toInt())
                } catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Аккуратно введите два числа последовательно! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.usualCompare(readLine()!!.toInt(), readLine()!!.toInt())
                }
            } else if (choice2 == 2) {
                try {

                    println("Введите сравниваемое значение: ")
                    MyProjectForGithub.specifiedCompare(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Аккуратно введите сравниваемое значение! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.specifiedCompare(readLine()!!.toInt())
            }
            } else if (choice2 == 3) {
                try {
                    println("Введите сумму вклада: ")
                    MyProjectForGithub.variationOfDeposit(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректную сумму вклада! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.variationOfDeposit(readLine()!!.toInt())
            }
            } else if (choice2 == 4) {
                try {
                    println(
                        "Введите номер операции:\n" +
                                "1. Сложение\n" +
                                "2. Вычитание\n" +
                                "3. Умножение"
                    )
                    MyProjectForGithub.shortMathOperations(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println(
                        "Введите правильный номер операции, во избежаннии прекращения работы программы:\n" +
                                "1. Сложение\n" +
                                "2. Вычитание\n" +
                                "3. Умножение"
                    )
                    MyProjectForGithub.shortMathOperations(readLine()!!.toInt())
                }
            } else if (choice2 == 5) {
                try {
                    println("Введите два числа последовательно: ")
                    MyProjectForGithub.smalMathProgramm(readLine()!!.toInt(), readLine()!!.toInt())
                } catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректно два числа последовательно! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.smalMathProgramm(readLine()!!.toInt(), readLine()!!.toInt())
                }
            }
                else if (choice2 == 6) {
                try {
                    println("Введите два числа последовательно: ")
                    MyProjectForGithub.easyCalculator(readLine()!!.toDouble(), readLine()!!.toDouble())
                } catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректно два числа последовательно! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.easyCalculator(readLine()!!.toDouble(), readLine()!!.toDouble())
                }
            }

            else if (choice2 == 7) {
                try {
                    println("Введите некоторое количество секунд: ")
                    MyProjectForGithub.timeCalculator(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Аккуратно введите некоторое количество секунд! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.timeCalculator(readLine()!!.toInt())
                }
            } else if (choice2 == 8) {
                try {
                    println("Введите колчество рублей для конвертации: ")
                    HomeWork.currencyConverter(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Аккуратно введите колчество рублей для конвертации! Иначе программа закончит свою работу!")
                    HomeWork.currencyConverter(readLine()!!.toInt())
                }
            }
            else if (choice2 == 0) {
            }
            else {
                println("Неправильно выбрана операция. Попробуйте еще раз.")
            }

        }


        fun myProgramms3 (choice3: Int) {
            if (choice3 == 1) {
                try {
                    println("Введите количество населения для рассчета: ")
                    MyProjectForGithub.populationIn10Years(readLine()!!.toInt())
                } catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректное количество населения для рассчета! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.populationIn10Years(readLine()!!.toInt())
                }
            }
            else if (choice3 == 2) {
                try {
                    println("Введите количество населения для рассчета: ")
                    MyProjectForGithub.populationWithOptions(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректное количество населения для рассчета! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.populationWithOptions(readLine()!!.toInt())
                }
            }
            else if (choice3 == 3) {
                try {
                    println("Введите последовательно сумму депозита, срок в месяцах и ставку: ")
                    MyProjectForGithub.dipositWithFor(
                        readLine()!!.toFloat(),
                        readLine()!!.toInt(),
                        readLine()!!.toFloat()
                    )
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректные значения: суммы депозита, срока в месяцах и ставку! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.dipositWithFor(
                        readLine()!!.toFloat(),
                        readLine()!!.toInt(),
                        readLine()!!.toFloat()
                    )
                }

            }
            else if (choice3 == 4) {
                try {
                    println("Введите последовательно сумму депозита, срок в месяцах и ставку: ")
                    MyProjectForGithub.depositWithWhile(
                        readLine()!!.toFloat(),
                        readLine()!!.toInt(),
                        readLine()!!.toFloat()
                    )
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректные значения: суммы депозита, срока в месяцах и ставку! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.depositWithWhile(
                        readLine()!!.toFloat(),
                        readLine()!!.toInt(),
                        readLine()!!.toFloat()
                    )
                }
            }
            else if (choice3 == 5) {
                try {
                    println("Введите последовательно два значания: ")
                    MyProjectForGithub.multiplicationCycle()
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Корректно вводите последовательно два значания, во избежании окончания работы программы! ")
                    MyProjectForGithub.multiplicationCycle()
                }
            }
            else if (choice3 == 6) {
                try {
                    println(
                        "Введите последовательно стартовое число прогрессии, число, на которое будет увеличиваться прогрессия " +
                                "\n" +
                                "и номер последнего элемента"
                    )
                    MyProjectForGithub.arithmeticProgression(
                        readLine()!!.toInt(),
                        readLine()!!.toInt(),
                        readLine()!!.toInt()
                    )
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println(
                        "Корректно вводите последовательно стартовое число прогрессии, число, на которое будет увеличиваться прогрессия " +
                                "\n" +
                                "и номер последнего элемента" +
                                "\n" +
                                "Иначе программа закончит свою работу!"
                    )
                    MyProjectForGithub.arithmeticProgression(
                        readLine()!!.toInt(),
                        readLine()!!.toInt(),
                        readLine()!!.toInt()
                    )
                }
            }
            else if (choice3 == 7) {
                try {
                    println("Введите последовательно число для тетрации и степень: ")
                    MyProjectForGithub.tetration(readLine()!!.toDouble(), readLine()!!.toDouble())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректно последовательно число для тетрации и степень! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.tetration(readLine()!!.toDouble(), readLine()!!.toDouble())
                }
            }
            else if (choice3 == 8) {
                try {
                    println("Введите номер последнего элемента ряда Фиббоначи: ")
                    MyProjectForGithub.fibonacciSeries(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректно номер последнего элемента ряда Фиббоначи! Иначе программа закончит свою работу! ")
                    MyProjectForGithub.fibonacciSeries(readLine()!!.toInt())
                }
            }
            else if (choice3 == 9) {
                try {
                    println("Введите значение, до которого будем строить треугольник: ")
                    MyProjectForGithub.triangl(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректное значение, до которого будем строить треугольник! Иначе программа закончит свою работу!")
                    MyProjectForGithub.triangl(readLine()!!.toInt())
                }
            }
            else if (choice3 == 10) {
                try {
                    println("Введите любое неотрицательное значаение: ")
                    MyProjectForGithub.factorial(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите любое неотрицательное значаение, иначе программа закончит свою работу! ")
                    MyProjectForGithub.factorial(readLine()!!.toInt())
                }
            }
            else if (choice3 == 11) {
                try {
                    println("Введите количество строк: ")
                    MyProjectForGithub.pascalTriangl(readLine()!!.toInt())
                }
                catch (e: NumberFormatException) {
                    println("The input data must be number, not string! ")
                    println("Введите корректно количество строк! Иначе программа закнчит работу! ")
                    MyProjectForGithub.pascalTriangl(readLine()!!.toInt())
                }
            }
            else if (choice3 == 0) {
            }
            else {
                println("Неправильно выбрана операция. Попробуйте еще раз.")
            }
        }

fun myProgramms4 (choice4: Int) {
    if (choice4 == 1) {
                MyProjectForGithub.lessFive()
    } else if (choice4 == 2) {
        MyProjectForGithub.commonElements()
    } else if (choice4 == 3) {
        MyProjectForGithub.sort()
    } else if (choice4 == 4) {
        MyProjectForGithub.merging()
    } else if (choice4 == 5) {
        MyProjectForGithub.maxMeaning()
    } else if (choice4 == 6) {
        MyProjectForGithub.polydrom()
    } else if (choice4 == 7) {
        try {
            MyProjectForGithub.timeArray()
        } catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            MyProjectForGithub.timeArray()
        }
    } else if (choice4 == 8) {
        try {
            MyProjectForGithub.numArray()
        } catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            MyProjectForGithub.numArray()
        }
    } else if (choice4 == 9) {
        try {
            MyProjectForGithub.firsLastElement()
        }
        catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            MyProjectForGithub.firsLastElement()
        }
    } else if (choice4 == 10) {
        try {
            MyProjectForGithub.plusCount()
        }
        catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            MyProjectForGithub.plusCount()
        }
    } else if (choice4 == 11) {
        MyProjectForGithub.evenNumbers()
    } else if (choice4 == 12) {
        MyProjectForGithub.nonElements()
    } else if (choice4 == 13) {
        MyProjectForGithub.listOfElements()
    } else if (choice4 == 14) {
        MyProjectForGithub.numbersSum()
    } else if (choice4 == 15) {
        MyProjectForGithub.countSymbol()
    } else if (choice4 == 16) {
        try {
            MyProjectForGithub.changePosition()
        }
        catch (e: NumberFormatException) {
            println("Будьте внимательны, иначе программа закончит свою работу!")
            MyProjectForGithub.changePosition()
        }
    } else if (choice4 == 16) {
           MyProjectForGithub.quater()
    } else if (choice4 == 18) {
        MyProjectForGithub.unicNumbers()
    } else if (choice4 == 19) {
        MyProjectForGithub.longAndOften()
    }
    else if (choice4 == 0) {
    }
    else {
        println("Неправильно выбрана операция. Попробуйте еще раз.")
    }
}

