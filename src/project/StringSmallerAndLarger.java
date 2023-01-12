package project;

import java.util.Scanner;class StringSmallerAndLarger{

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
        }
        public static String getSmallestAndLargest(String s, int k) {
        String largest = "";
        String smallest ="";
        int size = s.length();
        boolean firstTime = true;

        for(int x=k; x<=size; x++) {
        String substr = s.substring(x-k, x);
        if (firstTime) {
        smallest = substr;
        largest = substr;
        firstTime = false;
        }
        else {
        smallest = (substr.compareTo(smallest) < 0) ? substr : smallest;
        largest = (substr.compareTo(largest) > 0) ? substr : largest;
        }
        }

        return smallest + "\n" + largest;
        }
}