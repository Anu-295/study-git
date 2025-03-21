package String;

public class StringSample {

	public static void main(String[] args) {
		String s="hello";
		String s1=new String("welcome");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		s=s.concat(" Java");
		System.out.println(s);
		String a=1+2+"Anu+"+3+4;
		System.out.println(a);
		String b="Manu";
		String b1="minu";
		String b2="manu";
		String b3="Manu";
		System.out.println(b.equals(b1));
		System.out.println(b.equals(b2));
		System.out.println(b.equals(b3));
		System.out.println(b.equalsIgnoreCase(b3));
		String c="hello";
		String c1="Java";
		String c2="hello";
		System.out.println(c.compareTo(c1));
		System.out.println(s1.compareTo(s));
		System.out.println(c.compareTo(s));
		System.out.println(c==c1);
		System.out.println(c==c2);
		String m="Welcome to testing";
		System.out.println(m.startsWith("W"));	
		System.out.println(m.endsWith("e"));
		System.out.println(m.startsWith("W"));	
		System.out.println(m.contains("java"));	
		String y="   hi   ";
		System.out.println(y.trim());
		System.out.println(m.replace("Testing","java"));	


}
}
