package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<Book>();

        book.add(new Book("태백산맥", "조정래"));
        book.add(new Book("데미안", "헤르만 헤세"));
        book.add(new Book("연을 쫓는 아이", "할레드 호세이니"));
        book.add(new Book("토지", "박경리"));
        book.add(new Book("어린왕지", "생택쥐페리"));

//        for (int i = 0; i < book.size(); i++) {
//            book.get(i).showBookInfo();
//        }
    }
}
