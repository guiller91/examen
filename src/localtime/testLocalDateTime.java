package localtime;

import java.time.LocalDateTime;

public class testLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime fechaHora = LocalDateTime.now();
		
		fechaHora=fechaHora.plusDays(4);
		
		System.out.println(fechaHora);
		
		

	}

}
