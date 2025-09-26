package recursion;

public class practice {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
//        System.out.println(swapstring(s));
        char[] ch = s.toCharArray();
        System.out.println(reverseHelper(ch,0,s.length() -1));



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

    static char[] reverseHelper(char[] s, int start, int end) {
        if (start >= end) {
            return s; // Base case: return the modified array
        }

        // Swap characters
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        // Recursive call
        return reverseHelper(s, start + 1, end - 1);
    }


}
