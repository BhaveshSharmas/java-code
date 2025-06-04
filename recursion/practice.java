package recursion;

public class practice {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(swapstring(s));
        System.out.println(reverseString(s,0,s.length() -1));

    }

    static String swapstring(String s) {
        char[] newCharArray = s.toCharArray();
        int l = 0;
        int r = newCharArray.length- 1;
        while (l != r){
            swap(newCharArray,l,r);
            l++;
            r--;
        }

        return new String(newCharArray);
    }

    static void swap(char[] ch, int first, int end) {
        char temp = ch[first];
        ch[first] = ch[end];
        ch[end] = temp;
    }

    public static int reverseString(String s, int st, int e) {

        char[] ch = s.toCharArray();

        if (st < e){
            return -1;
        }
        char temp = ch[st];
        ch[st] = ch[e];
        ch[e] = temp;

        return reverseString(ch,st,e);
    }


}
