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
 * A representation of the model object '<em><b>CIM File System Statistics Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialization of the StatisticsCapabilities class that describes the capabilities of a FileSystemStatisticsService, which provides statistical data for instances of FileSystemStatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsCapabilities#getClockTickInterval <em>Clock Tick Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileStatistics' override.ElementTypesSupported='uint16[]' override.ElementTypesSupported.Required='true' override.ElementTypesSupported.Description='The list of element types for which statistical data is available. The values of this array correspond to the values defined for the ElementType property of the FileSystemStatisticalData class.' override.ElementTypesSupported.ValueMap='[\"1\",\"102\",\"103\",\"104\",\"..\",\"0x8000..\"]' override.ElementTypesSupported.Values='[\"Other\",\"Local Filesystem\",\"Exported File Share\",\"Exporting Port\",\"DMTF Reserved\",\"Vendor Specific\"]' override.SynchronousMethodsSupported='uint16[]' override.SynchronousMethodsSupported.Description='The synchronous mechanisms supported for retrieving statistics and defining and modifying filters for statistics retrieval.' override.SynchronousMethodsSupported.ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' override.SynchronousMethodsSupported.Values='[\"Execute Query\",\"Indications\",\"Query Collection\",\"GetStatisticsCollection\",\"Manifest Creation\",\"Manifest Modification\",\"Manifest Removal\",\"DMTF Reserved\",\"Vendor Specific\"]' override.AsynchronousMethodsSupported='uint16[]' override.AsynchronousMethodsSupported.Description='The asynchronous mechanisms supported for retrieving statistics.' override.AsynchronousMethodsSupported.ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' override.AsynchronousMethodsSupported.Values='[\"GetStatisticsCollection\",\"Indications\",\"DMTF Reserved\",\"Vendor Specific\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemStatisticsCapabilities extends CIM_StatisticsCapabilities {
	/**
	 * Returns the value of the '<em><b>Clock Tick Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal clocking interval for all timers in the subsystem, measured in microseconds (Unit of measure in the timers, measured in microseconds). Time counters are monotanically increasing counters that contain 'ticks'. Each tick represents one ClockTickInterval. If ClockTickInterval contained a value of 32, then each time counter tick would represent 32 microseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Tick Interval</em>' attribute.
	 * @see #setClockTickInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsCapabilities_ClockTickInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MicroSeconds'"
	 * @generated
	 */
	Long getClockTickInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsCapabilities#getClockTickInterval <em>Clock Tick Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Tick Interval</em>' attribute.
	 * @see #getClockTickInterval()
	 * @generated
	 */
	void setClockTickInterval(Long value);

} // CIM_FileSystemStatisticsCapabilities
