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
 * A representation of the model object '<em><b>CIM Storage Protection Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The StorageProtectionSetting class holds properties for the protection-related configuration and status of a storage element (StorageVolume or LogicalDisk). It is associated to the StorageVolume or LogicalDisk class by ElementProtectionSettingData. A management application can retrieve the protection-related information by traversing the ElementProtectionSettingData association. If is not found, it indicates no protection management is applied for the storage element. These settings can only be changed by invoking the StorageProtectionService.Protect method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getProtectionControlled <em>Protection Controlled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getAccess <em>Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getInquiryProtection <em>Inquiry Protection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getDenyAsCopyTarget <em>Deny As Copy Target</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getLUNMappingConfigurable <em>LUN Mapping Configurable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getProtectionExpirationSpecified <em>Protection Expiration Specified</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProtectionSetting#getRemainingProtectionTime <em>Remaining Protection Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageProtectionSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Protection Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the storage element is being protected or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Controlled</em>' attribute.
	 * @see #setProtectionControlled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_ProtectionControlled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getProtectionControlled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionSetting#getProtectionControlled <em>Protection Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Controlled</em>' attribute.
	 * @see #getProtectionControlled()
	 * @generated
	 */
	void setProtectionControlled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read and write accessibility of the storage element 0: Unknown 
	 * 1: Read/Write Enabled 
	 * 2: Read Only 
	 * 3: Write Once 
	 * 4: Read/Write Disabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_Access()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Read/Write Enabled\",\"Read Only\",\"Write Once\",\"Read/Write Disabled\"]'"
	 * @generated
	 */
	Integer getAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionSetting#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Inquiry Protection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StorageVolume protection method for SCSI inquiry commands. 
	 * 0: Unknown 
	 * 1: No SCSI Inquiry Protection 
	 * 2: Inquiry Disabled 
	 * 3: Zero Capacity Returned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inquiry Protection</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_InquiryProtection()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"No SCSI Inquiry Protection\",\"Inquiry Disabled\",\"Zero Capacity Returned\"]'"
	 * @generated
	 */
	EList<Integer> getInquiryProtection();

	/**
	 * Returns the value of the '<em><b>Deny As Copy Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the storage element can be used as a replica.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deny As Copy Target</em>' attribute.
	 * @see #setDenyAsCopyTarget(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_DenyAsCopyTarget()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDenyAsCopyTarget();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionSetting#getDenyAsCopyTarget <em>Deny As Copy Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deny As Copy Target</em>' attribute.
	 * @see #getDenyAsCopyTarget()
	 * @generated
	 */
	void setDenyAsCopyTarget(Boolean value);

	/**
	 * Returns the value of the '<em><b>LUN Mapping Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether a LUN assignment to the StorageVolume is allowed or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LUN Mapping Configurable</em>' attribute.
	 * @see #setLUNMappingConfigurable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_LUNMappingConfigurable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLUNMappingConfigurable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionSetting#getLUNMappingConfigurable <em>LUN Mapping Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LUN Mapping Configurable</em>' attribute.
	 * @see #getLUNMappingConfigurable()
	 * @generated
	 */
	void setLUNMappingConfigurable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Protection Expiration Specified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration type of the storage element protection 
	 * 1: None 
	 * 2: Limited Expiration 
	 * 3: Permanent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protection Expiration Specified</em>' attribute.
	 * @see #setProtectionExpirationSpecified(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_ProtectionExpirationSpecified()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"None\",\"Limited expiration\",\"Permanent\"]'"
	 * @generated
	 */
	Integer getProtectionExpirationSpecified();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionSetting#getProtectionExpirationSpecified <em>Protection Expiration Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Expiration Specified</em>' attribute.
	 * @see #getProtectionExpirationSpecified()
	 * @generated
	 */
	void setProtectionExpirationSpecified(Integer value);

	/**
	 * Returns the value of the '<em><b>Remaining Protection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of remaining time before a management application can change the access permission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Protection Time</em>' attribute.
	 * @see #setRemainingProtectionTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProtectionSetting_RemainingProtectionTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getRemainingProtectionTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProtectionSetting#getRemainingProtectionTime <em>Remaining Protection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Protection Time</em>' attribute.
	 * @see #getRemainingProtectionTime()
	 * @generated
	 */
	void setRemainingProtectionTime(String value);

} // CIM_StorageProtectionSetting
