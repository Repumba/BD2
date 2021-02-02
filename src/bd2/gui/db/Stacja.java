
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
public class Stacja {
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
	private String miejscowosc;

	/** 
	* @return the miejscowosc
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getMiejscowosc() {
		// begin-user-code
		return miejscowosc;
		// end-user-code
	}

	/** 
	* @param miejscowosc the miejscowosc to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setMiejscowosc(String miejscowosc) {
		// begin-user-code
		this.miejscowosc = miejscowosc;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Kasa> kasy;

	/** 
	* @return the kasy
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Kasa> getKasy() {
		// begin-user-code
		return kasy;
		// end-user-code
	}

	/** 
	* @param kasy the kasy to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setKasy(List<Kasa> kasy) {
		// begin-user-code
		this.kasy = kasy;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Przystanek> przystanki;

	/** 
	* @return the przystanki
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Przystanek> getPrzystanki() {
		// begin-user-code
		return przystanki;
		// end-user-code
	}

	/** 
	* @param przystanki the przystanki to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPrzystanki(List<Przystanek> przystanki) {
		// begin-user-code
		this.przystanki = przystanki;
		// end-user-code
	}
}