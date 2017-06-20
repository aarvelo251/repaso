import Controlador.Logica;
import Modelo.Persona;
import Util.Ayudante;
import vista.Pantallas;

public class Aplicacion {
	public static void main(String[] args) {
	 Pantallas vista = new Pantallas();
	 
	 Logica controlador = new Logica();
	 
	 int cantidadPersonas= Ayudante.conversor(vista.IngresarValor("ingrese la cantidad de personas"));
		
	 controlador.inicializarPersonas(cantidadPersonas);
	 
	 for (int i=0; i <cantidadPersonas; i++){
		 controlador.IngresarPersona(i,vista.IngresarValor("Coloque su nombre"));
		 
	 }
	 
	 for (int x=0; x<cantidadPersonas; x++){
		 
		 Persona ekis = controlador.traerPersona(x);
		 vista.mostrarMensaje(ekis.getNombre());
		 
	 }
	 
	}
	 
	}


