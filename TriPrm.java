class TriPrm extends Main{
  Form Triangular_Prism = new Form
  public double findVol(double v) {
    return (l*w*h)/2;
  }
  public double findSurfAr(double a) {
    return l*w + w*h + h*l + h*Math.sqrt(l**2 + w**2);
  }
}
