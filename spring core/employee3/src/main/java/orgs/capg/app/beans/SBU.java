package orgs.capg.app.beans;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SBU {
	@Value("${sbu.sbuId}")
	private int sbuId;
	@Value("${sbu.sbuHead}")
	private String sbuHead;
	@Value("${sbu.sbuName}")
	private String sbuName;
	private ArrayList<Employee3>empList;
	
	
	public ArrayList<Employee3> getEmpList() {
		return empList;
	}
	public void setEmpList(ArrayList<Employee3> empList) {
		this.empList = empList;
	}
	public SBU(int sbuId, String sbuHead, String sbuName) {
		
		this.sbuId = sbuId;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
	}
	public SBU() {
		// TODO Auto-generated constructor stub
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
}