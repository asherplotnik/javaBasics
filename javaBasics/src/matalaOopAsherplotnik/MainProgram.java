package matalaOopAsherplotnik;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
	
	public static int counter = 0;
	public static int tCounter = 0;

	public static void main(String[] args) {
		
		// populate the scool with classes
		
		School jB = new School(5);
		fillSchool(jB);
		System.out.println(jB);
		System.out.println();

		//print school average of grades
		
		System.out.println("School Average of grades is: " + getSchoolAverageTotalGrade(jB));
		System.out.println();

		// print average grades by class
		
		getClassAverageGrade(jB);
		System.out.println();
		
		// print average grades of all the school by profession
		
		getSchoolAverageGradeByProfession(jB);
		System.out.println();
		
		
		
		//BONUS
		
		// print number of students between 20 and 30 and their average;
		
		schoolAverageByAge20_30(jB);
		System.out.println();
		
		// print number of students ages31 and above and their average;
		schoolAverageByAge31(jB);
		System.out.println();
		
		//print Average age of all students in school
		
		System.out.println("Average age of all students in school is: "+ getAverageAgeOfAllStudents(jB));
		System.out.println();
		
		
		
		//print number of teachers in Realist professions (math, Physics)
		
		System.out.println("number of teachers in Realist professions (math, Physics) is :"+ getNumberOfTeacherInMathAndPhysics(jB)); 
		System.out.println();

		// print number of teacher in sport and print number of teacher in literature
		
		printNumberOfTeacherInSports(jB);
		System.out.println();

		
		//print all students in sports team
		printSchoolSportsTeam(jB);

	}

	
	
	
	public static void fillSchool(School school) {
		int randProf;
		int randAge;
		
		for (int i = 0; i < school.getClassrooms().length; i++) {
			randAge = (int)((Math.random()*101)+20);
			randProf = (int)(Math.random()*6);			
			school.getClassrooms()[i] = new ClassRoom("class"+i, new Teacher(randAge, "teacher"+ tCounter, getProfessionByNum(randProf)), 15 );
			tCounter++;
			fillClassroom(school.getClassrooms()[i]);
		}
				
	}
	
	
	public static void fillClassroom(ClassRoom classroom) {
		for (int i = 0; i< classroom.getStudents().length; i++) {
			int randAge = (int)((Math.random()*101)+20);
			counter++;
			classroom.getStudents()[i] = new Student(randAge, "student" + counter, generateGrades(6));
		}
		
	}
	
	public static Grade[] generateGrades(int num) {
		Grade[] grades = new Grade[num];
		int randScore;
		for (int i = 0; i< num ;i++) {
			randScore = (int)((Math.random()*61)+40);
			grades[i] = new Grade(getProfessionByNum(i), randScore);
		}
		return grades;
	}
	
	public static ProfessionEnum getProfessionByNum(int num) {
			switch (num) {
				case 0:
					return 	ProfessionEnum.CHEMISTRY;
				case 1:
					return 	ProfessionEnum.GEOGRAPHY;
				case 2:
					return 	ProfessionEnum.LITERATURE;
				case 3:
					return 	ProfessionEnum.MATH;				
				case 4:
					return 	ProfessionEnum.SPORTS;				
				case 5:
					return 	ProfessionEnum.PHYSICS;	
				default:
					return null;
			}
	
	}
	
	public static double getSchoolAverageTotalGrade(School school) {
		double sum = 0;
		int counter = 0;
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						for (Grade grade : student.getGrades()) {
							if (grade !=null) {
								sum += grade.getScore();
								counter++;
							}
						}
					}
				}
			}
		}
		return  sum/counter;
	}
	
	public static void getClassAverageGrade(School school) {
		double sum;
		int counter;
		for (ClassRoom currClass : school.getClassrooms()) {
			sum = 0;
			counter = 0;
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						for (Grade grade : student.getGrades()) {
							if (grade !=null) {
								sum += grade.getScore();
								counter++;
							}
						}
					}
				}
			}
				System.out.println("average grade for "+ currClass.getName() +" is :"+  sum/counter);
		}
	}
	
	public static void getSchoolAverageGradeByProfession(School school) {
		double[] sums = new double[6];
		int[] counters = new int[6];
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						for (Grade grade : student.getGrades()) {
							if (grade !=null) {
								sums[grade.getProfession().ordinal()] += grade.getScore();
								counters[grade.getProfession().ordinal()]++;
							}
						}
					}
				}
			}
		}
		
		
		for (ProfessionEnum profession : ProfessionEnum.values()) {
			System.out.println("Average grade of school in "+ profession.name() +" is: " +sums[profession.ordinal()]/counters[profession.ordinal()]);
		}
	}
	
	public static void schoolAverageByAge20_30(School school) {
		double sum = 0;
		int counter = 0;
		int studentCounter = 0;
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						if (student.getAge() >=20 && student.getAge()<=30) {
							studentCounter++;
							for (Grade grade : student.getGrades()) {
								if (grade !=null) {
									sum += grade.getScore();
									counter++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("average of students between ages of 20 and 30 (included) is :"+ sum/counter );
		System.out.println("number of students between ages of 20 and 30 (included) is :"+ studentCounter );
	}
	
	public static void schoolAverageByAge31(School school) {
		double sum = 0;
		int counter = 0;
		int studentCounter = 0;
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						if (student.getAge() >=31) {
							studentCounter++;
							for (Grade grade : student.getGrades()) {
								if (grade !=null) {
									sum += grade.getScore();
									counter++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("average of students ages of 31 and above (included) is :"+ sum/counter );
		System.out.println("number of students ages of 31 and above (included) is :"+ studentCounter );
	}
	
	public static double getAverageAgeOfAllStudents(School school) {
		double sum = 0;
		int counter = 0;
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						sum += student.getAge();
						counter++;
					}
				}
			}
		}
		return  sum/counter;
	}
	
	
	public static int getNumberOfTeacherInMathAndPhysics(School school) {
		int teacherCounter = 0;
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				if (currClass.getTeacher().getTeacherProfession().equals(ProfessionEnum.MATH) || currClass.getTeacher().getTeacherProfession().equals(ProfessionEnum.PHYSICS)) {
					teacherCounter++;
				}
			}
		}
		return teacherCounter;
	}
	
	public static void printNumberOfTeacherInSports(School school) {
		int sportsCounter = 0;
		int literatureCounter = 0;
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				if (currClass.getTeacher().getTeacherProfession().equals(ProfessionEnum.SPORTS)) {
					sportsCounter++;
				}else if (currClass.getTeacher().getTeacherProfession().equals(ProfessionEnum.LITERATURE)) {
					literatureCounter++;
				}
				
			}
		}
		System.out.println("number of teachers in sports: "+ sportsCounter); 
		System.out.println("number of teachers in literature: "+ literatureCounter); 
	}
	
	public static void printSchoolSportsTeam(School school) {
		List<Student> students = new ArrayList<>();
		for (ClassRoom currClass : school.getClassrooms()) {
			if (currClass !=null) {
				for (Student student : currClass.getStudents()) {
					if (student != null) {
						for (Grade grade : student.getGrades()) {
							if (grade !=null) {
								if (grade.getProfession().equals(ProfessionEnum.SPORTS) && grade.getScore()>=90)
									students.add(student);
							}
						}
					}
				}
			}
		}
		System.out.println("Sports Team (students with sports grade above 90 iclude): ");
		System.out.println(students);
	}
	
	
}
