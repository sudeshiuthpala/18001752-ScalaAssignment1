object evenAdd extends App{
    def isEven(n:Int):Boolean=n match{
      case 0 =>true
      case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean= !(isEven(n))
    def add(num:Int):Int={
      if(num==0) 0
     else if(isEven(num)==true) num+add(num-1)
      else add(num-1)
    }
    println(add(5));
}
