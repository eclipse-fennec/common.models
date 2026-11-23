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
 * A representation of the model object '<em><b>CIM LAN Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of LAN Endpoints of a particular type that are able to intercommunicate directly without the assistance of bridging or routing services. 
 * 
 * Since this class' superclass (LogicalNetwork) has been deprecated (in order to define more consistent 'collection' semantics), this class is also deprecated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LANSegment#getLANID <em>LANID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANSegment#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANSegment#getOtherLANType <em>Other LAN Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LANSegment()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_LANConnectivitySegment\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_LANSegment extends CIM_LogicalNetwork {
	/**
	 * Returns the value of the '<em><b>LANID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label or identifier for the LAN Segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LANID</em>' attribute.
	 * @see #setLANID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANSegment_LANID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_LANConnectivitySegment.LANID\"]' MaxLen='64' ModelCorrespondence='[\"CIM_LANEndpoint.LANID\"]'"
	 * @generated
	 */
	String getLANID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANSegment#getLANID <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANID</em>' attribute.
	 * @see #getLANID()
	 * @generated
	 */
	void setLANID(String value);

	/**
	 * Returns the value of the '<em><b>LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the kind of technology used on the LAN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LAN Type</em>' attribute.
	 * @see #setLANType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANSegment_LANType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_LANConnectivitySegment.ConnectivityType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Ethernet\",\"TokenRing\",\"FDDI\"]' ModelCorrespondence='[\"CIM_LANEndpoint.LANType\"]'"
	 * @generated
	 */
	Integer getLANType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANSegment#getLANType <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN Type</em>' attribute.
	 * @see #getLANType()
	 * @generated
	 */
	void setLANType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of technology used on the LAN when the value of the LANType property of this class (or any of its subclasses) is set to 1 (i.e., "Other"). The format of the string inserted in this property should be similar in format to the values defined for the LANType property. This property should be set to NULL when the LANType property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other LAN Type</em>' attribute.
	 * @see #setOtherLANType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANSegment_OtherLANType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_LANConnectivitySegment.OtherTypeDescription\"]' MaxLen='64' ModelCorrespondence='[\"CIM_LANSegment.LANType\"]'"
	 * @generated
	 */
	String getOtherLANType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANSegment#getOtherLANType <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other LAN Type</em>' attribute.
	 * @see #getOtherLANType()
	 * @generated
	 */
	void setOtherLANType(String value);

} // CIM_LANSegment
