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
 * A representation of the model object '<em><b>CIM Reject Connection Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RejectConnectionAction is used to cause a connection or its negotiation to be terminated. For example, it can be used in conjunction with an address filter on UDP port 500 to reduce Denial of Service vulnerability. As another example, it can be specified as a low priority rule to explicitly define the default action for IKE key exchange negotiations - i.e., if the higher priority rules are not satisfied, then reject the connection negotiation.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RejectConnectionAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' MappingStrings='[\"IPSP Policy Model.IETF|IKERejectAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_RejectConnectionAction extends CIM_PolicyAction {
} // CIM_RejectConnectionAction
