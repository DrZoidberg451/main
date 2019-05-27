public class Complex {
    
  double re;

  double im;
  

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double modulus() {
    return Math.sqrt(
        square(this.re) +
        square(this.im));
  }

  public Complex add(Complex other) {
    return new Complex(
        this.re + other.re,
        this.im + other.im);
  }
  
  public Complex subtract(Complex other){
      return new Complex(
          this.re - other.re,
          this.im - other.im);
  }
  public Complex multiplication(Complex other){
      return new Complex(
          (this.re*other.re)-(this.im*other.im),
          (this.re*other.im)+(this.im*other.re)
          );
  }
  
  public Complex division(Complex other){
      
      double den = square(other.modulus());
      
      return new Complex(((this.re*other.re+this.im*other.im)/den) , ((this.im*other.re-this.re*other.im)/den));
  }
  
  public static Complex conjugate(Complex other){
      return new Complex(other.re, other.im * -1);
  }

  public String asString() {
    StringBuilder repr = new StringBuilder();
    if (this.re == 0) {
      repr.append(this.im).append("j");
    } else {
      repr.append("(");
      repr.append(this.re);
      if (this.im < 0) {
        repr.append("-").append(Math.abs(this.im));
      } else {
        repr.append("+").append(this.im);
      }
      repr.append("j)");
    }
    return repr.toString();
  }

  private double square(double x) {
    return x * x;
  }
    
    public static void main(String args[]) {

    Complex c1 = new Complex(3, 4);
    Complex c2 = new Complex(1, 2);
    Complex r = c1.add(c2);
    Complex z = c1.subtract(c2);
    Complex w = c1.multiplication(c2);
    Complex k = c1.division(c2);
    Complex c = new Complex(5, 6);
    c = conjugate(c);
    
    System.out.println(r.modulus());
    System.out.println(r.asString());
    System.out.println(z.asString());
    System.out.println(w.asString());
    System.out.println(k.asString());
    System.out.println(c.asString());

    /*System.out.println(
        new Complex(5,6)
            .add(new Complex(7, 8))
            .add(new Complex(2, 1))
            .add(new Complex(4, 2)).asString());
            */

    //System.out.println(new Complex(1, 2).asString());
    //System.out.println(new Complex(-1, 2).asString());
    //System.out.println(new Complex(1, -2).asString());
    //System.out.println(new Complex(-1, -2).asString());
    //System.out.println(new Complex(0, 2).asString());
    //System.out.println(new Complex(-1, 0).asString());
    //System.out.println(new Complex(0, -2).asString());
    //System.out.println(new Complex(0, 0).asString());
    }
}
