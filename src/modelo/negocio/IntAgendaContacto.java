package modelo.negocio;

import modelo.beans.Contacto;

public interface IntAgendaContacto {
	
	boolean addContacto(Contacto contacto);
	Contacto borrarContacto(int posRelativa);
	boolean borrarContacto(Contacto contacto);
	void vaciarAgenda();
	void ordenarAgenda();
	void mostrarFoto(Contacto contacto);
	void listarContactos();
	boolean exportarAgenda(String nombreFichero);
	boolean importarrAgenda(String nombreFichero);

}
