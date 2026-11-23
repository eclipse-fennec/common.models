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
 * A representation of the model object '<em><b>CIM Initiator Masking Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Initiator Port Masking Group (StorageHardwareIDs).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InitiatorMaskingGroup#getConsistentLogicalUnitNumber <em>Consistent Logical Unit Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorMaskingGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.ElementName='string' override.ElementName.Write='true' override.ElementName.Description='A user-friendly name for the object. This property allows each instance to define a user-friendly name in addition to its key properties, identity data, and description information. \nNote that the Name property of ManagedSystemElement is also defined as a user-friendly name. But, it is often subclassed to be a Key. It is not reasonable that the same property can convey both identity and a user-friendly name, without inconsistencies. Where Name exists and is not a Key (such as for instances of LogicalDevice), the same information can be present in both the Name and ElementName properties. Note that if there is an associated instance of CIM_EnabledLogicalElementCapabilities, restrictions on this properties may exist as defined in ElementNameMask and MaxElementNameLen properties defined in that class.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_InitiatorMaskingGroup extends CIM_MaskingGroup {
	/**
	 * Returns the value of the '<em><b>Consistent Logical Unit Number</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the device numbers for a volume visible to the same initiator though different paths must be the same.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistent Logical Unit Number</em>' attribute.
	 * @see #setConsistentLogicalUnitNumber(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_InitiatorMaskingGroup_ConsistentLogicalUnitNumber()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getConsistentLogicalUnitNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InitiatorMaskingGroup#getConsistentLogicalUnitNumber <em>Consistent Logical Unit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistent Logical Unit Number</em>' attribute.
	 * @see #getConsistentLogicalUnitNumber()
	 * @generated
	 */
	void setConsistentLogicalUnitNumber(Boolean value);

} // CIM_InitiatorMaskingGroup
