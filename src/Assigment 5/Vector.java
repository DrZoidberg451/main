class Vector {

    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void show(){
        System.out.println("x=" + this.x +" y=" + this.y + " z=" + this.z);
    }

    public Vector add(Vector other){
        return new Vector(
                this.x + other.x,
                this.y + other.y,
                this.z + other.z);
    }

    public Vector sub(Vector other){
        return new Vector(
                this.x - other.x,
                this.y - other.y,
                this.z - other.z);
    }

    public double scalar(Vector other){
        return (
                this.x * other.x +
                this.y * other.y +
                this.z * other.z);
    }


    public static void main(String[] args) {
        Vector v1 = new Vector(2.5,5,8);
        Vector v2 = new Vector(3,6.9,4);

        Vector v3 = v1.add(v2);
        v3.show();
        Vector v4 =  v3.sub(v1);
        v4.show();
        System.out.println(v3.scalar(v4));
    }
}