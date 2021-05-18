package orgs.capg.apps.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SBU {
	@Value("${sbu.sbuId}")
	private int sbuId;
	@Value("${sbu.sbuHead}")
	private String sbuHead;
	@Value("${sbu.sbuName}")
	private String sbuName;
	
	
	public SBU(int sbuId, String sbuHead, String sbuName) {
		
		this.sbuId = sbuId;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
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


