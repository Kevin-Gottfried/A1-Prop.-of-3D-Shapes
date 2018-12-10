import java.util.Scanner;
class Main {
    
    float l;        //length variable
    float w;        //width variable
    float h;        //height variable
    float v;        //volume variable
    float a;        //surface area variable
    float b;        //base variable, in triangles
    float s1;       //variable for side one, in square pyramids
    float s2;       //variable for side two, in square pyramids

  public double findVol(double v) {
    return len*width*ht;
  }
  public double findSurfArea(double a) {
    return 2*l*w+
  }
  public static char ChooseShape() {
    Scanner Reader = new Scanner(System.in);
    System.out.print("What is the shape you want? \n[a] Rectangular Prism? \n[b] Cube? \n[c] Square Pyramid? \n[d] Triangular Prism?");

    char Shape = Reader.next().charAt(0);
    System.out.println(Shape);
      if (Shape == 'a' || Shape == 'b' || Shape =='c' || Shape == 'd'){
        if (Shape == 'a') {   
          // Main.areaCalc() {}
        }
        else if (Shape == 'b') {
          // Cube.areaCalc() {}
        }
        else if (Shape == "c") {
          
        }
        else if (Shape == 'd') {

        }
        else {
          System.out.println("Please choose a shape representing letter!");
        }
        /*
        branching for different shapes will be programmed here */
        }
      else {
        System.out.println("Please choose one of the letters assigned to the shapes");
        }
    return Shape;
  }
  public static void main(String[] args) {
    Main RP = new Main();
    Main Cube = new Main();
    Main SQP = new Main();
    Main TPsm = new Main();
    char choice = ChooseShape();

  }
}
