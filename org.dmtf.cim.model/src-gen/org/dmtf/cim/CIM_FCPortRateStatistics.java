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
 * A representation of the model object '<em><b>CIM FC Port Rate Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FCPortRateStatistics is the performance rate for the FCPort. The Frame and Byte rates report the average of a counter change per second and the maximum counter change per second over a specified interval, the SampleInterval, which is defined in the parent class, StatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getTxFrameRate <em>Tx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getRxFrameRate <em>Rx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getMaxTxFrameRate <em>Max Tx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getMaxRxFrameRate <em>Max Rx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getTxRate <em>Tx Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getRxRate <em>Rx Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getPeakTxRate <em>Peak Tx Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortRateStatistics#getPeakRxRate <em>Peak Rx Rate</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::FC' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCPortRateStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Tx Frame Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TxFrameRate is the instantaneous transmit frame rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Frame Rate</em>' attribute.
	 * @see #setTxFrameRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_TxFrameRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1.SWAPI_STATS_LBL_TFRR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getTxFrameRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getTxFrameRate <em>Tx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Frame Rate</em>' attribute.
	 * @see #getTxFrameRate()
	 * @generated
	 */
	void setTxFrameRate(Long value);

	/**
	 * Returns the value of the '<em><b>Rx Frame Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RxFrameRate is the instantaneous receive frame rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Frame Rate</em>' attribute.
	 * @see #setRxFrameRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_RxFrameRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1.SWAPI_STATS_LBL_RFRR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getRxFrameRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getRxFrameRate <em>Rx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx Frame Rate</em>' attribute.
	 * @see #getRxFrameRate()
	 * @generated
	 */
	void setRxFrameRate(Long value);

	/**
	 * Returns the value of the '<em><b>Max Tx Frame Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxTxFrameRate is the maximum transmit frame rate achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Tx Frame Rate</em>' attribute.
	 * @see #setMaxTxFrameRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_MaxTxFrameRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1.SWAPI_STATS_LBL_TFPR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getMaxTxFrameRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getMaxTxFrameRate <em>Max Tx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Tx Frame Rate</em>' attribute.
	 * @see #getMaxTxFrameRate()
	 * @generated
	 */
	void setMaxTxFrameRate(Long value);

	/**
	 * Returns the value of the '<em><b>Max Rx Frame Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxRxFrameRate is the maximum receive frame rate achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Rx Frame Rate</em>' attribute.
	 * @see #setMaxRxFrameRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_MaxRxFrameRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1.SWAPI_STATS_LBL_RFPR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getMaxRxFrameRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getMaxRxFrameRate <em>Max Rx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Rx Frame Rate</em>' attribute.
	 * @see #getMaxRxFrameRate()
	 * @generated
	 */
	void setMaxRxFrameRate(Long value);

	/**
	 * Returns the value of the '<em><b>Tx Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TxRate is the instantaneous transmit byte rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Rate</em>' attribute.
	 * @see #setTxRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_TxRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1. SWAPI_STATS_LBL_TBYR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getTxRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getTxRate <em>Tx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Rate</em>' attribute.
	 * @see #getTxRate()
	 * @generated
	 */
	void setTxRate(Long value);

	/**
	 * Returns the value of the '<em><b>Rx Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RxRate is the instantaneous receive byte rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rx Rate</em>' attribute.
	 * @see #setRxRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_RxRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1.SWAPI_STATS_LBL_RBYR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getRxRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getRxRate <em>Rx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx Rate</em>' attribute.
	 * @see #getRxRate()
	 * @generated
	 */
	void setRxRate(Long value);

	/**
	 * Returns the value of the '<em><b>Peak Tx Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PeakTxRate is the maximum transmit byte rate achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peak Tx Rate</em>' attribute.
	 * @see #setPeakTxRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_PeakTxRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1. SWAPI_STATS_LBL_TBPR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getPeakTxRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getPeakTxRate <em>Peak Tx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Tx Rate</em>' attribute.
	 * @see #getPeakTxRate()
	 * @generated
	 */
	void setPeakTxRate(Long value);

	/**
	 * Returns the value of the '<em><b>Peak Rx Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PeakRxRate is the maximum receive byte rate achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peak Rx Rate</em>' attribute.
	 * @see #setPeakRxRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortRateStatistics_PeakRxRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"FC-SWAPI.T11|PerformanceRates|1. SWAPI_STATS_LBL_RBPR\"]' ModelCorrespondence='[\"CIM_StatisticalData.SampleInterval\"]'"
	 * @generated
	 */
	Long getPeakRxRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortRateStatistics#getPeakRxRate <em>Peak Rx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Rx Rate</em>' attribute.
	 * @see #getPeakRxRate()
	 * @generated
	 */
	void setPeakRxRate(Long value);

} // CIM_FCPortRateStatistics
