package String.Que;

public class StringCompress {
    public static void main(String[] args) {
        String str = "AAABBCCCCDD";
        // AAABBCCCCDD -> A3B2C4D2
        compress(str);
    }
    public static void compress(String str){
        StringBuilder sb = new StringBuilder("");
        Integer count=1;
        for(int i=0; i<str.length(); i++){
            count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
}
