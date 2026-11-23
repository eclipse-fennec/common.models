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
 * A representation of the model object '<em><b>CIM Calculates Among</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of the ServiceSAPDependency association, indicating that the referenced ProtocolEndpoint is utilized by the RouteCalculationService to provide its functionality.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CalculatesAmong#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CalculatesAmong()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Description='The required ProtocolEndpoint.' override.Dependent='CIM_RouteCalculationService REF' override.Dependent.Description='The RouteCalculationService, which is dependent on the underlying ProtocolEndpoint.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CalculatesAmong extends CIM_ServiceSAPDependency {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE indicates that this ProtocolEndpoint represents a static route, and FALSE means that it represents a dynamically-learned route. This property is deprecated since a Service may use an Endpoint to output several routes, some static and others dynamic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CalculatesAmong_IsStatic()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CalculatesAmong#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

} // CIM_CalculatesAmong
