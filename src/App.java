public class App {
    public static void main(String[] args) throws Exception {
        String forward = args[0];
        String reverse = "";
        for(int i=forward.length()-1; i>=0; i--){
            reverse += forward.charAt(i);
        }
        System.out.println(reverse);
    }
}
