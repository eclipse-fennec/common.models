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
 * A representation of the model object '<em><b>CIM Non Volatile Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class has been deprecated in favor of CIM_Memory with the volatile parameter set to false. Capabilities and management of NV Storage. Non-volatile memory natively includes flash and ROM storage. In addition, NV memory can be BasedOn VolatileStorage, if the volatile memory is backed by a Battery. This scenario would be completely described by an instance of the AssociatedBattery relationship, referencing the NonVolatileStorage as the Dependent and the Battery as the Antecedent, and an instance of the BasedOn relationship, referencing the NonVolatileStorage as the Dependent and the VolatileStorage as the Antecedent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NonVolatileStorage#getIsWriteable <em>Is Writeable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NonVolatileStorage#getApplicationWriteable <em>Application Writeable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NonVolatileStorage#getStartAddressForApplicationWrite <em>Start Address For Application Write</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NonVolatileStorage#getApplicationWriteableSize <em>Application Writeable Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NonVolatileStorage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_Memory\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Memory' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_NonVolatileStorage extends CIM_Memory {
	/**
	 * Returns the value of the '<em><b>Is Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicating that the NV storage is writeable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Writeable</em>' attribute.
	 * @see #setIsWriteable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NonVolatileStorage_IsWriteable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_Memory.Access\"]'"
	 * @generated
	 */
	Boolean getIsWriteable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NonVolatileStorage#getIsWriteable <em>Is Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Writeable</em>' attribute.
	 * @see #getIsWriteable()
	 * @generated
	 */
	void setIsWriteable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Application Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that at least some portion of the NonVolatileStorage is writeable by applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Writeable</em>' attribute.
	 * @see #setApplicationWriteable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NonVolatileStorage_ApplicationWriteable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getApplicationWriteable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NonVolatileStorage#getApplicationWriteable <em>Application Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Writeable</em>' attribute.
	 * @see #getApplicationWriteable()
	 * @generated
	 */
	void setApplicationWriteable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Start Address For Application Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), StartAddress forApplcationWrite indicates the starting address for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Address For Application Write</em>' attribute.
	 * @see #setStartAddressForApplicationWrite(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NonVolatileStorage_StartAddressForApplicationWrite()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' ModelCorrespondence='[\"CIM_NonVolatileStorage.ApplicationWriteable\"]'"
	 * @generated
	 */
	Long getStartAddressForApplicationWrite();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NonVolatileStorage#getStartAddressForApplicationWrite <em>Start Address For Application Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address For Application Write</em>' attribute.
	 * @see #getStartAddressForApplicationWrite()
	 * @generated
	 */
	void setStartAddressForApplicationWrite(Long value);

	/**
	 * Returns the value of the '<em><b>Application Writeable Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), Application WritableSize indicates the number of bits available for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Writeable Size</em>' attribute.
	 * @see #setApplicationWriteableSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NonVolatileStorage_ApplicationWriteableSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Units='Bits' ModelCorrespondence='[\"CIM_NonVolatileStorage.ApplicationWriteable\"]' PUnit='bit'"
	 * @generated
	 */
	Long getApplicationWriteableSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NonVolatileStorage#getApplicationWriteableSize <em>Application Writeable Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Writeable Size</em>' attribute.
	 * @see #getApplicationWriteableSize()
	 * @generated
	 */
	void setApplicationWriteableSize(Long value);

} // CIM_NonVolatileStorage
