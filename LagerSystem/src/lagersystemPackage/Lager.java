package lagersystemPackage;

import java.util.ArrayList;
import java.util.List;

public class Lager {

	private String lagerType;
	private String name;
	
	
	
	
	public List<LagerItem> getList(ItemFilter filter){
		List<LagerItem> liste = new ArrayList<LagerItem>();
		return liste;
	}
	
	public List<Rezept> getAvailableRezeoteListe(){
		List<Rezept> listeRezepte = new ArrayList<Rezept>();
				
		return listeRezepte;
	}
	
	public void saveNewLagerItem(LagerItem lagerItem){
		
	}
	
	public void deleteLagerItem(LagerItem lagerItem){
		
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
