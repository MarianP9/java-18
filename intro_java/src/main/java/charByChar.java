public class charByChar {
    public static void main(String[] args) {
        String str = "Ana are mere";
        char[] charArray = str.toCharArray();
        int vocale = 0;

        for (char ch : charArray){
            if(ch=='a'||
            ch=='e'||
            ch=='i'||
            ch=='o'||
            ch=='u')
                vocale++;
            System.out.println(ch);
        }
        System.out.println(vocale);

    }
}
