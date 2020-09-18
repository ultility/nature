package testers;

import assistants.MyList;

public class MyListTester {
    public static void main(String[] args) {
        MyList l1 = new MyList(13);
        System.out.println(l1.append(new MyList(15)));
        System.out.println(l1.append(new MyList(29)));
        System.out.println(l1.setNext(new MyList(19.6)));
        System.out.println(l1.setNext(new MyList("hello")));
        System.out.println(l1.setNext(new MyList(new MyList(15))));
        System.out.println(l1);
    }
}
