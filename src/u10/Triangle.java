package u10;

public class Triangle {

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(double s1) {
        this.s1 = s1;
        this.s2 = s1;
        this.s3 = s1;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public boolean isScalene (Triangle x) {
        return (s1 != s2 && s2 != s3 && s1 != s3);
    }

    public boolean isIsosceles (Triangle x) {
        return (s1 == s2 || s2 == s3 || s1 == s3);
    }

    public double getPerimeter () {
        return s1 + s2 + s3;
    }

    public void dilate( double scale) {
        s1 *= scale;
        s2 *= scale;
        s3 *= scale;
    }



}
