public class Main {
    public static void main(String[] args) {
        IntOnlyArrayList myArrayList = new IntOnlyArrayList();
        System.out.println(myArrayList.size());
        myArrayList.add(5);
        System.out.println(myArrayList.get(0));
        myArrayList.add(100);
        System.out.println(myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println(myArrayList.get(0));
        myArrayList.add(89);
        myArrayList.add(89);
        myArrayList.add(89);
        myArrayList.add(89);
        System.out.println(myArrayList);
        myArrayList.add(0,7890);
        System.out.println(myArrayList);
    }
}
