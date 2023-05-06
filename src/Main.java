public class Main {
    public static void main(String[] args) {
        NewList newList = new NewList();
        newList.addLast("erf");
        newList.addLast("32");
        newList.addFront("123");
        newList.addLast(4310);
        newList.addFront(12345);
        for (var item :
                newList) {
            System.out.println(item);
        }
    }
}