public class Add_binary {
    // import  java.math.BigInteger;
// class Solution {
//     public String addBinary(String a, String b) {

//         BigInteger x = new BigInteger(a,2);
//         BigInteger y = new BigInteger(b,2);

//         BigInteger sum = x.add(y);
        

//         return sum.toString(2);
        
//     }
// }

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            sb.append(sum % 2);   // add current bit
            carry = sum / 2;      // update carry
        }
        
        return sb.reverse().toString();  // reverse final answer
    }
}

}
