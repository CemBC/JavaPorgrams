package Objects;

public class  Number{
    private float  p;
    private float q;

    public Number(float x,float y){
        p = x;
        q = y;
    }

    public float Mult(Number z) {
        return (p/q) * (z.p / z.q);
    }

    public float Divide(Number z){
        return ((p/q)/(z.p/z.q));
    }

    public float Add(Number z) {
        return ((p*z.q)/(q*z.q)) + ((z.p*q)/(z.q*q));
    }

    public float Sub(Number z){
        return ((p*z.q)/(q*z.q)) - ((z.p*q)/(z.q*q));
    }
}