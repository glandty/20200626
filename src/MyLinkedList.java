class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;//保存单链表的头结点的引用

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找是否包含关键字key
    public boolean contains(int key) {
        Node cur = this.head;
       while(cur != null) {
           if(cur.data == key) {
               return true;
           }
           cur = cur.next;
       }
       return false;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index , int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == this.size()) {
            addLast(data);
            return;
        }
        //先找到 index位置的前一个节点的地址
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

    private Node searchIndex(int index) {
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合法!");
        }
        Node cur = this.head;
        for (int i = 0; i < index-1 ; i++) {
            cur = cur.next;
        }
        return cur;
    }



    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count ++;
            cur = cur.next;
        }
        return count;
    }


    //打印单链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
