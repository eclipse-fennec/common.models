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
 * A representation of the model object '<em><b>CIM Statistics Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of SystemSpecificCollection which collects together statistics for a system. This class forms an 'anchor point' from which all the statistics kept for the system can be found (via the MemberOfCollection associations).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StatisticsCollection#getSampleInterval <em>Sample Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticsCollection#getTimeLastSampled <em>Time Last Sampled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.1000' UMLPackagePath='CIM::Core::Statistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StatisticsCollection extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Sample Interval</b></em>' attribute.
	 * The default value is <code>"00000000000000.000000:000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides the minimum sampling interval for the associated statistics so that client applications can determine the minimum interval that the StatisticsCollection should be sampled. If the statistics are sampled at different cycles, this property MUST be set to a zero time interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample Interval</em>' attribute.
	 * @see #setSampleInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCollection_SampleInterval()
	 * @model default="00000000000000.000000:000"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getSampleInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticsCollection#getSampleInterval <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Interval</em>' attribute.
	 * @see #getSampleInterval()
	 * @generated
	 */
	void setSampleInterval(String value);

	/**
	 * Returns the value of the '<em><b>Time Last Sampled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the statistics collection was last sampled. Note that this property MAY be used to trigger an indication for 'push' delivery of statistics samples.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Last Sampled</em>' attribute.
	 * @see #setTimeLastSampled(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCollection_TimeLastSampled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeLastSampled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StatisticsCollection#getTimeLastSampled <em>Time Last Sampled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Last Sampled</em>' attribute.
	 * @see #getTimeLastSampled()
	 * @generated
	 */
	void setTimeLastSampled(String value);

} // CIM_StatisticsCollection
