//Birthday Greetings 
//AMirador | CC17-3E

fun main() {
    
    val name = "Al"
    val age= 21
    val days = age * 365
    val boarder = "%%%===%%%"
    val timesToRepeat = 3
 
 //banner
   printBoarder(boarder, timesToRepeat)
   println("    Happy Birthday, ${name}!")
   printBoarder(boarder, timesToRepeat) 
 
 //Birthday statements
   println()
   println("I am ${days} days old!")
   println("${days} days old is the best age to learn Kotlin!")   
 
}
fun printBoarder(boarder:String, timesToRepeat:Int){ 
    repeat(timesToRepeat){
        print(boarder)
    }
    println()
}
