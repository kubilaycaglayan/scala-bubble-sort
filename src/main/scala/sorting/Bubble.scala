package sorting

object Bubble {
  def swap(array: Array[Int], index: Int): Array[Int] = {
    val firstNumber = array(index)
    val secondNumber = array(index + 1)

    array(index) = secondNumber
    array(index + 1) = firstNumber

    array
  }

  def sort(list: List[Int]): List[Int] = {
    var result = list.toArray
    val length = list.length

    List.range(0, length - 1).foreach(round => {
      var swapped = false

      List.range(0, length - 1 - round).foreach(index => {
        if (result(index) > result(index + 1)) {
          swap(result, index)
          swapped = true
        }
      })

      if(!swapped) {
        return result.toList
      }
    })

    result.toList
  }
}

object BubbleSort extends App {
  val reversedNumbers = List.range(0,10).reverse
  print(s"\ninput: $reversedNumbers")
  val sortedNumbers = Bubble.sort(list = reversedNumbers)
  print(s"\noutput: $sortedNumbers \n\n")
}