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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Networks In Admin Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is used to define the set of Logical Networks contained in an AdminDomain. This has the implied semantics that this set of LogicalNetworks are all managed by the same network administrator that manages the domain. 
 * 
 * Since the LogicalNetwork class is deprecated in lieu of ConnectivityCollection, this association is no longer necessary. It is deprecated to the HostedCollection association, that is inherited by ConnectivityCollection from its superclass, SystemSpecificCollection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworksInAdminDomain#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworksInAdminDomain#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworksInAdminDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedCollection\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='Domain,Network'"
 * @generated
 */
@ProviderType
public interface CIM_NetworksInAdminDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AdminDomain that hosts the various LogicalNetworks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(CIM_AdminDomain)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworksInAdminDomain_Domain()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AdminDomain REF' Deprecated='[\"CIM_HostedCollection.Antecedent\"]' Key='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_AdminDomain getDomain();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworksInAdminDomain#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CIM_AdminDomain value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LogicalNetworks that are hosted by the AdminDomain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(CIM_LogicalNetwork)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworksInAdminDomain_Network()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalNetwork REF' Deprecated='[\"CIM_HostedCollection.Dependent\"]' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_LogicalNetwork getNetwork();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworksInAdminDomain#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CIM_LogicalNetwork value);

} // CIM_NetworksInAdminDomain
