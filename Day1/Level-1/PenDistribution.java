class PenDistribution {
	public static void main(String[] args) {
		
		//Initialising total pens and students
		int TotalPens = 14, TotalStudents = 3;
		
		//Distributing Pen
		int EachStudentGet = TotalPens / TotalStudents;
		
		//Calculating number of pen left
		int pensRemaining = TotalPens % TotalStudents;
		
		System.out.println("The Pen Per Student is " + EachStudentGet + " and the remaining pen not distributed is " + pensRemaining);
		
	}
}