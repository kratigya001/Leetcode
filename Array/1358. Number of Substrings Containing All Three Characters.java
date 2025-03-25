class Solution {
    public int numberOfSubstrings(String s) {//youtube-codestorywithmik
        int l=0, r=0;
        int total=0;
        int n=s.length();
        int hash[]=new int [3]; // Stores count of 'a', 'b', 'c'
        while(r<n){
            hash[s.charAt(r)-'a']++; // Increment frequency of current character
            while(hash[0]>0 && hash[1]>0 && hash[2] >0){//valid substring
                total += n-r ;//all substring from 1 to n are valid

                hash[s.charAt(l)-'a']--; //shrink
                l++;
            }
            r++;

        }
        return total;
        
    }
}