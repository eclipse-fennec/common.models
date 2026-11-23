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
 * A representation of the model object '<em><b>CIM IPsec Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPsecRule contains the Conditions and Actions for phase 2 negotiations or to specify static actions such as Discard.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPsecRule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IPsecRule\"]' keys='SystemCreationClassName,SystemName,CreationClassName,PolicyRuleName'"
 * @generated
 */
@ProviderType
public interface CIM_IPsecRule extends CIM_SARule {
} // CIM_IPsecRule
