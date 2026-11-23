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
 * A representation of the model object '<em><b>CIM LAN Connectivity Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of LAN Endpoints of a particular type (i.e., Ethernet or Token Ring), that are able to intercommunicate without the assistance of bridging or routing services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LANConnectivitySegment#getLANID <em>LANID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANConnectivitySegment#getConnectivityType <em>Connectivity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LANConnectivitySegment#getOtherTypeDescription <em>Other Type Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LANConnectivitySegment()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LANConnectivitySegment extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>LANID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label or identifier for the LAN segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LANID</em>' attribute.
	 * @see #setLANID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANConnectivitySegment_LANID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_LANEndpoint.LANID\"]'"
	 * @generated
	 */
	String getLANID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANConnectivitySegment#getLANID <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANID</em>' attribute.
	 * @see #getLANID()
	 * @generated
	 */
	void setLANID(String value);

	/**
	 * Returns the value of the '<em><b>Connectivity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that categorizes and classifies instances of this class. Instances SHOULD aggregate entities of the appropriate 'type', as defined by the value of this enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectivity Type</em>' attribute.
	 * @see #setConnectivityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANConnectivitySegment_ConnectivityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Ethernet\",\"TokenRing\",\"FDDI\"]' ModelCorrespondence='[\"CIM_LANConnectivitySegment.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getConnectivityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANConnectivitySegment#getConnectivityType <em>Connectivity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Type</em>' attribute.
	 * @see #getConnectivityType()
	 * @generated
	 */
	void setConnectivityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of connectivity that is supported by this Collection, when the value of the Type property is set to 1 (i.e., "Other"). This property should be set to NULL when the Type property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LANConnectivitySegment_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LANConnectivitySegment.ConnectivityType\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LANConnectivitySegment#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

} // CIM_LANConnectivitySegment
