package sorting

import org.scalatest.FunSuite

class BubbleSortTests extends FunSuite {
  test("It sorts a fully reversed list") {
    val result = Bubble.sort(List.range(0,10).reverse)
    assert( result == List.range(0,10))
  }

  test("It sorts a mixed list") {
    val result = Bubble.sort(List(5,6,4,9,8,7,1,2,3,0))
    assert( result == List.range(0,10))
  }

  test("It returns the same input if the given input is already sorted") {
    val result = Bubble.sort(List.range(0,10))
    assert( result == List.range(0,10))
  }
}

class SwapTests extends FunSuite {
  test("It swaps the elements on the given index and one higher and then returns the mutated array") {
    val numbers = Array.range(0,5)
    val mutatedNumbers = Bubble.swap(numbers, 0)
    assert(mutatedNumbers === Array(1,0,2,3,4))
  }
}