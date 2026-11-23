/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Rack is a PhysicalFrame that represents an enclosure in which Chassis are placed. Typically a Rack is nothing more than the enclosure, and all the functioning componentry is packaged in the Chassis, loaded in the Rack.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Rack#getTypeOfRack <em>Type Of Rack</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Rack#getCountryDesignation <em>Country Designation</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Rack()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.21.0' UMLPackagePath='CIM::Physical::Package' override.Height='real32' override.Height.Description='The height of the PhysicalPackage in \'U\'s. A \'U\' is a standard unit of measure for the height of a Rack or rack-mountable component. It is equal to 1.75 inches or 4.445 cm.' override.Height.Units='Us' override.Height.PUnit='rack unit' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_Rack extends CIM_PhysicalFrame {
	/**
	 * Returns the value of the '<em><b>Type Of Rack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of Rack. Information such as "Telco" rack (value=2) or standard 19 inch rack (1) can be specified. The country for which the Rack is manufactured is defined in the the Country Designation property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Rack</em>' attribute.
	 * @see #setTypeOfRack(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Rack_TypeOfRack()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Standard 19 Inch\",\"Telco\",\"Equipment Shelf\",\"Non-Standard\"]' ModelCorrespondence='[\"CIM_Rack.CountryDesignation\"]'"
	 * @generated
	 */
	Integer getTypeOfRack();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Rack#getTypeOfRack <em>Type Of Rack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Rack</em>' attribute.
	 * @see #getTypeOfRack()
	 * @generated
	 */
	void setTypeOfRack(Integer value);

	/**
	 * Returns the value of the '<em><b>Country Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designation of the country for which the Rack is designed. Country code strings are as defined by ISO/IEC 3166. The rack type is specified in the TypeOf Rack property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Designation</em>' attribute.
	 * @see #setCountryDesignation(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Rack_CountryDesignation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Rack.TypeOfRack\"]'"
	 * @generated
	 */
	String getCountryDesignation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Rack#getCountryDesignation <em>Country Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Designation</em>' attribute.
	 * @see #getCountryDesignation()
	 * @generated
	 */
	void setCountryDesignation(String value);

} // CIM_Rack
