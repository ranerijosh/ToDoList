package todolist;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "itemlist")
public class ListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "itemID")
    private int itemID;
	
    @Column(name = "itemDesc")
    String itemDesc;
    
	public ListItem() {
		super();
		this.itemDesc = "";
		this.itemID = 0;
	}

	public ListItem(String itemDesc) {
		super();
		this.itemDesc = itemDesc;
		this.itemID = itemID;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}
	
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public void setItemNumber(int itemNumber) {
		this.itemID = itemNumber;
	}
	
	public int getItemNumber() {
		return itemID;
	}
}
