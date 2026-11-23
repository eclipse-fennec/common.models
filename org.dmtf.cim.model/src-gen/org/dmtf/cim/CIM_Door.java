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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Door is the abstraction of hardware providing access to the internal componentry of a System. When a Door is 'opened', typically all accessible, moving components are stopped or suspended to prevent physical harm.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Door#getOpen <em>Open</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Door#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Door#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Door#getLastOpened <em>Last Opened</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Door#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Door()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::UserDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Door extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating the 'open' (TRUE) or 'closed' (FALSE) status of the Door.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Door_Open()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getOpen();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Door#getOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(Boolean value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Door is 'locked' (TRUE) or 'unlocked' (FALSE). When the Door is locked, access to the componentry is prevented, without the use of a physical key or the issuance of a software unlock command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Door_Locked()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLocked();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Door#getLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #getLocked()
	 * @generated
	 */
	void setLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a Door is 'Open', all accessible, moving componentry and Device operation are typically stopped. The Timeout property provides a mechanism to event on a Door left open for a period of time (in seconds) exceeding the property's value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Door_Timeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Door#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Last Opened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and time that the Door was last opened.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Opened</em>' attribute.
	 * @see #setLastOpened(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Door_LastOpened()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastOpened();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Door#getLastOpened <em>Last Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Opened</em>' attribute.
	 * @see #getLastOpened()
	 * @generated
	 */
	void setLastOpened(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Capabilities of the Door. For example, information on whether the Door is "Host System Lockable" (value=2) and/or whether a key is available (value=3) are specified in this property. The value 4, "All Drives Dismounted Before Access", pertains to a Door on a StorageLibrary or set of drive bays. If specified for the Door, it means that it can not be opened unless all Media are first unloaded from the accessible MediaAccessDevices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Door_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Host System Lockable\",\"Physical Key\",\"All Drives Dismounted Before Access\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

} // CIM_Door
