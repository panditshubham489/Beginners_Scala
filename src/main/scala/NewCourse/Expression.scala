package NewCourse

object Expression extends App{

  //expressions

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4) // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)  // == != > >= < <=

  println(!(1 == x)) // ! && ||

  var aVariable = 2
  aVariable += 3 // also work with -= *= /=(these all are side effects)
  println(aVariable)

  // Instruction vs Expression
  //IF EXPRESSION

  val aCondition = true
  val aConditionedValue = if(aCondition) 9 else 2 // if expression not an instruction
  println(aConditionedValue)
  println(if(aCondition) 9 else 2)


  var i = 0
  val aWhile = while (i<10){
    println(i)
    i += 1
  }

  // never write loops in scala

  //everything in scala is an Expression ! it holds a value (type or unit)

  val aWeirdValue = (aVariable = 3) // Unit ===Void
  println(aWeirdValue)

  // side effects : println(), whiles , reasigning

  // code blocks alse hold a value i.e last line of code block hence its also an expression

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "never"
  }

  val someValue = {
    2<3
  }

  val someOtherValue = {
    if(someValue) 456 else 879
    22
  }

}
