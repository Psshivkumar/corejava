class BakerBoy{

public static void main(String[] args)
{
String name="suma";
int dur=6;
float exp=5f;
Baker.cooking("cake",5,"bake",exp,dur,name);
if(name!=null)
{
	System.out.println("name is valid");
}

else
{
System.err.println("nameis in valid");



}
if(dur<2) 
{
	
	System.out.println("dur is valid");
	
}

else
{
System.err.println("dur is valid");
return;
}
if(exp<=2)
{
	
	System.out.println("exp is valid");
	
}
else {
	
	System.err.println("exp is invalid");
	return;
}
System.out.println("all are valid");
	


}







}