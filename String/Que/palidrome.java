package String.Que;

public class palidrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palidrome(str));
    }
    public static boolean palidrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
