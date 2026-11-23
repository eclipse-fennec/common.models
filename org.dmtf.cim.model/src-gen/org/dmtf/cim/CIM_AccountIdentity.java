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
 * A representation of the model object '<em><b>CIM Account Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AccountIdentity relates a system Account with the Identity that is established. Since Account also carries Identity semantics, the LogicalIdentity association is defined as the superclass of this association. This association does not add any constraints or semantics to ConcreteIdentity. As a result, it is deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteIdentity\"]' Version='2.8.0' UMLPackagePath='CIM::User::Account' override.SystemElement='CIM_Account REF' override.SystemElement.Deprecated='[\"CIM_ConcreteIdentity.SystemElement\"]' override.SystemElement.Description='The Account that establishes Identity.' override.SameElement='CIM_Identity REF' override.SameElement.Deprecated='[\"CIM_ConcreteIdentity.SameElement\"]' override.SameElement.Description='The Identity established by the Account.' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_AccountIdentity extends CIM_LogicalIdentity {
} // CIM_AccountIdentity
