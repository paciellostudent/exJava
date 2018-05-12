package Ext1Ex8;

import java.util.ArrayList;
import java.util.List;

public class Cartesiano {
	List<Integer> xy = new ArrayList<Integer>();
	
	private void setPx(int px) {
		this.xy.add(px);
	}
	
	private void setPy(int py) {
		this.xy.add(py);
	}
	
	public void setPonto(int x,int y) {
		setPx(x);
		setPy(y);
	}
	
	public List<Integer> getPonto(){
		return xy;
	}
}
