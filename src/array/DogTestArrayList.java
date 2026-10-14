package array;

import java.util.ArrayList;

public class DogTestArrayList {

    public static void main(String[] args) {

        ArrayList<Dog> arr = new ArrayList<Dog>();

        arr.add(new Dog("멍멍이", "치와와"));
        arr.add(new Dog("뽀삐", "진돗개"));
        arr.add(new Dog("순심이", "삽살개"));
        arr.add(new Dog("철이", "마르티스"));
        arr.add(new Dog("삐쭈", "푸들"));

        for (Dog dog : arr) {
            dog.showDogInfo();
        }
    }
}
