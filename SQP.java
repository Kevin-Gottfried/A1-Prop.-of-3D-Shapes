class SQP extends Main{
  Form Square_Based_Pyramid = new Form 
  public double findVol(double v) {
    return (l*w*h)/3;
  }
  public double findSurfAr(double a) {
    return l*w + 2*l*Math.sqrt((0.5*l)**2+h**2);
  }
}
