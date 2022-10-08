fun main(args: Array<String>) {

    //1
    val age1 = 42.00
    val age2 = 21.00  //3 исправил тип переменной

    //2
    val avg1 = (age1+age2)/2

    //4
    val firstName :String = "Бислан"
    val lastName : String = "Хуаде"

    //5
    val fullName: String = "$firstName $lastName"

    //6
    val myDetails : String = "Привет, меня зовут $fullName!"

    //7
    val triple = Triple (8,10,2022)

    //8
    val month = triple.first
    val day = triple.second
    val year = triple.third

    val (month1, _, _) = triple

    //9
     val str = """
         | $month
         | 
         | $year
         """.trimMargin()

    //10
    val pair = Pair (5, year)

}