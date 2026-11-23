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
 * A representation of the model object '<em><b>CIM Hosted Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedDependency defines a ManagedElement in the context of another ManagedElement in which it resides.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Core::CoreElements' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Max='1' override.Antecedent.Description='The scoping ManagedElement.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Description='The hosted ManagedElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedDependency extends CIM_Dependency {
} // CIM_HostedDependency
