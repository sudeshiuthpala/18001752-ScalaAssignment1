object addNum extends App{
  def addition(x:Int):Int={
    if(x==1) 1 
    else addition(x-1)+x 
  }
  println(addition(5));
}
