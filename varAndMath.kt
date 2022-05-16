package MyProjectForGithub

fun main() {
}
    fun workWithVariables() {
        val varByte: Byte = 28
        val varShort: Short = 354
        val varInt: Int = 64552
        val varLong: Long = 54684321
        val varUbite: UByte = 65u
        val varUshort: UShort = 54u
        val varUInt: UInt = 548u
        val varULong: ULong = 86545u
        val varFloat: Float = 258.87f
        val varDouble: Double = -257.9657564
        val varBoolean: Boolean = true
        val varChar: Char = 'a'
        val varString: String = "First lesson"
        val varAny: Any = "Проба" + " Пера"
        println(varByte)
        println(varShort)
        println(varInt)
        println(varLong)
        println(varUbite)
        println(varUshort)
        println(varUInt)
        println(varULong)
        println(varFloat)
        println(varDouble)
        println(varBoolean)
        println(varChar)
        println(varString)
        println(varAny)
        """
        
    """.trimIndent()
    }

    fun shortBiography() {
        println("Write your name: ")
        val name = readLine()
        println("Write your surname: ")
        val surname = readLine()
        println("How old are you? ")
        val age = readLine()
        println("Where you was born? ")
        val placeOfBirth = readLine()
        println("What school did you study: ")
        val school = readLine()
        println("What university did you study: ")
        val university = readLine()
        println("What year did you graduate: ")
        val ageOfGrad = readLine()
        println("What year did you start working: ")
        val startOfWork = readLine()
        println("What is your hobby: ")
        val hobby = readLine()
        println("Where do you work now: ")
        val job = readLine()
        println("What did you start studing: ")
        val study = readLine()



        println(
            "My name is $name $surname. I am $age years old. I was born $placeOfBirth. I studied at school № $school in Samara. I graduated from at $university in $ageOfGrad.\n" +
                    "\n" +
                    "From $startOfWork my career was started. Now I work $job and i'm studing $study\n" +
                    "\n" +
                    "Thank you for your attention."
        )
    }

    fun operationsWithVariables(x: Int, y: Int, z: Int, c: Int) {
        var xX = x
        println("Сумма x и y: ${x + y}")
        println("Разность x и y: ${x - y}")
        println("Отношение x к y: ${x / y}")
        println("Произведение x и y: ${x * y}")
        println("Остаток от деления x и y: ${x % y}")
        println("Инкремент х: ${xX++}")
        println("Дикремент x ${xX--}")
        val e: Boolean = x > y
        println("Сравнение х и у $e")
        val f: Boolean = x != y
        println("Сравнение на неравенство х и у $f")
        val g: Boolean = (x > y) or (c > z)
        println("Логическая дезъюнкция с использованием всех 4х переменных $g")
        val h: Boolean = (x == y) and (c > z)
        println("Логическая конъюнкция с использованием всех 4х переменных $h")
        val j: Boolean = !(x <= y).not() or (c <= z)
        println("Логическая инверсия с использованием всех 4х переменных $j")
        val l: Boolean = (x > y) or (c > z)
        println("Логическая дезъюнкция с использованием всех 4х переменных $l")
        val b = x in 1..90
        println("Работа с логическим оператором вложения х в массив чисел от 1 до 90: $b")


    }
