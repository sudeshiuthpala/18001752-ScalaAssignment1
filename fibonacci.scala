import scala.io.StdIn.readInt
object fibonacci extends App{
   def fib(n:Int):Int=n match{
       case n if n==0 => 0
       case n if n==1 => 1
       case n => fib(n-1)+fib(n-2)
   }
   def fibSeq(n:Int):Unit={
     if(n>0) fibSeq(n-1)
     println(fib(n))
   }
   var x=readInt();
   fibSeq(x);
}
