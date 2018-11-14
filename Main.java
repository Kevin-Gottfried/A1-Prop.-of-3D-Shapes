import java.util.Scanner;
class Main {
    
    float len;
    float width;
    float ht;
    float vol;
    float Surfa2;
    float base;
    float s1;
    float s2;

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
          System.out.println("Please choose one of the letters assigned to the shapes");
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
This is a change
