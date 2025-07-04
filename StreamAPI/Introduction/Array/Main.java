package StreamAPI.Introduction.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, -1, -3};
        User user = new User(numbers);
        System.out.println(Arrays.toString(user.sortAsPositive()));
    }
}
