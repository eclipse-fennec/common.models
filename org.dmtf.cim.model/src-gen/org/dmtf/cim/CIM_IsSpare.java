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
 * A representation of the model object '<em><b>CIM Is Spare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IsSpare association indicates an element that can spare or replace any of the elements in the referenced RedundancySet. If the 'spare' is itself a Collection, this indicates that each of the 'spare' members can replace any of the elements in the RedundancySet. In the case of a collection all of the values in the properties of this association MUST apply to all members of the Collection. 
 * If this is not true, then the Collection SHOULD be broken down into smaller sets (and the IsSpare association defined for each of these smaller sets), such that the properties of this association apply to all collected members.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IsSpare#getSpareStatus <em>Spare Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IsSpare#getFailoverSupported <em>Failover Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IsSpare()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Redundancy' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Description='A ManagedElement or Collection of elements acting as a spare.' override.Dependent='CIM_RedundancySet REF' override.Dependent.Description='The set of elements that ARE spared.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_IsSpare extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Spare Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the state of the 'spare'. 
	 * - Hot Standby. The element is available 'immediately' to become a functioning member of the set. Such an element is powered on and has been initialized for it's role as a spare. 
	 * - Cold Standby. The element is not available to join the set without action to prepare it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spare Status</em>' attribute.
	 * @see #setSpareStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IsSpare_SpareStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Hot Standby\",\"Cold Standby\"]'"
	 * @generated
	 */
	Integer getSpareStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IsSpare#getSpareStatus <em>Spare Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spare Status</em>' attribute.
	 * @see #getSpareStatus()
	 * @generated
	 */
	void setSpareStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Failover Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the failover to the spare is a manual or automatic action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failover Supported</em>' attribute.
	 * @see #setFailoverSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IsSpare_FailoverSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Automatic\",\"Manual\",\"Both Manual and Automatic\"]'"
	 * @generated
	 */
	Integer getFailoverSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IsSpare#getFailoverSupported <em>Failover Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failover Supported</em>' attribute.
	 * @see #getFailoverSupported()
	 * @generated
	 */
	void setFailoverSupported(Integer value);

} // CIM_IsSpare
