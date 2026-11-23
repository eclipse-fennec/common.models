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
 * A representation of the model object '<em><b>CIM SCSI Initiator Target Logical Unit Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association that models a host driver path to a SCSI logical unit. Each permutation of initiator and target ProtocolEndpoints and logical units is considered a separate path. This class describes end-to-end path behavior such as properties and operations commonly used in multipath management.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getOSDeviceName <em>OS Device Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getAdministrativeWeight <em>Administrative Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getAdministrativeOverride <em>Administrative Override</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getLogicalUnitNumber <em>Logical Unit Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInitiatorTargetLogicalUnitPath()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageDevices' keys='Initiator,Target,LogicalUnit'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIInitiatorTargetLogicalUnitPath extends CIM_InitiatorTargetLogicalUnitPath {
	/**
	 * Returns the value of the '<em><b>OS Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OS Device Name for this path. Only applicable if the ExposedPathDeviceFiles property is true in the instance of SCSIMultipathConfigurationCapabilities associated with the LogicalDevice/RedundancySet this instance is a member of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Device Name</em>' attribute.
	 * @see #setOSDeviceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInitiatorTargetLogicalUnitPath_OSDeviceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MP_API.SNIA|MP_PATH_LOGICAL_UNIT_PROPERTIES|deviceFileName\"]'"
	 * @generated
	 */
	String getOSDeviceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getOSDeviceName <em>OS Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Device Name</em>' attribute.
	 * @see #getOSDeviceName()
	 * @generated
	 */
	void setOSDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Administrative Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value assigned by an administrator specifying a preference to assign to a path. The drivers will actively use all available paths with the highest weight. This allows an administrator to assign a subset of available paths for load balanced access and reserve the others as backup paths. For symmetric access devices, all paths are considered 'available'. For asymmetric access devices, all paths in active target port groups are considered available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative Weight</em>' attribute.
	 * @see #setAdministrativeWeight(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInitiatorTargetLogicalUnitPath_AdministrativeWeight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MappingStrings='[\"MP_API.SNIA|MP_PATH_LOGICAL_UNIT_PROPERTIES|weight\"]'"
	 * @generated
	 */
	Long getAdministrativeWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getAdministrativeWeight <em>Administrative Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Weight</em>' attribute.
	 * @see #getAdministrativeWeight()
	 * @generated
	 */
	void setAdministrativeWeight(Long value);

	/**
	 * Returns the value of the '<em><b>Administrative Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdministrativeOverride allows an administrator to select a single path, force all I/O to this path, and disables load balancing. The steady-state value is 'No override in effect'. When an administrator sets an override for a particular path, that path's AdministrativeOverride is set to 'Overridding' and all other paths to same logical unit are assigned a value of 'Overridden'. This property is changed using the OverridePath method in SCSIPathConfigurationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative Override</em>' attribute.
	 * @see #setAdministrativeOverride(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInitiatorTargetLogicalUnitPath_AdministrativeOverride()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Overriding\",\"Overridden\",\"No override in effect\"]' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|overridePath\"]' ModelCorrespondence='[\"CIM_SCSIPathConfigurationService.SetOverridePath\"]'"
	 * @generated
	 */
	Integer getAdministrativeOverride();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getAdministrativeOverride <em>Administrative Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Override</em>' attribute.
	 * @see #getAdministrativeOverride()
	 * @generated
	 */
	void setAdministrativeOverride(Integer value);

	/**
	 * Returns the value of the '<em><b>Logical Unit Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SCSI Logical Unit Number. This is the unit number with values below 16,384 used in management applications. It is not the full SCSI SAM 8-byte logical unit number structure. Using the terminology from the T10 SCSI specifications, this is the LU number with a value between 0 and 255 using the Peripheral device addressing method with Bus Identifier zero or a LU number between 0 and 16,383 using the Flat space (AKA volume set) addressing method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Unit Number</em>' attribute.
	 * @see #setLogicalUnitNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInitiatorTargetLogicalUnitPath_LogicalUnitNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MaxValue='16383' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|overridePathMP_API.SNIA|MP_CancelOverridePath\",\"MP_API.SNIA|MP_SetOverridePath\"]'"
	 * @generated
	 */
	Integer getLogicalUnitNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInitiatorTargetLogicalUnitPath#getLogicalUnitNumber <em>Logical Unit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Unit Number</em>' attribute.
	 * @see #getLogicalUnitNumber()
	 * @generated
	 */
	void setLogicalUnitNumber(Integer value);

} // CIM_SCSIInitiatorTargetLogicalUnitPath
