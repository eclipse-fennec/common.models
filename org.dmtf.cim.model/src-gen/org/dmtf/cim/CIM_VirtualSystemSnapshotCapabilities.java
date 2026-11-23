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
 * A representation of the model object '<em><b>CIM Virtual System Snapshot Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_VirtualSystemSnapshotCapabilities class defines the properties that describe the capabilities of a virtual system with respect to snapshots, like for example the set of snapshot operations that it enabled for a virtual system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSnapshotCapabilities#getSnapshotTypesEnabled <em>Snapshot Types Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSnapshotCapabilities#getGuestOSNotificationEnabled <em>Guest OS Notification Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Virtualization' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemSnapshotCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Snapshot Types Enabled</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of snapshot type identifiers each designating a snapshot type that is presently enabled for the virtual system that is referenced via the CIM_ElementCapabilities association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot Types Enabled</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotCapabilities_SnapshotTypesEnabled()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Full Snapshot\",\"Disk Snapshot\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_VirtualSystemSnapshotService.CreateSnapshot(SnapshotType)\",\"CIM_VirtualSystemSnapshotServiceCapabilities.SnapshotTypesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getSnapshotTypesEnabled();

	/**
	 * Returns the value of the '<em><b>Guest OS Notification Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean flag indicating the capability of the snapshot service to notify the guest operation system that runs within the virtual system about the imminent snapshot operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guest OS Notification Enabled</em>' attribute.
	 * @see #setGuestOSNotificationEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotCapabilities_GuestOSNotificationEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getGuestOSNotificationEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemSnapshotCapabilities#getGuestOSNotificationEnabled <em>Guest OS Notification Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest OS Notification Enabled</em>' attribute.
	 * @see #getGuestOSNotificationEnabled()
	 * @generated
	 */
	void setGuestOSNotificationEnabled(Boolean value);

} // CIM_VirtualSystemSnapshotCapabilities
