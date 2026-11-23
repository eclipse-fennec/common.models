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
 * A representation of the model object '<em><b>CIM Active Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines a connection that is currently communicating, or is configured to communicate, between two ServiceAccessPoints. It is used when the connection is not treated as a ManagedElement itself (that is, with Status, statistics, and so on), but its existence is known. The SAPs that are connected are typically at the same networking or application layer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ActiveConnection#getTrafficType <em>Traffic Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ActiveConnection#getOtherTrafficDescription <em>Other Traffic Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ActiveConnection#getIsUnidirectional <em>Is Unidirectional</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ActiveConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_ServiceAccessPoint REF' override.Antecedent.Description='A ServiceAccessPoint that is configured to communicate or is actively communicating with the Dependent SAP. In a unidirectional connection, this SAP is the one that is transmitting.' override.Dependent='CIM_ServiceAccessPoint REF' override.Dependent.Description='A second ServiceAccessPoint that is configured to communicate or is actively communicating with the Antecedent SAP. In a unidirectional connection, this SAP is the one that is receiving the communication.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ActiveConnection extends CIM_SAPSAPDependency {
	/**
	 * Returns the value of the '<em><b>Traffic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated because it is incorrectly placed on the association. Unicast, broadcast, or other traffic types are not a function of the connection between the referenced endpoints, but rather are a function of the addressing, protocol and basic functionality of the endpoints. 
	 * Deprecated description: The type of traffic that is carried over this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traffic Type</em>' attribute.
	 * @see #setTrafficType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActiveConnection_TrafficType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Unicast\",\"Broadcast\",\"Multicast\",\"Anycast\"]' ModelCorrespondence='[\"CIM_ActiveConnection.OtherTrafficDescription\"]'"
	 * @generated
	 */
	Integer getTrafficType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActiveConnection#getTrafficType <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Type</em>' attribute.
	 * @see #getTrafficType()
	 * @generated
	 */
	void setTrafficType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Traffic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated because it is incorrectly placed on the association. Unicast, broadcast, or other traffic types are not a function of the connection between the referenced endpoints, but rather are a function of the addressing, protocol and basic functionality of the endpoints. 
	 * Deprecated description: A string that describes the type of traffic that is being carried over this instance when its Type property is set, for example, to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Traffic Description</em>' attribute.
	 * @see #setOtherTrafficDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActiveConnection_OtherTrafficDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' MaxLen='64' ModelCorrespondence='[\"CIM_ActiveConnection.TrafficType\"]'"
	 * @generated
	 */
	String getOtherTrafficDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActiveConnection#getOtherTrafficDescription <em>Other Traffic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Traffic Description</em>' attribute.
	 * @see #getOtherTrafficDescription()
	 * @generated
	 */
	void setOtherTrafficDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Unidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE means that this connection is unidirectional; FALSE means that this connection is bidirectional. When the connection is unidirectional, the "speaker" should be defined as the Antecedent reference. In a bidirectional connection, the selection of which AccessPoint is the Antecedent or Dependent is immaterial.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unidirectional</em>' attribute.
	 * @see #setIsUnidirectional(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActiveConnection_IsUnidirectional()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsUnidirectional();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActiveConnection#getIsUnidirectional <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unidirectional</em>' attribute.
	 * @see #getIsUnidirectional()
	 * @generated
	 */
	void setIsUnidirectional(Boolean value);

} // CIM_ActiveConnection
