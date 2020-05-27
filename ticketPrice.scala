import scala.io.StdIn.readInt;
object ticketPrice extends App{
  def attend(price:Int)=120+((15-price)/5)*20;
  def income(price:Int)=attend(price)*price;
  def waste(price:Int)=500+3*attend(price);
  def profit(price:Int)=income(price)-waste(price);
  var p=readInt();
  println(profit(p));
}
