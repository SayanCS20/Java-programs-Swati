class interest{
double principle,rate,time;
void si(){
principle=25;
rate=10;
time=5;
}
void sib(){
double simp= principle*rate*time/100;
System.out.println("simple interest is: "+simp);
}}
class simple{
public static void main(String args[]){
interest a=new interest();
a.si();
a.sib();
}} 
