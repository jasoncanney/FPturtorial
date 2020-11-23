package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Jason") // calls first greet method
  person.greet() // calls overloaded method

}

class Person (name: String, val age: Int)  {  // constructor
  //body
  val x = 2
  // val named = name
  println(1+3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name,0) // same constructor as orginal but removing the age value
  def this() = this("John Doe")

}

// class parameters are NOT FIELDS
