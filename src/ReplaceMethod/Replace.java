package ReplaceMethod;

public class Replace {
    public static void main(String [] args){
        int value=10;
        int b=20;
        String change1=String.valueOf(b);
        String change = String.valueOf(value);
        String Name="Java".toUpperCase();
        char [] arr=Name.toCharArray();
        String string= "Welcome to java Language";
        String Toupper = string.toUpperCase();
        System.out.println(Name.replace("java","JAVA"));
        System.out.println(string.replaceAll("to(.)","too")); // (.) regex operation remove the all space from given string.
        System.out.println(string.replaceFirst("a","A")); // here only first given string or char replace...
        System.out.println(change);
        System.out.println(Name.toCharArray());
        System.out.println(arr+" ");
        System.out.println(string.toUpperCase());
        System.out.println(Toupper);
        System.out.println(Name);
        System.out.println(value+b); // here two values are add to each other
        System.out.println(change+change1); // here two string are concat: to Each other....
    }
}
