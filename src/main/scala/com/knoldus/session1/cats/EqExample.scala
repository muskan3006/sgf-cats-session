package com.knoldus.session1.cats

import cats.Eq
import cats.instances.int._
//import cats.instances.option._
//import cats.syntax.eq._
//import com.knoldus.session1.model.Cat

object EqExample extends App{
  println(1 == "1.1")
  val eqInt = Eq[Int]

  println(eqInt.eqv(1234,1234))

//  println(1234 === 1234)
//  println(Option(1234) === Option.empty[Int])

  //custom instance
//  implicit val catEq:Eq[Cat]=Eq.instance[Cat]((cat1,cat2)=>cat1.name==cat2.name&&cat1.age==cat2.age&&cat1.color==cat2.color)
//  val cat1=Cat("Heathcliff",38,"orange and black")
//  val cat2=Cat("Heathcliff",38,"orange and black")
//  println(cat1===cat2)
}
