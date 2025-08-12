package aryan;

class Box2
        {  
	double width;  	
	double height;  
	double depth; 
	 
	Box2()  //default constructor
 	{
	   System.out.println("Constructing Box"); 
	    width = 10;
	   height = 10; 
	   depth = 10;
	}
	
	double volume() 
	{
 	   return width * height * depth;
	}
}

class BoxDemo6 
{ 
public static void main(String args[]) 
{
 // declare, allocate, and initialize Box objects 
 Box2 mybox1 =   new Box2();
 Box2 mybox2 = new Box2(); 
 double vol; 

// get volume of first box 
 vol = mybox1.volume();
 System.out.println("Volume is " + vol);

 // get volume of second box 
 vol = mybox2.volume(); 
 System.out.println("Volume is " + vol); 
}

 }
