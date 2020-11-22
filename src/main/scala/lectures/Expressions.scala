package lectures

object Expressions extends App {

  val x: Int = 1 + 2  // expression
  println(x)

  println(2 + 3 + 4)
   // + - * / & |

  println (1 == x)
  println (1 != x)

  var aVariable = 2
  aVariable += 3
  println (aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)


  // for loops are discouraged in scala.  this is imperative code (java, etc) vs. functional language like scala
  var i = 0
  while (i < 10){

    println(i)
    i += 1

  }

  // Everything in scala is an expression

  val aWeirdValue = (aVariable = 3)  // Unit == void
  println(aWeirdValue)

  // side effects: println, while, reassigning

  // code blocks

  val aCodeBlock = {

    val y = 2
    val z = y +1

    if (z > 2) "hello" else "goodbye"

  }
  println (aCodeBlock)


}
