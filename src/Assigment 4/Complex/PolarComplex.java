package Complex;

public class PolarComplex implements Complex {

  private final double modulus;

  private final double argument;

  PolarComplex(double modulus, double argument) {
    this.modulus  = modulus;
    this.argument = argument;
  }

  @Override
  public double re() {
    return modulus() * Math.cos(argument());
  }

  @Override
  public double im() {
    return modulus() * Math.sin(argument());
  }

  @Override
  public double modulus() {
    return modulus;
  }

  @Override
  public double argument() {
    return argument;
  }

  @Override
  public String asString() {
    return modulus() + " ∠" + argument();
  }

  @Override
  public Complex asPolar() {
    return this;
  }

  @Override
  public Complex asPlanar() {
    return Complex.planar(re(), im());
  }

  @Override
  public Complex add(Complex other) {
    return Complex.super.add(other).asPolar();
  }

  @Override
  public Complex sub(Complex other) {
    return Complex.super.sub(other).asPolar();
  }

  @Override
  public Complex mul(Complex other) {
    //return Complex.super.mul(other).asPolar();
        return Complex.polar(
        this.modulus() * other.modulus(),
        this.argument() + other.argument());
   
  }

  @Override
  public Complex div(Complex other) {
    return Complex.super.div(other).asPolar();
  }
  @Override
  public Complex conjugate(){
      return Complex.polar(
        modulus(),
        argument()*-1);
  }
}