public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(55);
        myLinkedList.addLast(56);
        myLinkedList.addLast(57);
        myLinkedList.addLast(58);
        myLinkedList.display();
        //System.out.println(myLinkedList.contains(57));
        //System.out.println(myLinkedList.size());
        myLinkedList.addIndex(4,59);
        myLinkedList.display();
    }

}
