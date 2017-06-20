package Util;

public class Ayudante {
	
	public static int conversor (String valor){
		
		int valorConvertido=0;
		try{
			valorConvertido= Integer.parseInt(valor);
		}catch (NumberFormatException e){
			System.out.println(e.getMessage());
		}
		
		return valorConvertido;
		
	}
}
	
	