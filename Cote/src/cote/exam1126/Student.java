package cote.exam1126;

public class Student {
	public String studentId;
	public String name;
	public String email;
	
	public Student(String studentId, String name, String eamil) {
		this.studentId = studentId;
		this.name = name;
		this.email= email;
		
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Student) { 
			Student s = (Student) object;
			if(name.equals(s.name) && studentId.equals(s.studentId)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String str = String.format("StudentId: %s name:%s email:%s", studentId, name, email);
		return super.toString() + " (" + str + ")";
	}

}
