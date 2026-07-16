//4 --> Linear Search with Strings
// Error code --> Resolve it.

public class Arrays4 {

    public static int linearSearch2 (String car[], String key) {
        for (int i = 0; i < car.length; i++) {
            String[] cars;
            if (cars[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String cars[] = {"Tata Safari","Ford Endevor", "Toyota Fortuner", "Defender", "Land Rover"};
        String key = "Defender";

        int index = linearSearch2(cars, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Your key found at index : " + index);
        }
        
    }
    
}
