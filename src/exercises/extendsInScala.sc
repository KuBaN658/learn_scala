trait Animal {
  val sound: String
  def voice: Unit = println("voice: " + sound)
}

case class Cat() extends Animal {
  val sound: String = "Meow!"
}

class Dog extends Animal {
  val sound: String = "Woof!"
}

class Fish extends Animal {
  val sound: String = "Fishes are silent!"

  override def voice: Unit = println(sound)
}


val animals = Seq(new Cat, new Dog, new Fish)
animals.foreach(_.voice)

  class Foo {
    protected class Bar(bar1: Int) {
      private[this] val bar2: Boolean = true
    }

    val foo1 = new Bar(20) // 1
    final val foo2: Int = 30

  }

  class Qux extends Foo {
    override val foo1 = new Bar(200) // 3
  }

  val a = new Foo
  a.foo1 // 6
  a.foo2 // 8

  val b = new Qux
  b.foo1
