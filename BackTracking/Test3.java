package BackTracking;

public class Test3 {
    static void findPermutations(String s, String ans){
        // base condition
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            String ns = s.substring(0, i)+s.substring(i+1);
            findPermutations(ns, ans+cur);
        }
    }

    public static void main(String[] args){
        String s = "abc";
        findPermutations(s, "");
    }
}
