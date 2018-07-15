package lagersystemPackage;

import java.util.ArrayList;
import java.util.List;

public class Lager {

	private String lagerType;
	private String name;
	private List<LagerItem> liste;
	
	public Lager() {
		liste = new ArrayList<LagerItem>();
	}
	
	public List<LagerItem> get(ItemFilter filter)
	{		 
		return liste;
	}
		
	public void fuegeItemHinzu(LagerItem item) 
	{
		liste.add(item);
	}
	
	
	public List<Rezept> getAvailableRezepteListe()
	{
		List<Rezept> listeRezepte = new ArrayList<Rezept>();				
		return listeRezepte;
	}
		
	public void deleteLagerItem(LagerItem lagerItem)
	{
		liste.remove(lagerItem);
	}
	
	public String getLagerType() {
		return lagerType;
	}
	public void setLagerType(String lagerType) {
		this.lagerType = lagerType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
