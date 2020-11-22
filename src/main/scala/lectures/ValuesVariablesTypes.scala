package lectures

object ValuesVariablesTypes extends App {

  // Value examples

  val x: Int = 42
  val y: String = "Yes this is a string"
  val a = 43
  val b = "Another String"
  println(x)
  println(y)
  println(a)
  println(b)
  // println(y)
  // VALS are IMMUTABLE.  Compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 234234234234234234L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variable examples

  var aVariable: Int = 4
  aVariable = 5 // side effects
  println(aVariable)
  // variables are mutable.  in functional programming variables are not used

}
