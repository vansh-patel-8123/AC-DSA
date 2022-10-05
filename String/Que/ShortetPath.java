package String.Que;

public class ShortetPath {
    public static void main(String[] args) {
        String path = "NEEWWSSNN";
        path(path);
    }
    public static void path(String str){
        int x=0,y=0;
        for(int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            if(temp == 'N') {
                y++;
            }
            else if(temp == 'E'){
                x++;
            }
            else if(temp == 'W'){
                x--;
            }
            else if(temp == 'S'){
                y--;
            }
        }
        System.out.println(Math.sqrt((x*x) + (y*y)));
    }
}
