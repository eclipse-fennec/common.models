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
 * A representation of the model object '<em><b>CIM Forwarded Routes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This assocation makes explicit the IP routes that are defined in the context of a specific ForwardingService. Every ForwardingService can have its own unique set of IP routing destinations. The association is deprecated since it is incorrect to mandate the existence of a ForwardingService in order to define the existence of a route.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ForwardedRoutes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_ForwardingService REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The forwarding service for the route.' override.Dependent='CIM_IPRoute REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Weak='true' override.Dependent.Description='The IP route being forwarded.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ForwardedRoutes extends CIM_RouteForwardedByService {
} // CIM_ForwardedRoutes
