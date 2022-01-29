package ReplaceMethod;

public class Replace {
    public static void main(String [] args){
        String Name="Java";
        String string= "Welcome to java Language";
        System.out.println(Name.replace("java","JAVA"));
        System.out.println(string.replaceAll("to(.)","too")); // (.) regex operation remove the all space from given string.
        System.out.println(string.replaceFirst("a","A")); // here only first given string or char replace...
    }
}
