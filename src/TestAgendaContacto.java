import modelo.beans.CPersonal;
import modelo.beans.CProfesional;
import modelo.negocio.AgendaContactos;

public class TestAgendaContacto {

	public static void main(String[] args) {
		
		AgendaContactos miAgenda = new AgendaContactos();
		
		miAgenda.addContacto(new CPersonal("guillermo","611611611","983402555"));
		miAgenda.addContacto(new CPersonal("eva","111611611","92302555"));
		miAgenda.addContacto(new CPersonal("aana","333611611","444402555"));
		miAgenda.addContacto(new CPersonal("lucia","222611611","553502555"));
		miAgenda.addContacto(new CPersonal("dani","777611611","333402555"));
		miAgenda.addContacto(new CProfesional("tomas", "6666666", "2222222", "asdads@aasd.com"));
		miAgenda.addContacto(new CProfesional("rober", "44446666", "113222", "aaewqeqds@aiud.com"));
		
		
		miAgenda.ordenarAgenda();
		miAgenda.listarContactos();

	}

}
