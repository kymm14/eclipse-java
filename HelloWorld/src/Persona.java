
public abstract class Persona {
	protected int id;
	protected int edad;
	protected int telefono;
	
	public void mostrarInfo() {
		
	}
	public abstract void mostrarID();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
