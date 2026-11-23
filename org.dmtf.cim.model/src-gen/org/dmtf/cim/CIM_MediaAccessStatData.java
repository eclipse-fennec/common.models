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
 * A representation of the model object '<em><b>CIM Media Access Stat Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. The same class is used to represent this data - whether for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). The element whose statistics are described is associated using the relationship, ElementStatisticalData. Note that this class models the same properties as MediaAccessStatInfo. This class, however, uses the simplified key mechanisms of its superclass, StatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getReadOperations <em>Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getUnrecoverableReadOperations <em>Unrecoverable Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getWriteOperations <em>Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getUnrecoverableWriteOperations <em>Unrecoverable Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getRecoveredReadOperations <em>Recovered Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getRecoveredWriteOperations <em>Recovered Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getRecoveredSeekOperations <em>Recovered Seek Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatData#getUnrecoverableSeekOperations <em>Unrecoverable Seek Operations</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Device::StorageDevices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MediaAccessStatData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Read Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of attempted read operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Operations</em>' attribute.
	 * @see #setReadOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_ReadOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getReadOperations <em>Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Operations</em>' attribute.
	 * @see #getReadOperations()
	 * @generated
	 */
	void setReadOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Unrecoverable Read Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of unrecoverable read operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unrecoverable Read Operations</em>' attribute.
	 * @see #setUnrecoverableReadOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_UnrecoverableReadOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getUnrecoverableReadOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getUnrecoverableReadOperations <em>Unrecoverable Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unrecoverable Read Operations</em>' attribute.
	 * @see #getUnrecoverableReadOperations()
	 * @generated
	 */
	void setUnrecoverableReadOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Write Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of attempted write operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Operations</em>' attribute.
	 * @see #setWriteOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_WriteOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getWriteOperations <em>Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Operations</em>' attribute.
	 * @see #getWriteOperations()
	 * @generated
	 */
	void setWriteOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Unrecoverable Write Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of unrecoverable write operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unrecoverable Write Operations</em>' attribute.
	 * @see #setUnrecoverableWriteOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_UnrecoverableWriteOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getUnrecoverableWriteOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getUnrecoverableWriteOperations <em>Unrecoverable Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unrecoverable Write Operations</em>' attribute.
	 * @see #getUnrecoverableWriteOperations()
	 * @generated
	 */
	void setUnrecoverableWriteOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Recovered Read Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of recovered read operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovered Read Operations</em>' attribute.
	 * @see #setRecoveredReadOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_RecoveredReadOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRecoveredReadOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getRecoveredReadOperations <em>Recovered Read Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovered Read Operations</em>' attribute.
	 * @see #getRecoveredReadOperations()
	 * @generated
	 */
	void setRecoveredReadOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Recovered Write Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of recovered write operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovered Write Operations</em>' attribute.
	 * @see #setRecoveredWriteOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_RecoveredWriteOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRecoveredWriteOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getRecoveredWriteOperations <em>Recovered Write Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovered Write Operations</em>' attribute.
	 * @see #getRecoveredWriteOperations()
	 * @generated
	 */
	void setRecoveredWriteOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Recovered Seek Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of recovered seek operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovered Seek Operations</em>' attribute.
	 * @see #setRecoveredSeekOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_RecoveredSeekOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRecoveredSeekOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getRecoveredSeekOperations <em>Recovered Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovered Seek Operations</em>' attribute.
	 * @see #getRecoveredSeekOperations()
	 * @generated
	 */
	void setRecoveredSeekOperations(Long value);

	/**
	 * Returns the value of the '<em><b>Unrecoverable Seek Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of unrecoverable seek operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unrecoverable Seek Operations</em>' attribute.
	 * @see #setUnrecoverableSeekOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatData_UnrecoverableSeekOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getUnrecoverableSeekOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatData#getUnrecoverableSeekOperations <em>Unrecoverable Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unrecoverable Seek Operations</em>' attribute.
	 * @see #getUnrecoverableSeekOperations()
	 * @generated
	 */
	void setUnrecoverableSeekOperations(Long value);

} // CIM_MediaAccessStatData
