//Printing cake 
//AMirador | CC17-3E

fun main() {
    val age= 21
    val layers= 5

 
 //printing cake
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
   
 
}

 fun printCakeCandles(age:Int){
     print(" ")
     repeat(age){
         print(",")
     }
     println()
     print(" ")
     repeat(age){
         print("|")
     }
     println()
 }
 
 fun printCakeTop(age:Int){
     repeat(age+2){
         print("=")
     }
     println()
 }
 
 fun printCakeBottom(age:Int, layers:Int){
     repeat(layers){
         repeat(age+2){
             print("@")
         }
        println()
     }
 }

