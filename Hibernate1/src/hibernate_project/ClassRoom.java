package hibernate_project;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//This is The HIBERNATE_PROJECT, Connecting through GITHUB
@Entity
public class ClassRoom 
{
	@Id
	@GeneratedValue
	int id;
	String namee;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



}
