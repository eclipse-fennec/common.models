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
 * A representation of the model object '<em><b>CIM Use Of Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ManagedSystemElements may record their event, error or informational data within Logs. The use of a Log to hold a ManagedSystemElement's data is described by this association. The type of Element data captured by the Log can be specified using the RecordedData string property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UseOfLog#getRecordedData <em>Recorded Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UseOfLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.9.0' UMLPackagePath='CIM::System::Logs' override.Antecedent='CIM_Log REF' override.Antecedent.Description='The Log.' override.Dependent='CIM_ManagedSystemElement REF' override.Dependent.Description='The ManagedSystemElement whose information is recorded in the Log.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_UseOfLog extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Recorded Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the use of the Log by the ManagedSystemElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded Data</em>' attribute.
	 * @see #setRecordedData(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UseOfLog_RecordedData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRecordedData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UseOfLog#getRecordedData <em>Recorded Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Data</em>' attribute.
	 * @see #getRecordedData()
	 * @generated
	 */
	void setRecordedData(String value);

} // CIM_UseOfLog
