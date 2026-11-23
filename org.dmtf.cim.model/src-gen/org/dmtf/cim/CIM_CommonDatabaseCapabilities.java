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
 * A representation of the model object '<em><b>CIM Common Database Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties in this class represent general, high-level database capabilities that may be supported by a common database. For example, the ability for a database to support recoverability, replication, parallelism, or clustering would be specified in this class. Detailed settings, such as the minimum and maximum number of parallel servers for a database that supports parallelism, would be defined in the CIM_DatabaseParameter class. 
 * This information is tied to the CommonDatabase using the ElementCapabilities association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabaseCapabilities#getRecoverabilityOptions <em>Recoverability Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabaseCapabilities#getOtherRecoverabilityOptions <em>Other Recoverability Options</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Database::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CommonDatabaseCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Recoverability Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the supported recoverability modes for the associated CommonDatabase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recoverability Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseCapabilities_RecoverabilityOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Recoverable\",\"Non-Recoverable\",\"Rebuildable\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CommonDatabaseCapabilities.OtherRecoverabilityOptions\"]'"
	 * @generated
	 */
	EList<Integer> getRecoverabilityOptions();

	/**
	 * Returns the value of the '<em><b>Other Recoverability Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains additional recovery information for the CommonDatabase. This property must be specified when the Recoverability property is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Recoverability Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseCapabilities_OtherRecoverabilityOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_CommonDatabaseCapabilities.RecoverabilityOptions\"]'"
	 * @generated
	 */
	EList<String> getOtherRecoverabilityOptions();

} // CIM_CommonDatabaseCapabilities
