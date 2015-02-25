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

	public Student get(int num){
		return students[num];
	}

	public int size(){
		return this.last;
	}

}


abstract class Teacher{
    protected StudentList studentList;

    public abstract void createStudentList();
    public abstract void callStudents();
}


class MyTeacher extends Teacher{
	private StudentList studentList;


	public MyTeacher() {
		// TODO 自動生成されたコンストラクター・スタブ
		studentList = new StudentList(5);
	}

	@Override
	public void createStudentList() {
		// TODO 自動生成されたメソッド・スタブ
		studentList.add(new Student("赤井亮太", 1));
		studentList.add(new Student("赤羽里美", 0));
		studentList.add(new Student("岡田美央", 0));
		studentList.add(new Student("西森俊介", 1));
		studentList.add(new Student("中ノ森玲奈", 0));
	}

	@Override
	public void callStudents() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0; i<studentList.size(); i++){
			System.out.println("名前:" + studentList.get(i).getName());
		}
	}

}


interface Aggregate{
	public Iterator iterator();
}

interface Iterator{
	public boolean hasNext();
	public Object next();
}



















