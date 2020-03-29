package interfaceOffer;

class Student extends Person {
	private int id; // 학번

	public Student(String name, int id) {
		super(name);

		this.id = id;
	}

	@Override
	public int compareTo(Object a) {
		Student s = (Student) a;
		if (id > s.id) {
			return 1;
		}
		else if (id < s.id) {
			return -1;
		} else {
			return 0;
		}
	}
	
	// 여기에 코드를 추가하시오.

} 