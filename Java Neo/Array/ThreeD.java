import java.io.*;
class ThreeD {
    public static void main(String[] args){
        int arr[][][] = {{{1, 2}, {3, 4}, {5, 6}, {7, 8}}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.println("arr[" + i + "][" + j + "][" + k +"] = " + arr[i][j][k]);
                }
            }
        }
    }
}
