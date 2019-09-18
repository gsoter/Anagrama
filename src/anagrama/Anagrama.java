package anagrama;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagrama implements IAnagrama {

	@Override
	public boolean isAnagramas(String s1, String s2) {
		String str1 = s1.replaceAll(" ", "");
		String str2 = s2.replaceAll(" ", "");
		
		if (!(numFinder(s1) || numFinder(s2)))
		if (str1.length() == str2.length()) {
			char[] array1 = str1.toLowerCase().toCharArray();
			char[] array2 = str2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			return (Arrays.equals(array1, array2));
		}
		return false;
	}

	public boolean numFinder(String s) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		return m.find();
	}
}
