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
 * A representation of the model object '<em><b>CIM Filter Lists In BGP Route Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RouteMaps do not have to use FilterLists, but if they do, this association defines which FilterList is used by a particular RouteMap.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterListsInBGPRouteMap()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_FilterList REF' override.Antecedent.Description='The FilterList used by a RouteMap.' override.Dependent='CIM_BGPRouteMap REF' override.Dependent.Description='The RouteMap using the FilterList.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_FilterListsInBGPRouteMap extends CIM_Dependency {
} // CIM_FilterListsInBGPRouteMap
