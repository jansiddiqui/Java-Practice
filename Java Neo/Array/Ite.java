import java.util.Arrays;

class Ite{
    public static void main(String[] args){
        int myArray[] = new int[7];
        myArray[0] = 134;
        myArray[1] = 5367;
        myArray[2] = 6787;
        myArray[3] = 123;;
        myArray[4] = 4567;
        myArray[5] = 1284;
        myArray[6] = 1984;
        System.out.println("The 5th element of the Array: "+myArray[4]);
        System.out.println("Content of the array: ");
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
