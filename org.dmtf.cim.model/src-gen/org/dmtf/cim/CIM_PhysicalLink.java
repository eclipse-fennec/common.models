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
 * A representation of the model object '<em><b>CIM Physical Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PhysicalLink class represents the cabling of PhysicalElements together. For example, serial or Ethernet cables would be subclasses (if additional properties or associations are defined) or instances of PhysicalLink. In many cases, the numerous physical cables within a PhysicalPackage or Network will not be modeled. However, where these cables or Links are critical components, or are tagged assets of the company, these objects can be instantiated using this class or one of its descendent classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalLink#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalLink#getLength <em>Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalLink#getWired <em>Wired</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalLink#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalLink()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Physical::Link' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalLink extends CIM_PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length of the PhysicalLink in feet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Double)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalLink_MaxLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real64' Units='Feet' PUnit='foot'"
	 * @generated
	 */
	Double getMaxLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalLink#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current length of the PhysicalLink in feet. For some connections, especially wireless technologies, this property may not be applicable and should be left uninitialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(Double)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalLink_Length()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real64' Units='Feet' PUnit='foot'"
	 * @generated
	 */
	Double getLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalLink#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Double value);

	/**
	 * Returns the value of the '<em><b>Wired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the PhysicalLink is an actual cable (TRUE) or a wireless connection (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wired</em>' attribute.
	 * @see #setWired(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalLink_Wired()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getWired();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalLink#getWired <em>Wired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wired</em>' attribute.
	 * @see #getWired()
	 * @generated
	 */
	void setWired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MediaType property defines the particular type of Media through which transmission signals pass. Common network media include twisted-pair (value=11 or 12), coaxial (7, 8 or 9) and fiber-optic cable (10).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalLink_MediaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\"]' Values='[\"Unknown\",\"Other\",\"Cat1\",\"Cat2\",\"Cat3\",\"Cat4\",\"Cat5\",\"50-ohm Coaxial\",\"75-ohm Coaxial\",\"100-ohm Coaxial\",\"Fiber-optic\",\"UTP\",\"STP\",\"Ribbon Cable\",\"Twinaxial\",\"Optical 9um\",\"Optical 50um\",\"Optical 62.5um\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus Port Extensions|001.4\"]'"
	 * @generated
	 */
	Integer getMediaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalLink#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(Integer value);

} // CIM_PhysicalLink
