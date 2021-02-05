package bd2.gui.db;
/**
 * 
 */

import java.util.GregorianCalendar;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Tymoteusz
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class BiletOkresowy extends Bilet {
	public BiletOkresowy(GregorianCalendar waznyOd, GregorianCalendar waznyDo, String stacjaPoczatkowa, String stacjaKoncowa) {
		this.waznyOd = waznyOd;
		this.waznyDo = waznyDo;
		this.stacjaPoczatkowa = stacjaPoczatkowa;
		this.stacjaKoncowa = stacjaKoncowa;
	}

	/**
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private GregorianCalendar waznyOd;

	/** 
	* @return the waznyOd
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public GregorianCalendar getWaznyOd() {
		// begin-user-code
		return waznyOd;
		// end-user-code
	}

	/** 
	* @param waznyOd the waznyOd to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setWaznyOd(GregorianCalendar waznyOd) {
		// begin-user-code
		this.waznyOd = waznyOd;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private GregorianCalendar waznyDo;

	/** 
	* @return the waznyDo
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public GregorianCalendar getWaznyDo() {
		// begin-user-code
		return waznyDo;
		// end-user-code
	}

	/** 
	* @param waznyDo the waznyDo to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setWaznyDo(GregorianCalendar waznyDo) {
		// begin-user-code
		this.waznyDo = waznyDo;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String stacjaPoczatkowa;

	/** 
	* @return the stacjaPoczatkowa
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getStacjaPoczatkowa() {
		// begin-user-code
		return stacjaPoczatkowa;
		// end-user-code
	}

	/** 
	* @param stacjaPoczatkowa the stacjaPoczatkowa to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStacjaPoczatkowa(String stacjaPoczatkowa) {
		// begin-user-code
		this.stacjaPoczatkowa = stacjaPoczatkowa;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String stacjaKoncowa;

	/** 
	* @return the stacjaKoncowa
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getStacjaKoncowa() {
		// begin-user-code
		return stacjaKoncowa;
		// end-user-code
	}

	/** 
	* @param stacjaKoncowa the stacjaKoncowa to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStacjaKoncowa(String stacjaKoncowa) {
		// begin-user-code
		this.stacjaKoncowa = stacjaKoncowa;
		// end-user-code
	}
}