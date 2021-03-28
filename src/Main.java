public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 111; //Вес в кг
        int height = 178; //Рост в см
        int ind = service.calculate(mass,height);
        System.out.println(ind);
    }
}
