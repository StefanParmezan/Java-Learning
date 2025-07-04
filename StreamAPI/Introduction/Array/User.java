package StreamAPI.Introduction.Array;

import java.util.Arrays;

public class User {
    private int[] numbers;

    public User(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] sortAsPositive(){
        int[] result = Arrays.stream(this.getNumbers()).filter(x -> x > 0).toArray();
        return result;
    }
}
