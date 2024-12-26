package pack3;

public interface Voices {
	
	default void commonVoice() {
		System.out.println("Common Voice..");
	}
	
	void maleVoice();
	
	void femaleVoice();
}
