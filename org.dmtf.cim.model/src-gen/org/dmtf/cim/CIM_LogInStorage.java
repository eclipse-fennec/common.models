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
 * A representation of the model object '<em><b>CIM Log In Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MessageLogs can reside in data files, on specially allocated storage areas such as disks or memory, or output as raw I/O streams. In fact, a single Log may use each of these mechanisms to output or capture its contents. The LogInStorage association describes a Log located in a specially allocated portion of a StorageExtent. The offset of the Log, within the Extent, is defined using a property of the association, StartingOffset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogInStorage#getStartingOffset <em>Starting Offset</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogInStorage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::Logs' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Description='The StorageExtent.' override.Dependent='CIM_MessageLog REF' override.Dependent.Description='The MessageLog located within the Extent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogInStorage extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Starting Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StartingOffset indicates where in the Extent that the Log begins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Offset</em>' attribute.
	 * @see #setStartingOffset(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogInStorage_StartingOffset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getStartingOffset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogInStorage#getStartingOffset <em>Starting Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Offset</em>' attribute.
	 * @see #getStartingOffset()
	 * @generated
	 */
	void setStartingOffset(Long value);

} // CIM_LogInStorage
