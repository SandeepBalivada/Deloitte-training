package one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="applicant")
public class Applicant {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="applicantid")
	private int applicantid;
	@Column(name="name",length=20)
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="city",length=20)
	private String city;
	//One to one relation mapping
	@OneToOne(mappedBy="applicant",cascade=CascadeType.ALL)
	private Passport passport;
	public int getApplicantid() {
		return applicantid;
	}
	public void setApplicantid(int applicantid) {
		this.applicantid = applicantid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
