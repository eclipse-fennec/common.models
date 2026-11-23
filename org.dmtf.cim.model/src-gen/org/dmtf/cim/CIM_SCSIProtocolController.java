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
 * A representation of the model object '<em><b>CIM SCSI Protocol Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SCSIProtocolController is a type of ProtocolController, managing a SCSI interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIProtocolController#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIProtocolController#getOtherNameFormat <em>Other Name Format</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.1000' UMLPackagePath='CIM::Device::ProtocolController' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIProtocolController extends CIM_ProtocolController {
	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NameFormat property identifies how the Name of the SCSIProtocolController is selected. 
	 * For Fibre Channel, the NameFormat is 'FC Port WWN'. 
	 * For iSCSI, Name can use any of the 3 iSCSI formats (iqn, eui, naa) which include the iSCSI format as as a prefix in the name, so they are not ambiguous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see #setNameFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolController_NameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"FC Port WWN\",\"iSCSI Name\"]' ModelCorrespondence='[\"CIM_SCSIProtocolController.Name\",\"CIM_SCSIProtocolController.OtherNameFormat\"]'"
	 * @generated
	 */
	Integer getNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIProtocolController#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing how the ProtocolController is identified when the NameFormat is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Name Format</em>' attribute.
	 * @see #setOtherNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIProtocolController_OtherNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SCSIProtocolController.Name\",\"CIM_SCSIProtocolController.NameFormat\"]'"
	 * @generated
	 */
	String getOtherNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIProtocolController#getOtherNameFormat <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Name Format</em>' attribute.
	 * @see #getOtherNameFormat()
	 * @generated
	 */
	void setOtherNameFormat(String value);

} // CIM_SCSIProtocolController
