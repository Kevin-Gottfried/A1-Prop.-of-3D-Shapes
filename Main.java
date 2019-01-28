/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s331449397
 */
import java.util.Scanner;
class Main {
    
    float l;  //length variable
    float w;  //width variable
    float h;  //height variable
    float v;  //volume variable
    float a;  //surface area 
    float b;  //base, in triangles
    float s1; //variable for side one, in square pyramids
    float s2; //variable for side two, in square pyramids

  public float findVol() {
    return l*w*h;
  }
  public float findSurfAr() {
    return 2*l*w+2*l*h*+2*w*h;
  }
  public static char ChooseShape() {
    Scanner reader = new Scanner(System.in);
    System.out.print("What is the shape you want? \n[a] Rectangular Prism? \n[b] Cube? \n[c] Square Pyramid? \n[d] Triangular Prism?");

    return reader.next().charAt(0);
    //System.out.println(Shape);
        /*
        NVM it is being developped below */
    //return Shape;
  }
  public void UserInput() {
      Scanner reader = new Scanner(System.in);
      System.out.println("What are the dimensions of your object?");

      System.out.println("Length:");

      this.l = reader.nextFloat();

      System.out.println("Width:");
      this.w = reader.nextFloat();
      
      System.out.println("Height:");
      this.h= reader.nextFloat();
  }
  public static void main(String[] args) {
    
    
    char choice=ChooseShape();
    if (choice == 'a') {   
         Main RP = new Main();
         RP.v = RP.findVol();
         RP.a = RP.findSurfAr();

        //create the object for rect. prism
        //assign values to variables 
        //call the methods to calculate SA and vol       
        }
        else if (choice == 'b') {
          // Cube.areaCalc() {}
          Cube c1 = new Cube();
          c1.a = c1.findSurfAr();
          c1.v = c1.findVol();
        }
        else if (choice == 'c') {
          TriPrm TPsm = new TriPrm();
          TPsm.v=TPsm.findVol();
          TPsm.a=TPsm.findSurfAr();
        }
        else if (choice == 'd') {
          SQP SQP1 = new SQP();
          SQP1.v=SQP1.findVol();
          SQP1.a=SQP1.findSurfAr();
        }
        else {
          System.out.println("Please choose a shape representing letter!");
        }
  }
  public void output() {
    System.out.println("The volume is: " +v);
    System.out.println("The surface area is: " +a);
}
}
