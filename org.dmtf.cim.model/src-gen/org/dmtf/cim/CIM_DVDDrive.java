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
 * A representation of the model object '<em><b>CIM DVD Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a DVDDrive, a subtype of MediaAccessDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DVDDrive#getFormatsSupported <em>Formats Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DVDDrive()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageDevices' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DVDDrive extends CIM_MediaAccessDevice {
	/**
	 * Returns the value of the '<em><b>Formats Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CD and DVD formats that are supported by this Device. For example, the Drive may support "CD-ROM" and "DVD-RAM". In this case, the values 16 and 24 would be written to the array. This property's values align with those defined in PhysicalMedia.MediaType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formats Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DVDDrive_FormatsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"16\",\"17\",\"18\",\"19\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\"]' Values='[\"Unknown\",\"Other\",\"CD-ROM\",\"CD-ROM/XA\",\"CD-I\",\"CD Recordable\",\"DVD\",\"DVD-RW+\",\"DVD-RAM\",\"DVD-ROM\",\"DVD-Video\",\"Divx\",\"CD-RW\",\"CD-DA\",\"CD+\",\"DVD Recordable\",\"DVD-RW\",\"DVD-Audio\",\"DVD-5\",\"DVD-9\",\"DVD-10\",\"DVD-18\"]' ModelCorrespondence='[\"CIM_PhysicalMedia.MediaType\"]'"
	 * @generated
	 */
	EList<Integer> getFormatsSupported();

} // CIM_DVDDrive
