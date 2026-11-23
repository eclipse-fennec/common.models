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
 * A representation of the model object '<em><b>CIM Next Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NextService establishes a predecessor-successor relationship between two ConditioningService objects. This association is used to indicate the sequence of ConditioningServices required to process a particular type of traffic. 
 * 
 * Instances describe the various relationships between different ConditioningServices (such as classifiers, meters, droppers, etc.) that are used collectively to condition traffic. Both one-to-one and more complicated fan-in and/or fan-out relationships can be described. The Conditioning Services may feed one another directly, or they may be mapped to multiple 'next' Services based on the characteristics of the packet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NextService#getPrecedingService <em>Preceding Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextService#getFollowingService <em>Following Service</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='PrecedingService,FollowingService'"
 * @generated
 */
@ProviderType
public interface CIM_NextService extends EObject {
	/**
	 * Returns the value of the '<em><b>Preceding Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preceding ConditioningService, 'earlier' in the processing sequence for a packet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preceding Service</em>' reference.
	 * @see #setPrecedingService(CIM_ConditioningService)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextService_PrecedingService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConditioningService REF' Key='true'"
	 * @generated
	 */
	CIM_ConditioningService getPrecedingService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextService#getPrecedingService <em>Preceding Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding Service</em>' reference.
	 * @see #getPrecedingService()
	 * @generated
	 */
	void setPrecedingService(CIM_ConditioningService value);

	/**
	 * Returns the value of the '<em><b>Following Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'next' or following ConditioningService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Following Service</em>' reference.
	 * @see #setFollowingService(CIM_ConditioningService)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextService_FollowingService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConditioningService REF' Key='true'"
	 * @generated
	 */
	CIM_ConditioningService getFollowingService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextService#getFollowingService <em>Following Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following Service</em>' reference.
	 * @see #getFollowingService()
	 * @generated
	 */
	void setFollowingService(CIM_ConditioningService value);

} // CIM_NextService
