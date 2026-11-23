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
 * A representation of the model object '<em><b>CIM Block Statistics Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialization of the StatisticsCapabilities class that describes the capabilities of a BlockStatisticsService, which provides statistical data for instances of BlockStatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsCapabilities#getClockTickInterval <em>Clock Tick Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsCapabilities#getElementTypeFeatures <em>Element Type Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsCapabilities#getRateElementTypesSupported <em>Rate Element Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsCapabilities#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' override.ElementTypesSupported='uint16[]' override.ElementTypesSupported.Required='true' override.ElementTypesSupported.Description='The list of element types for which statistical data is available. The values of this array correspond to the values defined for the ElementType property of the BlockStatisticalData class.' override.ElementTypesSupported.ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..\"]' override.ElementTypesSupported.Values='[\"Unknown\",\"Computer System\",\"Front-end Computer System\",\"Peer Computer System\",\"Back-end Computer System\",\"Front-end Port\",\"Back-end Port\",\"Volume\",\"Extent\",\"Disk Drive\",\"Arbitrary LUs\",\"Remote Replica Group\",\"DMTF Reserved\",\"Vendor Specific\"]' override.SynchronousMethodsSupported='uint16[]' override.SynchronousMethodsSupported.Description='The synchronous mechanisms supported for retrieving statistics and defining and modifying filters for statistics retrieval.' override.SynchronousMethodsSupported.ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' override.SynchronousMethodsSupported.Values='[\"Execute Query\",\"Query Collection\",\"GetStatisticsCollection\",\"Manifest Creation\",\"Manifest Modification\",\"Manifest Removal\",\"GetRateStatisticsCollection\",\"DMTF Reserved\",\"Vendor Specific\"]' override.AsynchronousMethodsSupported='uint16[]' override.AsynchronousMethodsSupported.Description='The asychronous mechanisms supported for retrieving statistics.' override.AsynchronousMethodsSupported.ValueMap='[\"2\",\"3\",\"8\",\"..\",\"0x8000..\"]' override.AsynchronousMethodsSupported.Values='[\"GetStatisticsCollection\",\"Indications\",\"GetRateStatisticsCollection\",\"DMTF Reserved\",\"Vendor Specific\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BlockStatisticsCapabilities extends CIM_StatisticsCapabilities {
	/**
	 * Returns the value of the '<em><b>Clock Tick Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal clocking interval for all timers in the subsystem, measured in microseconds (Unit of measure in the timers, measured in microseconds). Time counters are monotanically increasing counters that contain 'ticks'. Each tick represents one ClockTickInterval. If ClockTickInterval contained a value of 32 then each time counter tick would represent 32 microseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Tick Interval</em>' attribute.
	 * @see #setClockTickInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsCapabilities_ClockTickInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MicroSeconds' PUnit='second * 10^-6'"
	 * @generated
	 */
	Long getClockTickInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsCapabilities#getClockTickInterval <em>Clock Tick Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Tick Interval</em>' attribute.
	 * @see #getClockTickInterval()
	 * @generated
	 */
	void setClockTickInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Element Type Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementTypeFeatures allows a provider to advertise specific sets of ElementTypes supported by the implementation.
	 * "3" indicates that any one or more of the ElementTypes in ElementTypesSupported is supported.
	 * "4" indicates that ElementTypes "6" (Front-end Port) and "8" (Volume) are supported.
	 * "5" indicates that ElementTypes "8" (Volume) and "10" (Disk Drive) are supported.
	 * "6" indicates that ElementTypes "6" (Front-end Port) and "10" (Disk Drive) are supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsCapabilities_ElementTypeFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"3\",\"4\",\"5\",\"6\"]' Values='[\"Any one\",\"Front-end Port &amp; Volume\",\"Volume &amp; Disk Drive\",\"Front-end Port &amp; Disk Drive\"]' ModelCorrespondence='[\"CIM_BlockStatisticsCapabilities.ElementTypesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getElementTypeFeatures();

	/**
	 * Returns the value of the '<em><b>Rate Element Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of element types for which statistical data is available. The values of this array correspond to the values defined for the RateElementType property of the BlockStatisticalData class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Element Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsCapabilities_RateElementTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Computer System Rate\",\"Front-end Computer System Rate\",\"Peer Computer System Rate\",\"Back-end Computer System Rate\",\"Front-end Port Rate\",\"Back-end Port Rate\",\"Volume Rate\",\"Extent Rate\",\"Disk Drive Rate\",\"Arbitrary LUs Rate\",\"Remote Replica Group Rate\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getRateElementTypesSupported();

	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedFeatures is an array identifying features supported by the implementation. The valid values are "2" (none), "3" (Client Defined Sequence), "4" (Client Defined Rate Sequence), "5" (Rated Data) and "6" (Advanced).
	 * If "2" is specified, then no other entry may be included. 
	 * If "3" is specified, it indicates client may define, in the manifest, the sequence in which the requested properties are returned. 
	 * "4" is the same as "3", except that it covers the rated data.
	 * If "5" is specified, it indicates that the provider supports rated data properties.
	 * If "6" is specified, it indicates that advanced metric requirements apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsCapabilities_SupportedFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"none\",\"Client Defined Sequence\",\"Client Defined Rate Sequence\",\"Rated Data\",\"Advanced Metrics\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_BlockStatisticsManifest.CSVSequence\",\"CIM_BlockStatisticsManifest.CSVRateSequence\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedFeatures();

} // CIM_BlockStatisticsCapabilities
