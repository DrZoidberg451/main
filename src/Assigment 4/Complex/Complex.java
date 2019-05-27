package Complex;

public interface Complex {

  static Complex polar(double modulus, double argument) {
    return new PolarComplex(modulus, argument);
  }

  static Complex planar(double re, double im) {
    return new PlanarComplex(re, im);
  }

  double re();

  double im();

  double modulus();

  double argument();

  String asString();

  Complex asPolar();

  Complex asPlanar();

  default Complex add(Complex other) {
    return Complex.planar(
        this.re() + other.re(),
        this.im() + other.im());
  }

  default Complex sub(Complex other){
      return Complex.planar(
        this.re() - other.re(),
        this.im() - other.im());
  }

  default Complex mul(Complex other){
      return Complex.planar(
          (this.re()*other.re())-(this.im()*other.im()),
          (this.re()*other.im())+(this.im()*other.re())
          );


  }

  default Complex div(Complex other){
      double den = Math.pow(other.modulus(), 2);

      return Complex.planar(
        ((this.re()*other.re()+this.im()*other.im())/den) , 
        ((this.im()*other.re()-this.re()*other.im())/den));
  }

  default Complex conjugate(){
      return Complex.planar(this.re(), this.im() * -1);
  }
}