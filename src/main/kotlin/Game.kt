
fun main(args: Array<String>) {
  val options = arrayOf("Rock", "Paper", "Scissors")
  val gameChoice = getGameChoice(options)
  val userChoice = getUserChoice(options)

  printResult(userChoice, gameChoice)
}
fun getGameChoice(optionsParam: Array<String>) =
  optionsParam[(Math.random() * optionsParam.size).toInt()]
fun getUserChoice(optionsParam: Array<String>):String {
  var isValidChoice = false
  var userChoice = ""
  while (!isValidChoice) {
    println("Please enter one of the following: ")
    //  要求使用者輸入他們的選擇

    for (item in optionsParam) print("$item")
    println(".")
//  讀取使用者輸入
    val userInput = readLine()
//    驗證使用者的輸入
    if (userInput != null && userInput in optionsParam) {
      isValidChoice = true
      userChoice = userInput
    }
    if (!isValidChoice) println("You must enter a valid choice.")
  }
  return userChoice
}
fun printResult (userChoice: String, gameChoice: String) {
  val result: String
//  判斷結果
  if (userChoice == gameChoice) result = "Tie"
  else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
          (userChoice == "Paper" && gameChoice == "Rock") ||
          (userChoice == "Scissors" && gameChoice == "Paper")) result = "You Win!"
  else result = "You Lose!"
  println("You choose $userChoice. I choose $gameChoice $result" )
}




