package array;

public class CharArray {

    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        // 아스키 코드값을 각 요소에 저장
        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }

        // 각 요소값 출력
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
        }
    }
}
