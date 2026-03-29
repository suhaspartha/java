public class StringTest {
    public static void main(String[] args) {
        String name = "John";
        String duplicateName1 = name.repeat(0);
        // false, because eventually returns a new String  for non-zero positive values.
        System.out.println(name == duplicateName1);
        String duplicateName2 = name.repeat(1);
        System.out.println(name == duplicateName2);
        String duplicateName3 = name.repeat(2);
        System.out.println("value:" + duplicateName3 + " and equality: " + (name == duplicateName3));
        try {
            name.repeat(-1);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println(null instanceof String);
    }
}
