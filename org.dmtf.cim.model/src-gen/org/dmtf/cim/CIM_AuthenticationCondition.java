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
 * A representation of the model object '<em><b>CIM Authentication Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class whose subclasses describe one of a company's and/or administrator's credential requirements, and/or other information that should be authenticated in order to establish/trust a CIM_Identity. The PolicyConditions collected by an instance of AuthenticationRule describe the various requirements under which a CIM_Identity's CurrentlyAuthenticated Boolean is set to TRUE. Note that the CIM_Identities which are authenticated are specified through the AuthenticationRule, using the PolicySet AppliesToElement association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationCondition()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_AuthenticationCondition extends CIM_PolicyCondition {
} // CIM_AuthenticationCondition
