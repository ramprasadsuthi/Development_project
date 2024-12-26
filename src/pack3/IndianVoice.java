package pack3;

public class IndianVoice implements Voices {
	
	@Override
	public void maleVoice() {
		System.out.println("Indian Male Voice Implementation");
	}

	@Override
	public void femaleVoice() {
		System.out.println("Indian Female Voice Implementation");
	}

	public static void main(String[] args) {
		
		Voices in = new IndianVoice();
		
		in.maleVoice();
		in.femaleVoice();
		in.commonVoice();

	} // end of main

} // end of class
