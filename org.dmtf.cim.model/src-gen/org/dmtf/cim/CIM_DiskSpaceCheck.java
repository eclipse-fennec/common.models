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
 * A representation of the model object '<em><b>CIM Disk Space Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiskSpaceCheck describes the amount of disk space that needs to be available on the computer system. The amount is specified in the AvailableDiskSpace property. The details of this Check are compared with the value of the CIM_FileSystem. AvailableSpace property - where the CIM_FileSystem object is related (using HostedFileSystem) to the CIM_Computer System instance that describes the environment. When the value of the AvailableSpace property is greater than or equal to the value specified in AvailableDiskSpace, the Check is satisfied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskSpaceCheck#getAvailableDiskSpace <em>Available Disk Space</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskSpaceCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskSpaceCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Available Disk Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AvailableDiskSpace property specifies the minimum amount of disk space that needs to be available on the target system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Disk Space</em>' attribute.
	 * @see #setAvailableDiskSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskSpaceCheck_AvailableDiskSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' ModelCorrespondence='[\"CIM_FileSystem.AvailableSpace\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getAvailableDiskSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskSpaceCheck#getAvailableDiskSpace <em>Available Disk Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Disk Space</em>' attribute.
	 * @see #getAvailableDiskSpace()
	 * @generated
	 */
	void setAvailableDiskSpace(Long value);

} // CIM_DiskSpaceCheck
