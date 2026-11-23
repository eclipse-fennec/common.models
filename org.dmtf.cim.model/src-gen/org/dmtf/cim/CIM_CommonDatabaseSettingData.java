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
 * A representation of the model object '<em><b>CIM Common Database Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains the specific settings that identify the degree to which the high-level database capabilities that are defined in the CIM_CommonDatabaseCapabilities class are supported by a CommonDatabase. Specific values for the properties in this class must correspond to a valid capability that has been defined in the CIM_CommonDatabaseCapabilities class. 
 * Instances in the CIM_CommonDatabaseSettingData class are tied to the CommonDatabase using the ElementSettingData association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabaseSettingData#getRecoverabilityOption <em>Recoverability Option</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabaseSettingData#getOtherRecoverabilityOption <em>Other Recoverability Option</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Database::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CommonDatabaseSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Recoverability Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RecoverabilityOption indicates the specific recoverability mode for the associated CommonDatabase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recoverability Option</em>' attribute.
	 * @see #setRecoverabilityOption(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseSettingData_RecoverabilityOption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Recoverable\",\"Non-Recoverable\",\"Rebuildable\"]' ModelCorrespondence='[\"CIM_CommonDatabaseSettingData.OtherRecoverabilityOption\",\"CIM_CommonDatabaseCapabilities.RecoverabilityOptions\"]'"
	 * @generated
	 */
	Integer getRecoverabilityOption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabaseSettingData#getRecoverabilityOption <em>Recoverability Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recoverability Option</em>' attribute.
	 * @see #getRecoverabilityOption()
	 * @generated
	 */
	void setRecoverabilityOption(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Recoverability Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains additional recovery information for the CommonDatabase. This property must be specified when the Recoverability property is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Recoverability Option</em>' attribute.
	 * @see #setOtherRecoverabilityOption(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseSettingData_OtherRecoverabilityOption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_CommonDatabaseSettingData.RecoverabilityOption\",\"CIM_CommonDatabaseCapabilities.OtherRecoverabilityOptions\"]'"
	 * @generated
	 */
	String getOtherRecoverabilityOption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabaseSettingData#getOtherRecoverabilityOption <em>Other Recoverability Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Recoverability Option</em>' attribute.
	 * @see #getOtherRecoverabilityOption()
	 * @generated
	 */
	void setOtherRecoverabilityOption(String value);

} // CIM_CommonDatabaseSettingData
