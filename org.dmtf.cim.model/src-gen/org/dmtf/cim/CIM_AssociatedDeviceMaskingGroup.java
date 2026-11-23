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
 * A representation of the model object '<em><b>CIM Associated Device Masking Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associate a group of devices (storage volumes) to a masking view.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedDeviceMaskingGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_SCSIProtocolController REF' override.Antecedent.Key='true' override.Antecedent.Description='The ProtocolController.' override.Dependent='CIM_DeviceMaskingGroup REF' override.Dependent.Key='true' override.Dependent.Description='The MaskingGroup associated with the ProtocolController.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedDeviceMaskingGroup extends CIM_AssociatedMaskingGroup {
} // CIM_AssociatedDeviceMaskingGroup
