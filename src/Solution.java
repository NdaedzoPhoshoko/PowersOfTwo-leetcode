public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.print(PowersofTwo(1024));
    }
    public static String PowersofTwo(int num){
        double local_num = num;
        while(local_num >=2){
            local_num /= 2; 
        }
        if(local_num == 1.0){
            return "true";
        }
        return "false";
    }
}
