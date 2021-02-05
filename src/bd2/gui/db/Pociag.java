package bd2.gui.db;
/**
 * 
 */

import java.util.List;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Tymoteusz
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Pociag {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private long id;

	/** 
	* @return the id
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public long getId() {
		// begin-user-code
		return id;
		// end-user-code
	}

	/** 
	* @param id the id to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setId(long id) {
		// begin-user-code
		this.id = id;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Object przebieg;

	/** 
	* @return the przebieg
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Object getPrzebieg() {
		// begin-user-code
		return przebieg;
		// end-user-code
	}

	/** 
	* @param przebieg the przebieg to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPrzebieg(Object przebieg) {
		// begin-user-code
		this.przebieg = przebieg;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String nazwa;

	/** 
	* @return the nazwa
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getNazwa() {
		// begin-user-code
		return nazwa;
		// end-user-code
	}

	/** 
	* @param nazwa the nazwa to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNazwa(String nazwa) {
		// begin-user-code
		this.nazwa = nazwa;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Przejazd> przejazdy;

	/** 
	* @return the przejazdy
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Przejazd> getPrzejazdy() {
		// begin-user-code
		return przejazdy;
		// end-user-code
	}

	/** 
	* @param przejazdy the przejazdy to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPrzejazdy(List<Przejazd> przejazdy) {
		// begin-user-code
		this.przejazdy = przejazdy;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Wagon> wagony;

	/** 
	* @return the wagony
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Wagon> getWagony() {
		// begin-user-code
		return wagony;
		// end-user-code
	}

	/** 
	* @param wagony the wagony to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setWagony(List<Wagon> wagony) {
		// begin-user-code
		this.wagony = wagony;
		// end-user-code
	}
}