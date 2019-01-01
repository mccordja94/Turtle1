//Turtle can write V and X and ^.
//This  is the turtle class!


/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
   ////////////////// constructors ///////////////////////
   
   /** Constructor that takes the x and y and a picture to
    * draw on
    * @param x the starting x position
    * @param y the starting y position
    * @param picture the picture to draw on
    */
   public Turtle (int x, int y, Picture picture) 
   {
      // let the parent constructor handle it
      super(x,y,picture);
   }
   
   /** Constructor that takes the x and y and a model
    * display to draw it on
    * @param x the starting x position
    * @param y the starting y position
    * @param modelDisplayer the thing that displays the model
    */
   public Turtle (int x, int y, 
                  ModelDisplay modelDisplayer) 
   {
      // let the parent constructor handle it
      super(x,y,modelDisplayer);
   }
   
   /** Constructor that takes the model display
    * @param modelDisplay the thing that displays the model
    */
   public Turtle (ModelDisplay modelDisplay) 
   {
      // let the parent constructor handle it
      super(modelDisplay);
   }
   
   /**
    * Constructor that takes a picture to draw on
    * @param p the picture to draw on
    */
   public Turtle (Picture p)
   {
      // let the parent constructor handle it
      super(p);
   }  
   
   /////////////////// methods ///////////////////////
   

   
   public void writeV (int length) {
      this.turn(-45);         // last 9 lines start here
      this.forward(length);
      this.turn(180);
      this.forward(length);
      this.turn(-120);
      this.forward(length);
      this.turn(180);
      this.forward(length);
      this.turn(150);
   }
   
   public void writeIV (int length) {
      this.turn(135);
      this.forward(length);
      this.turn(180);
      this.forward(length);
      this.turn(225);
      this.forward(length);
   }
   public void writeX (int length) {
      /*
      this.turn(-30);
      this.forward(length);
      this.turn(180);
      this.forward(length * 2);
      this.turn(180);
      this.forward(length);
      this.turn(30);
      this.forward(length);
      this.turn(180);
      this.forward(length * 2); 
      */
      this.writeV(length);
      this.writeV(-length);
   }
   
   public void drawTriangle (int length) { 
   //this code draws a triangle
   
      this.setHeading(150);
      this.forward(length);
      this.setHeading(270);
      this.forward(length);
      this.setHeading(30);
      this.forward(length);
    
   }
      
   public void drawStar (int side) {
   //this code draws a star
      this.turn(162);
      this.forward(side);
      this.setHeading(306);
      this.forward(side);
      this.setHeading(90);
      this.forward(side);
      this.setHeading(234);
      this.forward(side);
      this.setHeading(18);
      this.forward(side);
   }
   
   


} // this } is the end of class Turtle, put all new methods before this