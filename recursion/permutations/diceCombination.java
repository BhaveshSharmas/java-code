//this code is for the dice combinations of a particular number;

package recursion.permutations;

import java.util.ArrayList;

public class diceCombination {
    public static void main(String[] args) {

        ArrayList<String> list = diceCombiAl("", 4);
        System.out.println(list);
    }

    //this is for only printing the answer simple;
    static void diceCombi(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceCombi(p + i, target - i);
        }
    }

    //This is f or the store answer in the arraylist and then print in a simple arraylist;
    static ArrayList<String> diceCombiAl(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> answer = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ArrayList<String> list = diceCombiAl(p + i, target - i);
            answer.addAll(list);
        }

        return answer;
    }
}
