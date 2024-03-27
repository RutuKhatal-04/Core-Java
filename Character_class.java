class Character_class
{
public static void main(String []args)
{

System.out.println("\ntype = "+Character.TYPE);
System.out.println("\nsize = "+Character.SIZE);
System.out.println("\nmin value = "+Character.MIN_VALUE);
System.out.println("\nmax value = "+Character.MAX_VALUE);

System.out.println("\nislowercase = "+Character.isLowerCase('a'));
System.out.println("\nisuppercase = "+Character.isUpperCase('a'));
System.out.println("\nisdigit = "+Character.isDigit('8'));
System.out.println("\nisletter = "+Character.isLetter('t'));
System.out.println("\nisletter or digit = "+Character.isLetterOrDigit('t'));
System.out.println("\nisletter or digit = "+Character.isLetterOrDigit('8'));
System.out.println("\niswhitespace = "+Character.isWhitespace(' '));

System.out.println("\ntolowercase = "+Character.toLowerCase('E'));
System.out.println("\ntolowercase = "+(char)Character.toLowerCase(66));
System.out.println("\ntouppercase = "+Character.toUpperCase('a'));
System.out.println("\ntouppercase = "+Character.toUpperCase(98));



}
}