public class String_Functions {
    public static void main(String[] args) {
        String A1 = "welcome to string function";
        String A2 = "asifjamadar352@gmail.com";

        // Corrected and improved output statements
        System.out.println(A1 == A1);  // true
        System.out.println(A1.toLowerCase()); // welcome to string function
        System.out.println(A1.toUpperCase()); // WELCOME TO STRING FUNCTION
        System.out.println(A1.length()); // 29
        System.out.println(A1.concat(" asif")); // welcome to string function asif
        System.out.println(A1.charAt(5)); // m
        System.out.println(A1.equals("welcome to string function")); // true
        System.out.println(A1.contains("to")); // true
        System.out.println(A1.substring(0, 7)); // welcome
        System.out.println(A1.replace('m', 'M')); // weMcome to string function
        System.out.println(A1.replaceAll("string", "java")); // welcome to java function

        System.out.println(A1.indexOf('e')); // 1

        String[] a = A2.split("@");
        System.out.println(a[0]); // asifjamadar352
        System.out.println(a[1]); // gmail.com

        System.out.println(A1.equalsIgnoreCase("WELCOME TO JAVA")); // false
    }
}
