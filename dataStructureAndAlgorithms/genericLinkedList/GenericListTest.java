package dataStructureAndAlgorithms.genericLinkedList;

public class GenericListTest {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();

        System.out.println("Creating list: ");
        list.addLast("Carro");
        list.addStart("Moto");
        list.addLast("Avião");
        list.addStart("Bicicleta");
        System.out.println(list);

        System.out.println("\nRemoving element at index 3 (Avião): ");
        list.removeByPosition(0);
        System.out.println("Updated List: " + list);

        System.out.println("\nVerifying if the list contains a value (Moto): " + list.contains("Moto"));
    }
}
