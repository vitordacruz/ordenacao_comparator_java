package teste.ordenacao.comparator;

import java.util.Comparator;

import teste.ordenacao.model.Equipamento;

public class DataEquipamentoComparator implements Comparator<Equipamento> {

	@Override
	public int compare(Equipamento data1, Equipamento data2) {
		return data1.getData().compareTo(data2.getData());
	}

}
