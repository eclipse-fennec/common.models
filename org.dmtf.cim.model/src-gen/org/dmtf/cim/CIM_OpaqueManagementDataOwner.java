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
 * A representation of the model object '<em><b>CIM Opaque Management Data Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_OpaqueManagementDataOwner describes ownership of opaque data by CIM_Identity instances. The definition of CIM_OpaqueManagementDataOwner as a subclass of CIM_AssociatedPrivilege represents the fact that the owner of opaque management data often has privileges to access it, but additionally is responsible for its existence and may have a storage quota against which it is applied. The definition of a distinct subclass facilitates discovery of the owning CIM_Identity instance.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataOwner()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::User::OpaqueManagementData' override.Subject='CIM_ManagedElement REF' override.Subject.Description='The CIM_Identity instance for whom privileges to the Target are granted or denied, and who is the owner of the Target.' override.Target='CIM_ManagedElement REF' override.Target.Description='The opaque management data to which the privileges and ownership apply.' keys='Subject,Target,UseKey'"
 * @generated
 */
@ProviderType
public interface CIM_OpaqueManagementDataOwner extends CIM_AssociatedPrivilege {
} // CIM_OpaqueManagementDataOwner
