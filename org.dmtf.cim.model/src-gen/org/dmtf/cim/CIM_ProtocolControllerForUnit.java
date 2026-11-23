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
 * A representation of the model object '<em><b>CIM Protocol Controller For Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is used to define a relationship between a ProtocolController and an exposed Logical Unit (for example a Storage Volume or a MediaAccessDevice such as a tape drive). An example of the use of this association is SCSI, where it link the target controller and Logical Units. This subclass is provided so that an enumeration of related controllers and units can be performed without retrieving any connected ports or other controllers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerForUnit#getDeviceAccess <em>Device Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForUnit()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Device::ProtocolController' override.Antecedent='CIM_ProtocolController REF' override.Antecedent.Description='The ProtocolController.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The logical unit (eg StorageVolume) \'behind\' the ProtocolController.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolControllerForUnit extends CIM_ProtocolControllerForDevice {
	/**
	 * Returns the value of the '<em><b>Device Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The access rights granted to the referenced logical unit as exposed through referenced ProtocolController. The 'No Access' value is used in implementations where the DeviceNumber is reserved, but no access is granted. 
	 * If the instrumentation exposes PrivilegeManagementService, this property MUST be synchronized with the Activities property of any Privilege instances associated with StorageHardwareIDs associated to the referenced ProtocolController and the referenced LogicalDevice. In particular, when this property is 'Read Write', Privilege.Activities MUST include entries for 'Read' and 'Write'. When this property is 'Read-Only', Privilege.Activities MUST include an entry for 'Read'. The corresponding entries for Privilege.ActivityQualifiers MUST be 'CDB=*' and the corresponding entries for Privilege.QualifierFormat MUST be 'SCSI Command'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Access</em>' attribute.
	 * @see #setDeviceAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForUnit_DeviceAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..15999\",\"16000..\"]' Values='[\"Unknown\",\"Read Write\",\"Read-Only\",\"No Access\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getDeviceAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerForUnit#getDeviceAccess <em>Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Access</em>' attribute.
	 * @see #getDeviceAccess()
	 * @generated
	 */
	void setDeviceAccess(Integer value);

} // CIM_ProtocolControllerForUnit
