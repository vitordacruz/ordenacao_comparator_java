package teste.ordenacao.comparator;

import java.util.Comparator;

import teste.ordenacao.model.Equipamento;

public class NomeEquipamentoComparator implements Comparator<Equipamento> {

	@Override
	public int compare(Equipamento equipamento1, Equipamento equipamento2) {		
		return equipamento1.getNome().compareToIgnoreCase(equipamento2.getNome());
	}

}
