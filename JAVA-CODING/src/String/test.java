package String;

public class test {

    public static void main(String[] args) {
        String[] str = new String[]{"G","D","M"};

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
System.out.println("____________________");
        for(String s:str){
            System.out.println(s);
        }

        // System.out.println("G");

        // System.out.println("D");
        // System.out.println("M");


        String text = "GDM";

        for (char letter : text.toCharArray()) {
            System.out.println(letter);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
            }
        }
        
    }
    
}
