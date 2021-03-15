public class Bmi {
    public static double calculate(double weight,double height){
        height /= 100;
        double bmi = weight / (height * height);
        return bmi;
    }
}
