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
 * A representation of the model object '<em><b>CIM Hosted Admin Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AdministrativeDistance, being a global object, is weak to the AdminDomain that contains it. This association formalizes that relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedAdminDistance()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::Routes' override.Antecedent='CIM_AdminDomain REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The AdminDomain that scopes the AdministrativeDistance.' override.Dependent='CIM_AdministrativeDistance REF' override.Dependent.Weak='true' override.Dependent.Description='The table of (global) administrative distances that are defined in the context of the AdminDomain.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedAdminDistance extends CIM_HostedDependency {
} // CIM_HostedAdminDistance
