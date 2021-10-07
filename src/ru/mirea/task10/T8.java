package ru.mirea.task10;
import java.util.Scanner;
public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово из строчных латинских букв: ");
        String str = sc.nextLine();
        if(recPalindrome(str,0,str.length()-1))
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    public static boolean recPalindrome(String s, int a, int z) {
        if (a == z) return true;
        if ((s.charAt(a)) != (s.charAt(z))) return false;
        if (a < z + 1) return recPalindrome(s, a + 1, z - 1);
        return true;
    }
}
