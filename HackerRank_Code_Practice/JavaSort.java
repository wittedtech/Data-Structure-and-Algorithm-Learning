package HackerRank_Code_Practice;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

// For Comparator Supported by Java 7
class SortingComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getCgpa() == s2.getCgpa()){
            if(s1.getFname().compareTo(s2.getFname()) == 0){
                if(s1.getId() == s2.getId()){
                    return 0;
                }else if(s2.getId() > s1.getId()){
                    return 1;
                }else{
                    return -1;
                }
            }else if(s1.getFname().compareTo(s2.getFname()) > 0){
                return 1;
            }else{
                return -1;
            }
        }else if(s2.getCgpa() > s1.getCgpa()){
            return 1;
        }else{
            return -1;
        }
    }

}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        // Works IN Java 8
        // studentList.sort(Comparator.comparing(Student::getCgpa, (cgpa1,cgpa2) -> {
        //     return cgpa2.compareTo(cgpa1);
        // })
        // .thenComparing(Student::getFname)
        // .thenComparing(Student:: getId)
        // );

        // Works IN Java 7
        Collections.sort(studentList,new SortingComparator());
        

      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}