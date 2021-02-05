package bd2.gui.db;
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
public class Zamowienie {
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
	private float kwota;

	/** 
	* @return the kwota
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getKwota() {
		// begin-user-code
		return kwota;
		// end-user-code
	}

	/** 
	* @param kwota the kwota to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setKwota(float kwota) {
		// begin-user-code
		this.kwota = kwota;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private StanZamowienia stanZamowienia;

	/** 
	* @return the stanZamowienia
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public StanZamowienia getStanZamowienia() {
		// begin-user-code
		return stanZamowienia;
		// end-user-code
	}

	/** 
	* @param stanZamowienia the stanZamowienia to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStanZamowienia(StanZamowienia stanZamowienia) {
		// begin-user-code
		this.stanZamowienia = stanZamowienia;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private RodzajPlatnosci rodzajPlatnosci;

	/** 
	* @return the rodzajPlatnosci
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public RodzajPlatnosci getRodzajPlatnosci() {
		// begin-user-code
		return rodzajPlatnosci;
		// end-user-code
	}

	/** 
	* @param rodzajPlatnosci the rodzajPlatnosci to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setRodzajPlatnosci(RodzajPlatnosci rodzajPlatnosci) {
		// begin-user-code
		this.rodzajPlatnosci = rodzajPlatnosci;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Osoba zamawiajacy;

	/** 
	* @return the zamawiajacy
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Osoba getZamawiajacy() {
		// begin-user-code
		return zamawiajacy;
		// end-user-code
	}

	/** 
	* @param zamawiajacy the zamawiajacy to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setZamawiajacy(Osoba zamawiajacy) {
		// begin-user-code
		this.zamawiajacy = zamawiajacy;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Bilet> bilet;

	/** 
	* @return the bilet
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Bilet> getBilet() {
		// begin-user-code
		return bilet;
		// end-user-code
	}

	/** 
	* @param bilet the bilet to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setBilet(List<Bilet> bilet) {
		// begin-user-code
		this.bilet = bilet;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private PosrednikPlatnosci posrednikPlatnosci;

	/** 
	* @return the posrednikPlatnosci
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public PosrednikPlatnosci getPosrednikPlatnosci() {
		// begin-user-code
		return posrednikPlatnosci;
		// end-user-code
	}

	/** 
	* @param posrednikPlatnosci the posrednikPlatnosci to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPosrednikPlatnosci(PosrednikPlatnosci posrednikPlatnosci) {
		// begin-user-code
		this.posrednikPlatnosci = posrednikPlatnosci;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Rezerwacja rezerwacja;

	/** 
	* @return the rezerwacja
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Rezerwacja getRezerwacja() {
		// begin-user-code
		return rezerwacja;
		// end-user-code
	}

	/** 
	* @param rezerwacja the rezerwacja to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setRezerwacja(Rezerwacja rezerwacja) {
		// begin-user-code
		this.rezerwacja = rezerwacja;
		// end-user-code
	}
}