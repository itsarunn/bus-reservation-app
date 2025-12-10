package BusRes;

public class Bus {
	private int busno;
	private boolean ac;
	private int buscapacity;
	
	public Bus(int busno, boolean ac, int busCapacity) {
		this.busno = busno;
		this.ac = ac;
		this.buscapacity = busCapacity;
	}
	
	public int getbusno() {
		return busno;
	}
	public boolean getac() {
		return ac;
	}
	public void setac(boolean ac) {
		this.ac = ac;
	}
	
	public int getbuscapacity() {
		return buscapacity;
	}
	public void setbuscapacity(int buscapacity) {
		this.buscapacity=buscapacity;
	}
	
	
	
}
