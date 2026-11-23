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
 * A representation of the model object '<em><b>CIM Record Log Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_RecordLogcapabilities describes the capabilities supported by the associated record log.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RecordLogCapabilities#getSupportedRecordTypes <em>Supported Record Types</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RecordLogCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::System::Logs' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RecordLogCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Record Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedRecordTypes indicates which record types are supported.
	 * 2 ("Record Data") indicates that this log is capable of storing log entry data in the RecordData property of CIM_RecordForLog in the format that is identified by the RecordFormat property of CIM_RecordForLog.
	 * 3 ("Standard Messages") indicates that this log is capable of storing log entries using Standard Messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Record Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordLogCapabilities_SupportedRecordTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Record Data\",\"Standard Messages\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedRecordTypes();

} // CIM_RecordLogCapabilities
