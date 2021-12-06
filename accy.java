class area{
double r,h;
void cp(){
r= 6.5;
h=1.25;
}
void ac(){
double e= 3.14*r*r;
System.out.println("area of circle: "+e);
}
double ab(){
double m= 3.14*r*r;
return m;}
void acy(){
double f= 2*3.14*r*h+r*r*3.14;
System.out.println("area of cylinder: "+f);
}
}
class circle{
public static void main(String args[]){
area b=new area();
b.cp();
b.ac();
b.acy();
System.out.println("are3a:  "+b.ab());


}}
