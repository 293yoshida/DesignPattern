import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class IteratorPattern {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory
			.getLogger(IteratorPattern.class);






}


class Student{
	private String name = "";
	private int sex = 0;

	public Student(String name, int sex) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.sex  = sex;
	}

	public String getName(){
		return this.name;
	}

	public int getSex(){
		return this.sex;
	}
}

class StudentList{
	private Student[] students;
	private int last = 0;

	public StudentList() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public StudentList(int studentCount) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.students = new Student[studentCount];
	}

	public void add(Student student){
		students[last] = student;
		last++;
	}

	public int size(){
		return this.last;
	}

}