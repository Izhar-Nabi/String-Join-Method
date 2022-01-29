package StringPracticeMethod;

public class JoinMethod {
    public static void main(String []args){
        String Name = "java";
        String s2="Welcome to Coding";
        String Name2= "JavaTPoint";
        String ss="Love To Code";
        // in place of delimiter we can't pass any Null String Through this... it throw a error...
        System.out.println(String.join(",",s2,Name2,ss)); // here join is (charSequence delimiter,charSequence....element) ... show that where argument.
        //we call the store string through String.join method because Here join is Static method....
        System.out.println(10+Name+36);
        System.out.println(Name2+10+36);
        System.out.println(10+36+s2);
        System.out.println(Name+10+(-24)); // here we can't write in neg sign form it throw a error... like (Name+10-24) this not possible..
        System.out.println(ss+10/10); // here prefer the operation...(Division first then multiplication but substraction isn't possible.
    }
}
