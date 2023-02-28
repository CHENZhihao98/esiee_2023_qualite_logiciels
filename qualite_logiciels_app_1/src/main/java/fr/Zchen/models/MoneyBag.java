package fr.Zchen.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe : MoneyBag
 * <br/>Description : Classe des sacs de monnaies
 * <ul>
 *     <li>bag : Map<String, Money> - Doit être une map de monnaies</li>
 *     <li>add(Money m) : Money - Ajoute une monnaie au sac</li>
 *     <li>subb(Money m) : Money - Retire une monnaie du sac</li>
 * </ul>
 *
 * @author ldumay
 */
public class MoneyBag {

	private Map<String, Money> bag;
	public boolean hasCurrency(String nCurrency) {
		return bag.containsKey(nCurrency);
	}

	public MoneyBag() {
		bag = new HashMap<String, Money>();
	}

	public void add(int amount, Currency currency){
		if (hasCurrency(String.valueOf(currency))){
			bag.get(String.valueOf(currency)).add(amount,currency);
		}
		else{
			bag.put(String.valueOf(currency),new Money(amount,currency));
		}
	}

	public void add(Money m){
		add(m.amount(), m.currency());
	}
	public void add(MoneyBag bag){
		for (Map.Entry<String, Money> money : bag.getBag().entrySet()) {
			add(money.getValue());
		}
	}

	public Map<String, Money> getBag() {
		return bag;
	}


	public int getTheCurrency(String currency){
		Money m = bag.get(currency);

		if (m==null){
			return 0;
		}
		return m.amount();
	}


}
