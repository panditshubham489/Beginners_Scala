package NewCourse

object callbyvalue_name extends  App{
  def callByvalue(X : Long): Unit ={
    println("by value:" + X)
    println("by value:" + X)
  }
  def callByname(X : => Long):Unit = {
    println("by name:" + X)
    println("by name:" + X)
  }
  callByvalue(System.nanoTime())
  callByname(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printfirst(X: Int,y : => Int): Unit= println(X)

  //  printFirst(infinite(), 34) //=> stack overflow
      printfirst(34,infinite())
}
