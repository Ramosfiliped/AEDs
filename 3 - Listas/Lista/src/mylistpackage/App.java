package mylistpackage;

public class App {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(10);

        list.setValue(0, 15);
        list.remove(1);
        list.print();
    }
}
