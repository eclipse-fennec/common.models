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
 * A representation of the model object '<em><b>CIM Ranges Of Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association connects address ranges to the OSPF area configuration. When network administrators want to control the advertisements of OSPF routers by filters, they first define the relevant ranges. In order for a router to handle a range, an instance of RangeOfIPAddresses MUST be associated to the router's OSPFAreaConfiguration, using this relationship. The association between the range and area configuration contains a property (EnableAdvertise) defining the handling - to allow or disallow advertismenets in the range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RangesOfConfiguration#getEnableAdvertise <em>Enable Advertise</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RangesOfConfiguration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' override.Antecedent='CIM_RangeOfIPAddresses REF' override.Antecedent.Description='The address range that is in the OSPF area configuration.' override.Dependent='CIM_OSPFAreaConfiguration REF' override.Dependent.Description='The OSPF area configuration that contains the range.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RangesOfConfiguration extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Enable Advertise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address range is advertised (TRUE) or not (FALSE), see C.2 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Advertise</em>' attribute.
	 * @see #setEnableAdvertise(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RangesOfConfiguration_EnableAdvertise()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getEnableAdvertise();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RangesOfConfiguration#getEnableAdvertise <em>Enable Advertise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Advertise</em>' attribute.
	 * @see #getEnableAdvertise()
	 * @generated
	 */
	void setEnableAdvertise(Boolean value);

} // CIM_RangesOfConfiguration
