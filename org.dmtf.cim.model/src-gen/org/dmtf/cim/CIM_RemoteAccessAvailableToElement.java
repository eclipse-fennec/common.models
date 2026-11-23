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
 * A representation of the model object '<em><b>CIM Remote Access Available To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an element's knowledge regarding accessing other (i.e., remote) Servers and Systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RemoteAccessAvailableToElement#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteAccessAvailableToElement#getOrderOfAccess <em>Order Of Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RemoteAccessAvailableToElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.19.0' UMLPackagePath='CIM::Network::Misc' override.Antecedent='CIM_RemoteServiceAccessPoint REF' override.Antecedent.Description='The remote server or system.' override.Dependent='CIM_EnabledLogicalElement REF' override.Dependent.Description='The EnabledLogicalElement which has knowledge of the remote server or system.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RemoteAccessAvailableToElement extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this access information is defined as a default configuration for the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteAccessAvailableToElement_IsDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteAccessAvailableToElement#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Order Of Access</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When an element is accessing remote services and systems, it MAY be necessary to order those accesses. This property defines that ordering - where lower numbers indicate a higher priority for access. A value of 0 (default) indicates that ordering does not apply. If multiple RemoteAccessPoint instances have the same value for OrderOfAccess, then these AccessPoints MAY be used in any sequence defined by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Of Access</em>' attribute.
	 * @see #setOrderOfAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteAccessAvailableToElement_OrderOfAccess()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getOrderOfAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteAccessAvailableToElement#getOrderOfAccess <em>Order Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Of Access</em>' attribute.
	 * @see #getOrderOfAccess()
	 * @generated
	 */
	void setOrderOfAccess(Integer value);

} // CIM_RemoteAccessAvailableToElement
