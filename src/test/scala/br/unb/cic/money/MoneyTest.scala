package br.unb.cic.money

import org.scalatest.funsuite.AnyFunSuite

class MoneyTest extends AnyFunSuite {

  test("Test simple add") {
    val m1 = new Money(123, BLR)
    val m2 = new Money(245, BLR)
    val expected = new Money(368, BLR)

    assert(expected == m1.add(m2))
  }

  test("Test add on different currencies") {
    val m1 = new Money(123, BLR)
    val m2 = new Money(245, USD)
    val expected = new MoneyBag(List(m1, m2))

    assert(expected == m1.add(m2))
  }

    test("Test add MB((123, BLR), (245, USD)) with Money(5, EUR)") {
      val m1 = new Money(123, BLR)
      val m2 = new Money(245, USD)
      val m3 = new Money(5, EUR)
      val mb = new MoneyBag(List(m1, m2))
      val expected = new MoneyBag(List(m1, m2, m3))
      assert(expected == mb.add(m3))
  }

}
