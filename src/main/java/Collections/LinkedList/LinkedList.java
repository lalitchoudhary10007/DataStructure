package Collections.LinkedList;

public class LinkedList {

    public static void main(String[] args) {

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst("Lalit");
        doublyLinkedList.addLast("kumar");
        doublyLinkedList.addLast("mahala");
        doublyLinkedList.addLast("s");
        doublyLinkedList.addLast("ss");
        doublyLinkedList.addLast(null);
        //  doublyLinkedList.clear();
//        doublyLinkedList.indexOf("s");
        System.out.println(doublyLinkedList.indexOf(null));
//        while (doublyLinkedList.iterator().hasNext()) {
//            System.out.println(doublyLinkedList.iterator().next());
//        }
    }

}
