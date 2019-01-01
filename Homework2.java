/*jacob mccord
uses the turtle class to draw a small triangle, a large triangle, and 5 stars,
each star slightly bigger and perfectly encompassing the previous star
*/

public class Homework2 {

   public static void main(String[] args) {
   
   /*
   // declare variables
      World world;
      Turtle turtle1;
   
   // initialize variables
      world = new World();
      turtle1 = new Turtle(world);
   
   // manipulate turtle1
      System.out.println(turtle1);
      turtle1.forward(100);
      turtle1.turnRight();
      turtle1.forward(100);
      turtle1.turnRight();
      turtle1.forward(100);
      turtle1.turnRight();
      turtle1.forward(100);
      turtle1.turnRight();
      System.out.println(turtle1); 
   
      World world; 
      Turtle turtle1, turtle2;   // can declare multiple variables if same type
      world = new World();
      turtle1 = new Turtle(world);
      turtle1.turn(45);
      turtle1.forward(120);
      turtle2 = new Turtle(60,60,world);
      turtle2.turn(135);
      turtle2.forward(240);
      turtle1.moveTo(60,60);
      
      turtle1.turn(135);
      turtle1.forward(4000);
      System.out.println(turtle1);
      
      
      // declare variables
      World world;             // declare variables
      Turtle turtle1; 
      int length; 
   // initialize variables
      world = new World();      
      turtle1 = new Turtle(world);
      length = 40;
      turtle1.turn(-30);         // last 9 lines start here
      turtle1.forward(length);
      turtle1.turn(180);
      turtle1.forward(length);
      turtle1.turn(-120);
      turtle1.forward(length);
      turtle1.turn(180);
      turtle1.forward(length);
      turtle1.turn(150); */
      
      
      
      World world;
      Turtle turtle1;
      
      World world2;
      Turtle turtle2;
      
      world2 = new World();
      turtle2 = new Turtle(world2);
      
      world = new World();
      turtle1 = new Turtle(world);
      
     
      turtle1.drawTriangle(25);
      
      turtle1.penUp();
      turtle1.moveTo(100,10);
      turtle1.penDown();
      turtle1.drawTriangle(100);
      
      turtle2.drawStar(100);
      turtle2.setHeading(0);
      turtle2.penUp();
      turtle2.forward(40);
      turtle2.penDown();
      turtle2.drawStar(180);
      turtle2.penUp();
      turtle2.setHeading(0);
      turtle2.forward(40);
      turtle2.penDown();
      turtle2.drawStar(260);
      
      
      
      
   }


}