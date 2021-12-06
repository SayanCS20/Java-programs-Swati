class A{
double i,j;
A(double a,double b){
i=a;
j=b;
}
double area(){
System.out.println("null");
return 0;
}
}

class Rectangle extends A{
Rectangle(double a,double b){
super(a,b);
}

double area()
{

System.out.println("area of rectangle:"+ i*j);
return 0; 
}
}

class Triangle extends A{
Triangle(double a,double b){
super(a,b);
}
double area(){
System.out.println("area of triangle:"+0.5*i*j);
return 0;
}
}

class Dyndis{
public static void main(String[]args){
A a1=new A(10,20);
Rectangle b1=new Rectangle(10,20);
Triangle c1=new Triangle(10,250);

A r;

r=a1;
r.area();

r=b1;
r.area();

r=c1;
r.area();
}
}