public class StringTest {
public static void main(String[] args) {
String s1 = "Nirmala";
String s2 = "Nirmala";
System.out.println(s1 == s2); // true (both refer to same string in string pool)
s1 = s1 + "Jyothi";
System.out.println(s1 == s2); // false (s1 now refers to a new object)
String s3 = "NirmalaJyothi";
System.out.println(s1==s3);
}
}