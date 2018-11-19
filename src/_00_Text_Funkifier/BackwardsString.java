package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String backwardsMessage = new String();
		for (int i = s.length()-1; i >= 0; i--) {
			backwardsMessage += s.charAt(i);
		}
		System.out.println(backwardsMessage);
		return backwardsMessage;
	}

}
