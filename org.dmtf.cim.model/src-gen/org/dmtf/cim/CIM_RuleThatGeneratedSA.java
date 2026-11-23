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
 * A representation of the model object '<em><b>CIM Rule That Generated SA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RuleThatGeneratedSA associates a SecurityAssociationEndpoint with the SARule used to generate (or negotiate) it.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RuleThatGeneratedSA()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' override.Antecedent='CIM_SARule REF' override.Antecedent.Min='0' override.Antecedent.Max='1' override.Antecedent.Description='SARule that led to the Security Association.' override.Dependent='CIM_SecurityAssociationEndpoint REF' override.Dependent.Description='SecurityAssociationEndpoint created using the rule.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RuleThatGeneratedSA extends CIM_Dependency {
} // CIM_RuleThatGeneratedSA
