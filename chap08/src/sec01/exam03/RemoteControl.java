package sec01.exam03;

public interface RemoteControl {
	int MAX_VOULUME = 10;
	int MIN_VOLUME = 10;
	
	
	//추상 매소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
