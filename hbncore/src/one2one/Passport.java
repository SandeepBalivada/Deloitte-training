package one2one;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="passport")
public class Passport {
	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen",strategy="foreign",parameters =@Parameter(name="property",value="applicant"))
	@Column(name="passportid")
	private int passportId;
	@Column(name="passportNumber",length=15)
	private String passportNumber;
	@Column(name="issueDate")
	private Date issueDate;
	@Column(name="expiryDate")
	private Date expiryDate;
	//One to one relation
	@OneToOne
	@PrimaryKeyJoinColumn
	private Applicant applicant;
	public int getPassportId() {
		return passportId;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	

}
