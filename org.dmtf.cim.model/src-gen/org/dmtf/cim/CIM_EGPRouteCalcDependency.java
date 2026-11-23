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
 * A representation of the model object '<em><b>CIM EGP Route Calc Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of ServiceServiceDependency, and captures the dependency that external gateway protocols (such as BGP) have on interior gateway protocols (such as OSPF).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EGPRouteCalcDependency#getIGPInjection <em>IGP Injection</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EGPRouteCalcDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_RouteCalculationService REF' override.Antecedent.Description='The independent RouteCalculationService that provides routing information from the AS, for the EGP to use.' override.Dependent='CIM_RouteCalculationService REF' override.Dependent.Description='The dependent RouteCalculationService (e.g., the Route CalculationService) that is functioning as an EGP.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_EGPRouteCalcDependency extends CIM_ServiceServiceDependency {
	/**
	 * Returns the value of the '<em><b>IGP Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sometimes it is necessary to inject EGP information, such as that from BGP, into IGPs. This attribute defines whether this should be done for the two routing protocols that are defined by this association. The values below mean that no, partial, and full EGP information is injected into the IGP, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IGP Injection</em>' attribute.
	 * @see #setIGPInjection(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EGPRouteCalcDependency_IGPInjection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"None\",\"Partial\",\"Full\"]'"
	 * @generated
	 */
	Integer getIGPInjection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EGPRouteCalcDependency#getIGPInjection <em>IGP Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IGP Injection</em>' attribute.
	 * @see #getIGPInjection()
	 * @generated
	 */
	void setIGPInjection(Integer value);

} // CIM_EGPRouteCalcDependency
