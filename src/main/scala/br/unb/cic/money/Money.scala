package br.unb.cic.money

sealed trait Currency

case object BLR extends Currency
case object USD extends Currency
case object EUR extends Currency

trait IMoney

case class Money(val fAmount: Integer, val fCurrency: Currency) extends IMoney {

  def add(m: Money): IMoney = 
    if(m.fCurrency == fCurrency)
      Money(m.fAmount + fAmount, fCurrency)
    else
      MoneyBag(List(this, m))
}

case class MoneyBag(bag: List[Money]) extends IMoney {
  val fBag : Map[Currency, Money] = bag.map(m => (m.fCurrency, m)).toMap
}
