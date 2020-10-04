package com.knoldus.session1.cats

import cats.Show
import cats.instances.int._
import cats.instances.string._
import com.knoldus.session1.model.Cat
import cats.syntax.show._

object ShowExample extends App{
  val showInt: Show[Int] = Show.apply[Int]
  val showString: Show[String] = Show.apply[String]

  println(showInt.show(1234))
  println(showString.show("Harry"))

//  println(1234.show)
//  println("Harry".show)

 implicit val catShow:Show[Cat] = new Show[Cat] {
    override def show(cat: Cat): String = s"${cat.name} is ${cat.age} year old in ${cat.color} color"
  }
//  val catShow:Show[Cat]=Show.show(cat=>s"${cat.name} is ${cat.age} year old in ${cat.color} color")

  println(Cat("Kitty",5,"white").show)
}
