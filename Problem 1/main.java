/*
Write a java program to get a string as an input and remove the 
consecutively repeated characters more than 2 times.

input:
abaaaaa

output:
abaa
*/

import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int n = str.length();
        int count = 0;
        char prev =' ';
        for(int i=0; i<n-1; i++) {
            if(ch[i] == ch[i+1]) {
                count++;
                if(count <= 2) {
                    System.out.print(ch[i]);
                    prev = ch[i];
                }
            }
            else {
                if(count > 0) {
                    i++;
                    count = 0;
                    System.out.print(ch[i]);
                    prev = ch[i];
                }
                else {
                    System.out.print(ch[i]);
                    prev = ch[i];
                }
            }
        }
        if(prev != ch[n-1]) {
            System.out.print(ch[n-1]);
        }
        sc.close();
    }
}
