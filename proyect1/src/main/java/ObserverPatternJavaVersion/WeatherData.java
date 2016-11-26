package ObserverPatternJavaVersion;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
	}

	
	public void setMesurements(float temperature,float humidity, float pressure){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		mesurementsChanged();
	}
	
	

	public void mesurementsChanged() {
		setChanged();
		notifyObservers();
		
	}


	public float getTemperature() {
		return temperature;
	}


	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}
	
	

}
