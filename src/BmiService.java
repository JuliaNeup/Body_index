public class BmiService {
    public int calculate(float p_mass, float p_height){
        return (int) Math.floor((p_mass/(p_height*p_height))*10000);
    }
}
