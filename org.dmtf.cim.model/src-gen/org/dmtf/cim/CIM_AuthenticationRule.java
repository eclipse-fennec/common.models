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
 * A representation of the model object '<em><b>CIM Authentication Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class representing a company's and/or administrator's authentication requirements for a CIM_Identity. The PolicyConditions collected by an instance of AuthenticationRule describe the various requirements under which a CIM_Identity's CurrentlyAuthenticated Boolean is set to TRUE. Note that the CIM_Identities which are authenticated are tied to the Rule by the association, PolicySet AppliesToElement. 
 * 
 * At this time, there are no actions associated with this PolicyRule. This is because the actions are implicit. When the conditions of the rule are met, then the CurrentlyAuthenticated Boolean properties of the associated instances of CIM_Identity are set to TRUE.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationRule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,CreationClassName,PolicyRuleName'"
 * @generated
 */
@ProviderType
public interface CIM_AuthenticationRule extends CIM_PolicyRule {
} // CIM_AuthenticationRule
