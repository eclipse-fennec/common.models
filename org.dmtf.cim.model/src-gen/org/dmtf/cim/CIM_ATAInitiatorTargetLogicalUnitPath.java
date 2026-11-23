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
 * A representation of the model object '<em><b>CIM ATA Initiator Target Logical Unit Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association that models a host driver path to a logical unit. Each permutation of initiator and target ProtocolEndpoints and logical units is considered a separate path.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ATAInitiatorTargetLogicalUnitPath()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageDevices' keys='Initiator,Target,LogicalUnit'"
 * @generated
 */
@ProviderType
public interface CIM_ATAInitiatorTargetLogicalUnitPath extends CIM_InitiatorTargetLogicalUnitPath {
} // CIM_ATAInitiatorTargetLogicalUnitPath
