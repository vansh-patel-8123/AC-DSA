package String.Que;
// codenation
public class firstLetterUpperCase {
    public static void main(String[] args) {
        String str = "hi i am vansh patel ";
        Uppercase(str);
    }
    public static void Uppercase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && str.length()-1>i){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
