fun notes(){
  //Numbers
    // mutable (Changeable)
    var width: Int = 12
    var length: Double = 2.5
    //immutable (Unchangeable)
    var score = 10
    var name = "Jennifer"

    var count = 1
    count = 2

    /*val size = 1
    size = 2
     this would produce an error bc it is not mutable */
    var myInt: Int = 10
    var mySecondInt = 20
    var myLong: Long = 40L
    var myLong2 = 40L
    var myShort: Short = 16
    var myByte: Byte = 5
    var myDouble: Double = 45.2554466
    var myFloat : Float = 3.14F
     var myChar: Char = 'k'

    var myBoolean: Boolean = true


    //Strings
    val numberOfDogs = 3
    val numberOfCats = 2

   println( "I have $numberOfDogs dogs" + "and $numberOfCats cats")

    var myString:String = "This is a string"
    var myString2 = "This string has a new line \n"
    var multiLine = """
        this is line 1
        this is line 2
        this is line 3....
    """.trimIndent()

    println("This is the way Kotlin concatenates $myInt")


}


