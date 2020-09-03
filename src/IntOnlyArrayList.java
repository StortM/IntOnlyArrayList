import java.util.Arrays;

public class IntOnlyArrayList {

    IntOnlyArrayList(){
    }

    private int[] data = new int[0];

    public int get(int index){
        //Min måde at gøre det på
/*        try{
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error! Index out of bounds. Cannot access index " + index + " for ArrayList length " + data.length);
            return 0;
        }*/

        //Med "throw new Exception"
        if (index <= data.length && index >= 0){
            return data[index];
        }
        else {
            System.out.println("Error! Index out of bounds. Cannot access index " + index + " for ArrayList length " + data.length);
            throw new ArrayIndexOutOfBoundsException();
        }
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
        if (index <= data.length && index >= 0){
            int[] newArr = new int[data.length-1];
            boolean removedFlag = false;

            for (int i = 0; i<newArr.length; i++){
                if (removedFlag){
                    newArr[i] = data[i+1];
                }

                else if (i == index){
                    removedFlag = true;
                    i = i-1;
                }
                else{
                    newArr[i] = data[i];
                }
            }
            data = newArr;
        }
        else{
            System.out.println("Error! Index out of bounds. Cannot remove entry at index " + index + " for ArrayList length " + data.length);
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //clears data field
    public void clear(){
        data = new int[0];
    }

    //add at index
    public void add(int index, int value){
        if (index <= data.length && index >= 0){
            int[] newArr = new int[data.length+1];
            boolean valueAddedFlag = false;
            for (int i = 0; i<newArr.length; i++){
                if (valueAddedFlag){
                    newArr[i] = data[i-1];
                }
                else if (i == index){
                    newArr[i] = value;
                    valueAddedFlag = true;
                }
                else{
                    newArr[i] = data[i];
                }
            }
            data = newArr;
        }
        else{
            System.out.println("Error! Index out of bounds. Cannot remove entry at index " + index + " for ArrayList length " + data.length);
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
