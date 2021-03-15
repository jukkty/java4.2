public class Main {
    public static void main(String[] args){
        Bmi service = new Bmi();
        double weight = 60;
        double height = 170;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
