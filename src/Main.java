public class Main {
    public static void main(String[] args) {
        IntOnlyArrayList myArrayList = new IntOnlyArrayList();
        myArrayList.size();
        myArrayList.add(5);
        System.out.println(myArrayList.get(0));
        myArrayList.add(100);
        System.out.println(myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println(myArrayList.get(0));
    }
}
