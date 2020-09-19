package teste.ordenacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import teste.ordenacao.comparator.DataEquipamentoComparator;
import teste.ordenacao.comparator.NomeEquipamentoComparator;
import teste.ordenacao.model.Equipamento;
import teste.ordenacao.util.Util;

public class Main {

	public static void main(String[] args) {
		
		List<Equipamento> lista = geraEquipamentos();
		
		System.out.println("===============================");
		System.out.println(" Lista desorganizada");
		System.out.println("-------------------------------");		
		lista.stream().forEach((equipamento)->{System.out.println(equipamento);});
		System.out.println("===============================");
		System.out.println(" Lista organizada");
		System.out.println("-------------------------------");
		lista.sort(new NomeEquipamentoComparator().thenComparing(new DataEquipamentoComparator().reversed()));
		
		lista.stream().forEach((equipamento)->{System.out.println(equipamento);});
		
		System.out.println("===============================");

	}
	
	public static List<Equipamento> geraEquipamentos() {
		List<Equipamento> resultado = new ArrayList<>();
		
		LocalDateTime data1 = LocalDateTime.parse("10/08/2020 10:00", Util.getDateTimeFormate());
		LocalDateTime data2 = LocalDateTime.parse("10/08/2020 10:30", Util.getDateTimeFormate());
		LocalDateTime data3 = LocalDateTime.parse("10/08/2020 11:00", Util.getDateTimeFormate());
		LocalDateTime data4 = LocalDateTime.parse("10/08/2020 11:30", Util.getDateTimeFormate());
		
		
		Equipamento ep1 = new Equipamento("EP01", data1);
		Equipamento ep2 = new Equipamento("EP02", data1);
		Equipamento ep3 = new Equipamento("EP02", data2);
		Equipamento ep4 = new Equipamento("EP03", data3);
		Equipamento ep5 = new Equipamento("EP03", data2);
		Equipamento ep6 = new Equipamento("EP02", data3);
		Equipamento ep7 = new Equipamento("EP01", data3);
		Equipamento ep8 = new Equipamento("EP01", data2);
		Equipamento ep9 = new Equipamento("EP02", data4);
		
		resultado.add(ep1);
		resultado.add(ep2);
		resultado.add(ep3);
		resultado.add(ep4);
		resultado.add(ep5);
		resultado.add(ep6);
		resultado.add(ep7);
		resultado.add(ep8);
		resultado.add(ep9);
		
		return resultado;
	}
	

}
