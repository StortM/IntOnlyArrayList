public class IntOnlyArrayList {

    IntOnlyArrayList(){
    }

    private int[] data = new int[0];

    public int get(int index){
        try{
            return data[index];
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            return 0;
        }

/*        if (index > data.length){
            return 0;
        }
        else{
            return data[index];
        }*/
    }

    public int size(){
        return data.length;
    }

    public void add(int value){
        int[] newArr = new int[data.length+1];

        for (int i = 0; i<newArr.length-1; i++){
            newArr[i] = data[i];
        }
        newArr[newArr.length-1] = value;

        data = newArr;
    }

    public void remove(int index){
        int[] newArr = new int[data.length-1];

        for (int i = 0; i<newArr.length; i++){
            if (i == index){
                continue;
            }
            else{
                newArr[i] = data[i];
            }
        }
        data = newArr;
    }
}
