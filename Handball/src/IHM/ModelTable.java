package IHM;

import java.util.*;

import javax.swing.table.AbstractTableModel;

import main.Joueur;

public class ModelTable extends AbstractTableModel {

	private ArrayList<Joueur> donnees = new ArrayList<Joueur>();
	private final String[] titres = {"Numéro", "Nom", "Nombre Buts", "Nombres 2mins", "Nombre Jaune"};
	
	public ModelTable(){
		super();
		
	}
	
	
	

	public int getColumnCount() {
		return this.titres.length;
	}

	
	public int getRowCount() {
		return this.donnees.size();
	}

	public String getColumnName(int columnIndex) {
        return this.titres[columnIndex];
    }
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		 switch(columnIndex){
         case 0:
             return this.donnees.get(rowIndex).getNumero();
         case 1:
             return this.donnees.get(rowIndex).getNom();
         case 2:
             return this.donnees.get(rowIndex).nbButTotal();
         case 3:
             return this.donnees.get(rowIndex).getFautes();
         case 4:
             return this.donnees.get(rowIndex).nbJaunes();
         default:
             return null; //Ne devrait jamais arriver
     }
 }
	
    public void addJoueur(Joueur j) {
        donnees.add(j);
 
        fireTableRowsInserted(donnees.size() -1, donnees.size() -1);
    }
 
    public void removeJoueur(int rowIndex) {
        this.donnees.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

}
