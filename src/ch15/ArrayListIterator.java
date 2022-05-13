package ch15;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("add");
        data.add("bbb");
        data.add("ccc");
        Iterator<String> i = data.iterator(); // iterator 생성코드
        // iterator() 메서드는 호출한 컬렉션 요소에 연결된 Iterator 반환

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
