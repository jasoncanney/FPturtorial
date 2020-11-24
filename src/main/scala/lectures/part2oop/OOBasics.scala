package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Jason") // calls first greet method
  person.greet() // calls overloaded method

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print   // prints incrementing once
  counter.inc.inc.inc.print  // prints incrementing three times and then the number 3
  counter.inc(10).print // prints incrementing ten times and then the number ten

}

class Person (name: String, val age: Int) { // constructor
  //body
  val x = 2
  // val named = name
  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0) // same constructor as orginal but removing the age value
  def this() = this("John Doe")
}
  /*
  novel and writer class requirements

  writer: first name, surname and yer
  - method fullname

  novel: name, year of release, author
  -authorage
  -iswrittenby(author)
  -copy (new year of release) = new instance of novel
   */

  class Writer(firstName: String, surname: String, val year: Int){
    def fullName: String = firstName + " " + surname
  }

  class Novel(name: String, year: Int, author: Writer){
    def authorAge = year - author.year
    def isWrittenBy(author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  /*
  Counter Class
  - receives an int value
  - method returns current count
  - method to increment and decrement by 1 => new Counter
  - overload inc/dec to receive an amount
   */

  class Counter(val count: Int = 0){
    def inc = {
      println("Incrementing")
      new Counter(count + 1)
    } // immutability

    def dec = {
      println("decrementing")
      new Counter(count -1 )
    }

    def inc(n: Int): Counter = {
      if (n <= 0 ) this
      else inc.inc(n-1)
    }

    def dec(n: Int): Counter = {
      if (n <= 0) this
      else dec.dec(n - 1)
    }

    def print = println(count)
  }

// class parameters are NOT FIELDS
