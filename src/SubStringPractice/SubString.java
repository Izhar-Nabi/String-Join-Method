package SubStringPractice;

public class SubString {
    public static void main(String []args){
        String Name="Welcome To Java Coding";
        String Name2 ="Sub String";
        System.out.println(String.join(",",Name,Name2));
        System.out.println(Name.subSequence(5,10)); // Here subSequence pass the values in integer(start integer, End integer).
        System.out.println(Name2.substring(8)); // program print the After Char of Given Name... substring(only start integer) then show till the end of Sequence of given String
    }
}
