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
 * A representation of the model object '<em><b>CIM IP Subinterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration properties for an Ethernet switch or router subinterface. A IPSubinterface allows the router to route traffic on a single port as if it were part of multiple separate IP subnets. The parent Interface is configured as a trunk port and the connection is is divided by encapsulating each frame with VLAN information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPSubinterface#getEncapsulationType <em>Encapsulation Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSubinterface#getParentInterface <em>Parent Interface</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSubinterface#getEncapsulationValue <em>Encapsulation Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSubinterface#getOtherEncapsulationType <em>Other Encapsulation Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPSubinterface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Network' override.ElementName='string' override.ElementName.Description='The Interface name for the IPSubinterface. This property allows each instance to define a user-friendly name in addition to the Name property which is a key properties in this class. Element Name may be a copy of the Name property but the class provider may add additional indentifing information to the Name property to assure it is a unique instance when forming the key.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPSubinterface extends CIM_IPProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Encapsulation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1- Other, If other there should be a description or type set in the OtherEncapsulationType property.
	 * 2- Dot1Q Configures IEEE 802.1Q VLAN encapsulation on the IPSubinterface (VLANId), if selected the the EncapsulationValue property should be set to a value between 2 and 4093.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encapsulation Type</em>' attribute.
	 * @see #setEncapsulationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubinterface_EncapsulationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32767..65535\"]' Values='[\"Unknown\",\"Other\",\"Dot1Q\",\"DMTF reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IPSubinterface.EncapsulationValue\"]'"
	 * @generated
	 */
	Integer getEncapsulationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubinterface#getEncapsulationType <em>Encapsulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulation Type</em>' attribute.
	 * @see #getEncapsulationType()
	 * @generated
	 */
	void setEncapsulationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Parent Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains a reference to the port (instance of CIM_EthernetPort) that this IPSubinterface is associated with. Each non-null value of the ParentInterfaceID property shall be formated as a URI per RFC3986 and should be a WBEM URI (DSP0207).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Interface</em>' attribute.
	 * @see #setParentInterface(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubinterface_ParentInterface()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Reference='CIM_EthernetPort'"
	 * @generated
	 */
	String getParentInterface();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubinterface#getParentInterface <em>Parent Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Interface</em>' attribute.
	 * @see #getParentInterface()
	 * @generated
	 */
	void setParentInterface(String value);

	/**
	 * Returns the value of the '<em><b>Encapsulation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depending on the value of EncapsulationType property this EncapsulationValue should contain the configuration value for the encapsulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encapsulation Value</em>' attribute.
	 * @see #setEncapsulationValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubinterface_EncapsulationValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPSubinterface.EncapsulationType\"]'"
	 * @generated
	 */
	String getEncapsulationValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubinterface#getEncapsulationValue <em>Encapsulation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulation Value</em>' attribute.
	 * @see #getEncapsulationValue()
	 * @generated
	 */
	void setEncapsulationValue(String value);

	/**
	 * Returns the value of the '<em><b>Other Encapsulation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the encapsulation type when a well defined value is not available and EncapsulationType has the value "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encapsulation Type</em>' attribute.
	 * @see #setOtherEncapsulationType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubinterface_OtherEncapsulationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPSubinterface.EncapsulationType\"]'"
	 * @generated
	 */
	String getOtherEncapsulationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubinterface#getOtherEncapsulationType <em>Other Encapsulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Encapsulation Type</em>' attribute.
	 * @see #getOtherEncapsulationType()
	 * @generated
	 */
	void setOtherEncapsulationType(String value);

} // CIM_IPSubinterface
