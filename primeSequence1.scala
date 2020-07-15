object primeSequence1 extends App{
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
	def primeSeq(n:Int):Unit=n match{
		case 2=> println(n)
		case n if prime(n,2)==true => println(n); primeSeq(n-1)
	}
        primeSeq(10)
}