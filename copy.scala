object copy extends App{
  def copyBook(x:Int):Unit={
    if(x<50) println(24.95 * x *40/100+3) else println(24.95*x*40/100+0.75*(x-50)+3);
  }
  copyBook(60);
}
