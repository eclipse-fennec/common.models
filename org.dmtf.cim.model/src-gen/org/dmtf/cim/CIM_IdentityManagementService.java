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
 * A representation of the model object '<em><b>CIM Identity Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A service supporting the creation and management of CIM_Identities .
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IdentityManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::User::SecurityServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IdentityManagementService extends CIM_AuthenticationService {
} // CIM_IdentityManagementService
