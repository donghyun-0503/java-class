package array;

public class DogTest {

    public static void main(String[] args) {

        Dog[] arr = new Dog[5];

        arr[0] = new Dog("멍멍이", "치와와");
        arr[1] = new Dog("뽀삐", "진돗개");
        arr[2] = new Dog("순심이", "삽살개");
        arr[3] = new Dog("철이", "마르티스");
        arr[4] = new Dog("삐쭈", "푸들");

        for (Dog dog : arr) {
            dog.showDogInfo();
        }
    }
}
