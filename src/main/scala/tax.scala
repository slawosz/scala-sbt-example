class Tax(income: Float, costs: Float, rate: Int) {

  def calculate() = ((income - costs) * (100 + rate)) / 100

}
