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
 * A representation of the model object '<em><b>CIM Media Access Stat Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. Although the same class is used to represent this data, at the instance level the object holds information for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). Note that this class models the same properties as MediaAccessStatData. The latter, however, uses the simplified key mechanisms of the StatisticalData class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getReadOperations <em>Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getUnrecoverableReadOperations <em>Unrecoverable Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getWriteOperations <em>Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getUnrecoverableWriteOperations <em>Unrecoverable Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getRecoveredReadOperations <em>Recovered Read Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getRecoveredWriteOperations <em>Recovered Write Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getRecoveredSeekOperations <em>Recovered Seek Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getUnrecoverableSeekOperations <em>Unrecoverable Seek Operations</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageDevices' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MediaAccessStatInfo extends CIM_DeviceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Read Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of attempted read operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Operations</em>' attribute.
	 * @see #setReadOperations(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_ReadOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getReadOperations <em>Read Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_UnrecoverableReadOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getUnrecoverableReadOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getUnrecoverableReadOperations <em>Unrecoverable Read Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_WriteOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getWriteOperations <em>Write Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_UnrecoverableWriteOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getUnrecoverableWriteOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getUnrecoverableWriteOperations <em>Unrecoverable Write Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_RecoveredReadOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRecoveredReadOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getRecoveredReadOperations <em>Recovered Read Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_RecoveredWriteOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRecoveredWriteOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getRecoveredWriteOperations <em>Recovered Write Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_RecoveredSeekOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRecoveredSeekOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getRecoveredSeekOperations <em>Recovered Seek Operations</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaAccessStatInfo_UnrecoverableSeekOperations()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getUnrecoverableSeekOperations();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaAccessStatInfo#getUnrecoverableSeekOperations <em>Unrecoverable Seek Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unrecoverable Seek Operations</em>' attribute.
	 * @see #getUnrecoverableSeekOperations()
	 * @generated
	 */
	void setUnrecoverableSeekOperations(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-2 and 5 reset the 'read operation'-related counters, 3-4 and 6 reset the 'write operation'-related counters, and 7-8 reset the seek-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation can also reset its internal processing and counters. 
	 * In a subclass, the set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can be specified as a Values array qualifier.
	 * @param SelectedCounter The counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"All\",\"Read Operations\",\"Unrecoverable Read Operations\",\"Write Operations\",\"Unrecoverable Write Operations\",\"Recovered Read Operations\",\"Recovered Write Operations\",\"Recovered Seeks\",\"Unrecoverable Seeks\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_MediaAccessStatInfo
