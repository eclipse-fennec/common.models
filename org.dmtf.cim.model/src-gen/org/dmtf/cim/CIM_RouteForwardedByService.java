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
 * A representation of the model object '<em><b>CIM Route Forwarded By Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This assocation makes explicit the next hops that are forwarded by a specific ForwardingService, to reach the destination. Every ForwardingService can have its own unique set of routing destinations and next hops. The association is deprecated since it is incorrect to mandate the existence of a ForwardingService in order to define the existence of a route.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RouteForwardedByService#getAdminDistance <em>Admin Distance</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RouteForwardedByService#getPathMetric <em>Path Metric</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RouteForwardedByService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_ForwardingService REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Min='1' override.Antecedent.Description='The forwarding service for the route.' override.Dependent='CIM_NextHopRouting REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='The route being forwarded.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RouteForwardedByService extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Admin Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the current administrative distance of this route, for the ForwardingService. Note that this property indicates current, specific values - whereas an instance of the CIM_AdministrativeDistance class defines default distances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Distance</em>' attribute.
	 * @see #setAdminDistance(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RouteForwardedByService_AdminDistance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_NextHopRoute.AdminDistance\"]'"
	 * @generated
	 */
	Integer getAdminDistance();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RouteForwardedByService#getAdminDistance <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Distance</em>' attribute.
	 * @see #getAdminDistance()
	 * @generated
	 */
	void setAdminDistance(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PathMetric provides a numeric indication as to the preference of this route compared to other routes that reach the same destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Metric</em>' attribute.
	 * @see #setPathMetric(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RouteForwardedByService_PathMetric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_NextHopRoute.RouteMetric\"]'"
	 * @generated
	 */
	Integer getPathMetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RouteForwardedByService#getPathMetric <em>Path Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Metric</em>' attribute.
	 * @see #getPathMetric()
	 * @generated
	 */
	void setPathMetric(Integer value);

} // CIM_RouteForwardedByService
