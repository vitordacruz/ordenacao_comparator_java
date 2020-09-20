package teste.ordenacao.comparator;

import java.util.Comparator;

import teste.ordenacao.model.Equipamento;

public class DataEquipamentoComparator implements Comparator<Equipamento> {

	@Override
	public int compare(Equipamento equipamento1, Equipamento equipamento2) {
		if (equipamento1.getData() == null || equipamento2.getData() == null) {
			return 1;
		} else {
			return equipamento1.getData().compareTo(equipamento2.getData());
		}
	}

}
