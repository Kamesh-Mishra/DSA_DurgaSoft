package BackTracking;

// Find Subsets:
// -------------
// find all subsets of the given string.

// Ex: abc ----> "",a,b,c,ab,bc,ac,abc

// 3 char ----> 2^n ---> 2^3 = 8

// abcd ----> 2^4 = 16 

public class Test2 {
    public static void findSubsets(String s, String ans, int index){
        // base condition
        if(index == s.length()){
            if(ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }

        // yes condition
        findSubsets(s, ans+s.charAt(index), index+1);
        // no condition
        findSubsets(s, ans, index+1);
    }

    public static void main(String[] args){
        String s = "abc";
        String ans = "";
        findSubsets(s, ans, 0);
    }
}
