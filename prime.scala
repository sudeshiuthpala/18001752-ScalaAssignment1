object prime extends App{
  def gcd(a:Int,b:Int):Int=b match{
    case 0 =>a
    case b if b>a => gcd(b,a)
    case _ => gcd(b,a%b)
  }
  def prime(p:Int,n:Int=2): Boolean=n match{
    case n if(n==p) => true
    case n if gcd(p,n)>1 =>false
    case n => prime(p,n+1)
  }
  println(prime(5));
}
