package pack3;

public class FrenchVoice implements Voices {
	
	@Override
	public void maleVoice() {
		System.out.println("French Male Voice Implementation");
	}

	@Override
	public void femaleVoice() {
		System.out.println("French Female Voice Implementation");
	}

	public static void main(String[] args) {
		
		Voices fr = new FrenchVoice();
		
		fr.maleVoice();
		fr.femaleVoice();
		fr.commonVoice();

	} // end of main

} // end of class
