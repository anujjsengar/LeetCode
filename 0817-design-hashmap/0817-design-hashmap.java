class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyHashMap() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void put(int key, int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node(key, value);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    public int get(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void remove(int key) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) {
                    head = temp.next;
                    if (head == null) tail = null; 
                } else {
                    prev.next = temp.next;
                    if (temp == tail) tail = prev;
                }
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
