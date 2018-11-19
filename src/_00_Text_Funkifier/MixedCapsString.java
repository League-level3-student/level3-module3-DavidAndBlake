package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixedCapsString = new String();
		for (int i = 0; i < s.length(); i ++) {
		if(i%2 == 0) {
			mixedCapsString += Character.toLowerCase(s.charAt(i));
		}
		if(i%2 == 1) {
			mixedCapsString += Character.toUpperCase(s.charAt(i));
		}
		}
		System.out.println("Mixed caps = " + mixedCapsString);
		return mixedCapsString;
	}

}
