import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<Integer> userNumbers = new ArrayList<Integer>(5);

        for (int i=0; i<5; i++) {
            System.out.printf("Give me number %d.\n", i+1);
            userNumbers.add(Integer.parseInt(userInput.nextLine()));
        }
        System.out.println(userNumbers);

        int sum = 0;
        int product = 1;
        int large = 0;
        int small = 0;
        for (int num: userNumbers) {
            sum += num;
            product *= num;
            if(num > large) {
                large = num;
            }
            if(num < small || small == 0) {
                small = num;
            }

        }
        System.out.printf("The sum is %d. \n", sum);
        System.out.printf("The product is %d. \n", product);
        System.out.printf("The largest number is %d. \n", large);
        System.out.printf("The smallest number is %d. \n", small);


        HashMap<String, String> car = new HashMap<>();

        car.put("Honda", "Civic");
        car.put("Toyota", "Camry");
        car.put("Hyundai", "Elantra");
        System.out.println("What kind of car are you looking for?");
        String userCar=userInput.nextLine();
        if(car.containsKey(userCar)){
            System.out.println(car.get(userCar)+"s are right this way");
        } else {
            System.out.println("We do not have that car.");
        }

    }
}
