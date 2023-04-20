package exercicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class treinandoData {

	public static void main(String[] args) {
		
		LocalDate data1 = LocalDate.now();
		LocalDateTime data2 = LocalDateTime.now();
		Instant data3 = Instant.now();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
	

}
