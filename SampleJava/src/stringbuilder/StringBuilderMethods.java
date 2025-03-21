package stringbuilder;

public class StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s);
		s.append("is simple");
		System.out.println(s.capacity());
		System.out.println(s);
		s.delete(0, 4);
		System.out.println(s);
		s.insert(0, "python");
		System.out.println(s);
		s.replace(9, 15, "powerful");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());
		s.append("and python are simple");
		System.out.println(s);
		System.out.println(s.capacity());

	}

}
