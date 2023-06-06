package SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Company {
	private int gst;
	private String name;
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
