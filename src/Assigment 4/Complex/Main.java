package Complex;

class Main {
  public static void main(String[] args) {
    Complex z1 = Complex.planar(2, 1);
    Complex z2 = Complex.planar(2, 2);
    //System.out.println(z1.asString());
    //System.out.println(z1.asPolar().asString());

    Complex z3 = Complex.polar(2, 1);
   /* Complex z5 = Complex.polar(2, 1);
    Complex z4 = z3.sub(z5);
    Complex m1  = z1.mul(z2);
    Complex m2  = z5.mul(z3);
    Complex d1  = z5.div(z3);

    Complex t1 = z3.asPlanar();
    Complex t2 = z5.asPlanar();
    Complex t3 = t2.mul(t1);
    Complex c1 = z1.conjugate();
    
    System.out.println(z4.asString());
    System.out.println(m1.asString());
    System.out.println(m2.asString());
    System.out.println(d1.asString());              
    System.out.println(t3.asString());
    System.out.println(c1.asString());   */
    Complex c2 = z3.conjugate();
    System.out.println(c2.asString());
  }
}