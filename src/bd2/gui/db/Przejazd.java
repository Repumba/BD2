
/**
 * 
 */

import java.util.GregorianCalendar;
import java.util.List;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Tymoteusz
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Przejazd {
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
	private GregorianCalendar data;

	/** 
	* @return the data
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public GregorianCalendar getData() {
		// begin-user-code
		return data;
		// end-user-code
	}

	/** 
	* @param data the data to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setData(GregorianCalendar data) {
		// begin-user-code
		this.data = data;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Stacja stacjaPoczatkowa;

	/** 
	* @return the stacjaPoczatkowa
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Stacja getStacjaPoczatkowa() {
		// begin-user-code
		return stacjaPoczatkowa;
		// end-user-code
	}

	/** 
	* @param stacjaPoczatkowa the stacjaPoczatkowa to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStacjaPoczatkowa(Stacja stacjaPoczatkowa) {
		// begin-user-code
		this.stacjaPoczatkowa = stacjaPoczatkowa;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Stacja stacjaKoncowa;

	/** 
	* @return the stacjaKoncowa
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Stacja getStacjaKoncowa() {
		// begin-user-code
		return stacjaKoncowa;
		// end-user-code
	}

	/** 
	* @param stacjaKoncowa the stacjaKoncowa to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStacjaKoncowa(Stacja stacjaKoncowa) {
		// begin-user-code
		this.stacjaKoncowa = stacjaKoncowa;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private RodzajPrzejazdu rodzajPrzejazdu;

	/** 
	* @return the rodzajPrzejazdu
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public RodzajPrzejazdu getRodzajPrzejazdu() {
		// begin-user-code
		return rodzajPrzejazdu;
		// end-user-code
	}

	/** 
	* @param rodzajPrzejazdu the rodzajPrzejazdu to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setRodzajPrzejazdu(RodzajPrzejazdu rodzajPrzejazdu) {
		// begin-user-code
		this.rodzajPrzejazdu = rodzajPrzejazdu;
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

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Pociag pociag;

	/** 
	* @return the pociag
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Pociag getPociag() {
		// begin-user-code
		return pociag;
		// end-user-code
	}

	/** 
	* @param pociag the pociag to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPociag(Pociag pociag) {
		// begin-user-code
		this.pociag = pociag;
		// end-user-code
	}
}