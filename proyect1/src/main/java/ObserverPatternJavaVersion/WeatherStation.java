package ObserverPatternJavaVersion;

public class WeatherStation {
	
	
	public static void main(String[] args) {
		WeatherData weatherData  = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay  = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMesurements(20, 21, 22);
		weatherData.setMesurements(30, 31, 33);
		weatherData.setMesurements(40, 43, 44);
	}

}
