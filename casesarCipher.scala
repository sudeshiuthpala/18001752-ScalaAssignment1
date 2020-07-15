object casesarCipher extends App{
	val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val encryption=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
	val decryption=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)
	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
	val ct=cipher(encryption,"s",5,alphabet)
	println(ct)
	val ct2=cipher(encryption,"l",5,alphabet)
	val pt=cipher(decryption,ct2,5,alphabet)
	println(pt)
}