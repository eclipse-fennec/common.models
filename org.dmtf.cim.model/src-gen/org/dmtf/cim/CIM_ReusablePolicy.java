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
 * A representation of the model object '<em><b>CIM Reusable Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ReusablePolicy association provides for the reuse of any subclass of Policy in a ReusablePolicyContainer.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReusablePolicy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Policy' override.Antecedent='CIM_ReusablePolicyContainer REF' override.Antecedent.Max='1' override.Antecedent.Description='This property identifies a ReusablePolicyContainer that provides the administrative scope for the reuse of the referenced policy element.' override.Dependent='CIM_Policy REF' override.Dependent.Description='A reusable policy element.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ReusablePolicy extends CIM_PolicyInSystem {
} // CIM_ReusablePolicy
