fun main(args: Array<String>) {
//    classWork()
    homeWork()
}

fun classWork():Unit{
    println("Lesson 3 01.12");
    fun test(word:String, number:Int):Unit{
        println("Word = $word, number = $number");
    }

    test(word ="55", number = 5);

    val result = {number: Int ->
        println("Function returns $number");
    }

    result(5);

    fun printGreeting (language:String, action: (String) -> Unit, secondAction: (String) -> Unit ):Unit{
        when(language){
            "Russian" -> secondAction(language);
            "English" -> secondAction(language);
            "Spanish" -> action(language);
            "Korea" -> action(language);
            else -> println("Please change input language");
        }
    }
    printGreeting(
        language = "English",
        action = { language ->
            var answer = ""
            when (language) {
                "Russian" -> answer = "Здравствуйте";
                "English" -> answer = "Helloy";
                "Spanish" -> answer = "Hola";
                "Korea" -> answer = "안녕하세요";
                else -> answer = "Not!"
            }
            println(answer)
        },
        secondAction = { language ->
            var answer = ""
            when (language) {
                "Russian" -> answer = "Привет!";
                "English" -> answer = "Hi!";
                "Spanish" -> answer = "Hola!";
                "Korea" -> answer = "안녕하세요!";
                else -> answer = "Not!"
            }
            println(answer)
        },
    )

    fun calculate (
        firstNumber: Int,
        secondNumber: Int,
        operation: String,
        action: (Int, Int, String) -> Int
    ):Unit{
        var sign = "";
        when(operation){
            "Addition" -> sign = "+";
            "Subtraction" -> sign = "-";
            "Multiplication" -> sign = "*";
            "Division" -> sign = "/"
        }
        println("$firstNumber ${sign} $secondNumber = ${action(firstNumber, secondNumber, operation)}" );
    }
    calculate(
        firstNumber = 2,
        secondNumber = 2,
        operation = "Multiplication",
        action = { a: Int, b: Int, o: String ->
            when (o) {
                "Addition" -> a + b;
                "Subtraction" -> a - b;
                "Multiplication" -> a * b;
                "Division" -> a / b;

                else -> 0
            }
        }
    )

    val lambdaOne = { a:Int, b:Int -> a+b }
    println(lambdaOne(2,3))

    val operation = { a:Int, b:Int -> a*b};
    println(operation(198,56553))
}

fun homeWork():Unit{
    println("Home work 3");

    val addStrings = {a:String, b:String -> a+b}
    print("Enter first sting: ");
    val stringOne = readln();
    print("Enter second sting: ");
    val stringSecond = readln();
    println("Result  addStrings: ${addStrings(stringOne, stringSecond)}");

    var flag = true;

    val isEven = {a:Int -> a%2 == 0}

    while(flag){
        print("Enter number: ");
        val number = readln()
        try {
            val result =  isEven((number).toInt())
            if(result){
                println("number $number is even")
            }else{
                println("number $number is not even")
            }
            flag = false
        } catch (ex: NumberFormatException) {
            println("number is not number!");
        }

    }

}