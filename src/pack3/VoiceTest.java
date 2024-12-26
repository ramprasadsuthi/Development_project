package pack3;

public class VoiceTest {

	public static void main(String[] args) {
		
		Voices voice = new IndianVoice();
		voice.maleVoice();
		
		voice = new FrenchVoice();
		voice.femaleVoice();

	}

}
