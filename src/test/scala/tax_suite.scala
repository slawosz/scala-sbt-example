import org.scalatest.FunSuite

class TextSuite extends FunSuite {
  test("calculate tax without costs") {
    val tax = new Tax(income = 100, costs = 0, rate = 18)
    expect(118) { tax.calculate }
  }

  test("calculate tax with costs") {
    val tax = new Tax(income = 100, costs = 50, rate = 18)
    expect(59) { tax.calculate }
  }

}
