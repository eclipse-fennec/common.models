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
 * A representation of the model object '<em><b>CIM Masking Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a collection of storage masking objects, such as a group of InitiatorPorts, TargetPorts or LUNames.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MaskingGroup#getDeleteOnEmpty <em>Delete On Empty</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MaskingGroup#getDeleteWhenBecomesUnassociated <em>Delete When Becomes Unassociated</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MaskingGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MaskingGroup extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Delete On Empty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true and empty groups are allowed, the group will be deleted when the last element is removed from the group. If empty groups are not allowed, the group will be deleted automatically when the group becomes empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Empty</em>' attribute.
	 * @see #setDeleteOnEmpty(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingGroup_DeleteOnEmpty()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnEmpty();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingGroup#getDeleteOnEmpty <em>Delete On Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Empty</em>' attribute.
	 * @see #getDeleteOnEmpty()
	 * @generated
	 */
	void setDeleteOnEmpty(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delete When Becomes Unassociated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the group will be deleted when the group is no longer associated to any SCSIProtocolController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete When Becomes Unassociated</em>' attribute.
	 * @see #setDeleteWhenBecomesUnassociated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MaskingGroup_DeleteWhenBecomesUnassociated()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteWhenBecomesUnassociated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MaskingGroup#getDeleteWhenBecomesUnassociated <em>Delete When Becomes Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete When Becomes Unassociated</em>' attribute.
	 * @see #getDeleteWhenBecomesUnassociated()
	 * @generated
	 */
	void setDeleteWhenBecomesUnassociated(Boolean value);

} // CIM_MaskingGroup
