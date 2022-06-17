import java.lang.*;

class Solution {
    public boolean isPalindrome(String s) {
        
        String s1="" ;
         
       for (char c : s.toCharArray())
        {
            if (Character.isDigit(c) || Character.isLetter(c))
                s1+= c;
                
        }
        
        s1= s1.toLowerCase();
        int x =0 ;
        int y = s1.length()-1;
        
        while (x<=y )
        {
            if(s1.charAt(x) != s1.charAt(y))  
            {  return false; }
              
            
            x++;
            y--;                    
        }
        return true ; 
    }
}