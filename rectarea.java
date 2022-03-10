class rectangle
{
  int length,width;
void getdata(int a,int b)
{
  length=a;
  width=b;
}
int recArea()
{
  int area=length*width;
return(area);
}
}
class rectarea
{
  public static void main(String args[])
{
 int area1,area2;
rectangle rec1=new rectangle();
rectangle rec2=new rectangle();
rec1.length=15;
rec1.width=11;
area1= rec1.length*rec1.width;
rec2.getdata(20,15);
area2=rec2.recArea();
System.out.println("Area1="+area1);
System.out.println("Area2="+area2);
}
}