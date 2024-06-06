import java.util.Random;

public class Main {
    public static String permission(int age, int temperature) {
        if (((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) ||
                (age < 20 && (temperature >= 0 && temperature <= 28)) ||
                (age > 45 && (temperature >= -10 && temperature <= 25))) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static void main(String[] args) {
        System.out.println(permission(24,28));
        System.out.println(permission(15,17));
        System.out.println(permission(46,-6));
        System.out.println(permission(7,35));
        System.out.println(permission(58,-4));
        System.out.println(permission(generateRandomAge(),10));
    }
    public static int generateRandomAge() {
        Random age = new Random();
        return age.nextInt(100);
    }
}
