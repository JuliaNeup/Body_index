public class BmiService {
    public int calculate(float parMass, float parHeight) {
        return (int) Math.floor((parMass / (parHeight * parHeight)) * 10000);
    }
}
