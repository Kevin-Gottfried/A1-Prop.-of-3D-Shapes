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
    return 2*l*w+2*l*h*+2*w*h
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
class Cube {
    Form Cube = new Form;
        public double findVol(double v) {
          return h**3;
        }
        public double findSurfAr(double a) {
          return 6*(l**2);
}
class Square_Based_Pyramid {
    Form Square_Based_Pyramid = new Form;
        public double findVol(double v) {
          return (l*w*h)/3;
        }
        public double findSurfAr(double a) {
          return l*w + 2*l*Math.sqrt((0.5*l)**2+h**2);
}
class Triangular_Prism {
    Form Triangular_Prism = new Form;
        public double findVol(double v) {
          return (l*w*h)/2;
        }
        public double findSurfAr(double a) {
          return l*w + w*h + h*l + h*Math.sqrt(l**2 + w**2);
}
}
}
}
