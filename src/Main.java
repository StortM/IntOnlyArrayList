public class Main {
    public static void main(String[] args) {
        IntOnlyArrayList myArrayList = new IntOnlyArrayList();
/*        System.out.println(myArrayList.size());
        myArrayList.add(5);
        System.out.println(myArrayList.get(0));
        myArrayList.add(100);
        System.out.println(myArrayList.get(1));*/
        myArrayList.add(50);
        myArrayList.add(51);
        myArrayList.add(52);
        myArrayList.add(53);
        System.out.println(myArrayList);
        myArrayList.add(2,999);
        System.out.println(myArrayList);
/*
        System.out.println(myArrayList.get(0));
        myArrayList.add(89);
        myArrayList.add(89);
        myArrayList.add(89);
        myArrayList.add(89);
        System.out.println(myArrayList);
        myArrayList.add(0,7890);
        System.out.println(myArrayList);*/
    }
}
