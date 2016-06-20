
public class countYZ {

	public String sumDigits(String string) {

		String str = "";
		int len = string.length();
		int begin = 0, end = len - 1;
		if (begin == end) {
			return str;
		} else {

			for (int i = 0, j = len - 1; (i < len - 1 && j > 0); i++, j--) {

				if (string.charAt(i) == string.charAt(j)) {

					System.out.println(string.charAt(i));
					System.out.println(string.charAt(j));
					str = str + string.charAt(i);
				}

			}
		}

		// System.out.println(str);
		return str;
	}
public static void main(String[] args)
{
	countYZ cy = new countYZ();
	cy.sumDigits("abcxyzcba");
}

}