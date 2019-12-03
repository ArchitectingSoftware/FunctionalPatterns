def matchTest(x: Any): Any = x match {
  case y: Int => "scala.Int =" + y
  case 1 => "one"
  case "two" => 2
  case _ => "many"
}

println(matchTest("two"))
println(matchTest("test"))
println(matchTest(1))
println(matchTest(1020))





def recursivePrint(l : List[String]): List[String] =  l match{
  case Nil => List.empty
  case x :: xs => {
    println(x)
    recursivePrint(xs)
  }
}

recursivePrint(List("Hello", "World","How", "Are", "You"))

