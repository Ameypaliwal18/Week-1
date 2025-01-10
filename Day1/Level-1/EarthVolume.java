class EarthVolume {
	public static void main(String[] args) {
	
		//Defining constant PI 
		double pi = 22.0 / 7.0;
		
		//Defining Radius of Earth
		int radius = 6378;
		
		//Calculating volume 
		double volumeInKm = (4.0/3.0) * pi * radius * radius * radius;
		double volumeInMiles = volumeInKm * 0.62; // 1km = 0.62miles
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
		
	}
}