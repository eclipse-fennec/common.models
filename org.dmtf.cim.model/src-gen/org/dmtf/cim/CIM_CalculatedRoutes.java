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
 * A representation of the model object '<em><b>CIM Calculated Routes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This assocation makes explicit the routes that are calculated by a specific RouteCalculationService. Thus, every RouteCalculationService can have its own unique set of calculated routes. The association is not necessary in the model and has been deprecated. An instance of the general ConcreteDependency association can tie a NextHopIPRoute to a RouteCalculationService. In addition, information on how the route was derived is available in NextHopIPRoute's RouteDerivation enumeration.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CalculatedRoutes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteDependency\",\"CIM_NextHopIPRoute.RouteDerivation\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_RouteCalculationService REF' override.Antecedent.Deprecated='[\"CIM_ConcreteDependency.Antecedent\",\"CIM_NextHopIPRoute.RouteDerivation\"]' override.Antecedent.Max='1' override.Antecedent.Description='The route\'s calculation service.' override.Dependent='CIM_IPRoute REF' override.Dependent.Deprecated='[\"CIM_ConcreteDependency.Dependent\"]' override.Dependent.Description='The IP route calculated by a specific service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CalculatedRoutes extends CIM_Dependency {
} // CIM_CalculatedRoutes
