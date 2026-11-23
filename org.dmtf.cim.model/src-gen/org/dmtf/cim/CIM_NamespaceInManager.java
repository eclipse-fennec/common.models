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
 * A representation of the model object '<em><b>CIM Namespace In Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_NamespaceInManager is deprecated. See CIM_WBEMServerNamespace and CIM_HostedDependency to model the relationship between a WBEMServer and the hosted namespaces.
 * NamespaceInManager is an association describing the Namespaces hosted by a CIM ObjectManager.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NamespaceInManager()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_HostedDependency\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_ObjectManager REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The ObjectManager containing a Namespace.' override.Dependent='CIM_Namespace REF' override.Dependent.Weak='true' override.Dependent.Description='The Namespace in an ObjectManager.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_NamespaceInManager extends CIM_HostedDependency {
} // CIM_NamespaceInManager
