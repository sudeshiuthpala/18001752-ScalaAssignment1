object takeHomeSalary extends App{
  def normal(hours:Int)=hours*150;
  def ot(hours:Int)=hours*75;
  def amount(hours:Int,o:Int)=normal(hours)+ot(o);
  def tex(amount:Int)=amount*.1;
  def takeHome(h1:Int,h2:Int):Double=amount(h1,h2)-tex(amount(h1,h2));
  println(takeHome(40,20));
    
}
