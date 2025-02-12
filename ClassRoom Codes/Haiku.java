import java.util.Scanner;
class Haiku{
    static int calculateVowels(String s){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();
        int a = calculateVowels(s1);
        int b = calculateVowels(s2);
        int c = calculateVowels(s3);
        if(a==5 && b==7 && c==5){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}