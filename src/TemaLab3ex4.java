
public class TemaLab3ex4 {


        public static void main(String[] args) {

            String str = "ana", reverseStr = "";

            int strLength = str.length();

            for (int i = (strLength - 1); i >=0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " este palindrom");
            }
            else {
                System.out.println(str + " nu este palindrom");
            }
        }

}