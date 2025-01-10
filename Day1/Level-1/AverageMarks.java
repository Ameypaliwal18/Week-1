class AverageMarks {
	public static void main(String[] args) {
		
		//Taking name of the person as Sam
		String name = "Sam";
		
		//Sam's marks in PCM : 
		int maths_score = 94, physics_score = 95, chemistry_score = 96;
		
		//Calculation of average
		double average = (maths_score + physics_score + chemistry_score)/3;
		
		System.out.println(name + "'s average mark in PCM is " + average);
		
	}
}