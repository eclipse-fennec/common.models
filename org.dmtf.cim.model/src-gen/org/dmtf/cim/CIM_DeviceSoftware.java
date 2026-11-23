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
 * A representation of the model object '<em><b>CIM Device Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DeviceSoftware relationship identifies any software that is associated with a Device such as drivers, configuration, or application software, or firmware.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DeviceSoftware#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceSoftware#getPurposeDescription <em>Purpose Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceSoftware#getLoadedOnDevice <em>Loaded On Device</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceSoftware#getUpgradeableOnDevice <em>Upgradeable On Device</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSoftware()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::DeviceElements' override.Antecedent='CIM_SoftwareElement REF' override.Antecedent.Description='The SoftwareElement.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice that requires or uses the software.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceSoftware extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer that indicates the role that this software plays in regards to its associated Device. For example, this software could be instrumentation (value=5) or firmware (value=6).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSoftware_Purpose()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Driver\",\"Configuration Software\",\"Application Software\",\"Instrumentation\",\"Firmware\",\"BIOS\",\"Boot ROM\"]' MappingStrings='[\"MIF.DMTF|SubComponent Software|001.2\"]' ModelCorrespondence='[\"CIM_DeviceSoftware.PurposeDescription\"]'"
	 * @generated
	 */
	Integer getPurpose();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceSoftware#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Integer value);

	/**
	 * Returns the value of the '<em><b>Purpose Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that provides more information for the Purpose property, for example, "Application Software".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose Description</em>' attribute.
	 * @see #setPurposeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSoftware_PurposeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DeviceSoftware.Purpose\"]'"
	 * @generated
	 */
	String getPurposeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceSoftware#getPurposeDescription <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Description</em>' attribute.
	 * @see #getPurposeDescription()
	 * @generated
	 */
	void setPurposeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Loaded On Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates that the software is 'burned into' or otherwise located on the hardware of the LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loaded On Device</em>' attribute.
	 * @see #setLoadedOnDevice(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSoftware_LoadedOnDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLoadedOnDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceSoftware#getLoadedOnDevice <em>Loaded On Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded On Device</em>' attribute.
	 * @see #getLoadedOnDevice()
	 * @generated
	 */
	void setLoadedOnDevice(Boolean value);

	/**
	 * Returns the value of the '<em><b>Upgradeable On Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates whether the software is upgradeable, when it is LoadedOnDevice. Software that is loaded as part of the OperatingSystem is typically changeable and upgradeable. However, when DeviceSoftware is burned into EEPROM or a chip that realizes the LogicalDevice, then it might not be upgradeable. This property indicates the ability to update and upgrade DeviceSoftware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upgradeable On Device</em>' attribute.
	 * @see #setUpgradeableOnDevice(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSoftware_UpgradeableOnDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUpgradeableOnDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceSoftware#getUpgradeableOnDevice <em>Upgradeable On Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upgradeable On Device</em>' attribute.
	 * @see #getUpgradeableOnDevice()
	 * @generated
	 */
	void setUpgradeableOnDevice(Boolean value);

} // CIM_DeviceSoftware
