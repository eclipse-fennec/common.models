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
 * A representation of the model object '<em><b>CIM Switch Port Source Routing Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistical information regarding a SwitchPort supporting source routing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSpecInFrames <em>Spec In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSpecOutFrames <em>Spec Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getApeInFrames <em>Ape In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getApeOutFrames <em>Ape Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSteInFrames <em>Ste In Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSteOutFrames <em>Ste Out Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSegmentMismatchDiscards <em>Segment Mismatch Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getDuplicateSegmentDiscards <em>Duplicate Segment Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getHopCountExceedsDiscards <em>Hop Count Exceeds Discards</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getDupLanIdOrTreeErrors <em>Dup Lan Id Or Tree Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getLanIdMismatches <em>Lan Id Mismatches</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,SAPCreationClassName,SAPName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortSourceRoutingStatistics extends CIM_SAPStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>Spec In Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of Specifically Routed frames, also referred to as Source Routed Frames, that have been received from the segment attached to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec In Frames</em>' attribute.
	 * @see #setSpecInFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_SpecInFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortSpecInFrames\"]'"
	 * @generated
	 */
	Long getSpecInFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSpecInFrames <em>Spec In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec In Frames</em>' attribute.
	 * @see #getSpecInFrames()
	 * @generated
	 */
	void setSpecInFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Spec Out Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of Specifically Routed frames, also referred to as Source Routed Frames, that the port has transmitted on its segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec Out Frames</em>' attribute.
	 * @see #setSpecOutFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_SpecOutFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortSpecOutFrames\"]'"
	 * @generated
	 */
	Long getSpecOutFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSpecOutFrames <em>Spec Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Out Frames</em>' attribute.
	 * @see #getSpecOutFrames()
	 * @generated
	 */
	void setSpecOutFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Ape In Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of All Paths Explorer frames, also referred to as All Routes Explorer frames, that have been received by the port from its segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ape In Frames</em>' attribute.
	 * @see #setApeInFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_ApeInFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortApeInFrames\"]'"
	 * @generated
	 */
	Long getApeInFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getApeInFrames <em>Ape In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ape In Frames</em>' attribute.
	 * @see #getApeInFrames()
	 * @generated
	 */
	void setApeInFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Ape Out Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of all Paths Explorer Frames, also referred to as All Routes Explorer frames, that have been transmitted by the port on its segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ape Out Frames</em>' attribute.
	 * @see #setApeOutFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_ApeOutFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortApeOutFrames\"]'"
	 * @generated
	 */
	Long getApeOutFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getApeOutFrames <em>Ape Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ape Out Frames</em>' attribute.
	 * @see #getApeOutFrames()
	 * @generated
	 */
	void setApeOutFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Ste In Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of spanning tree explorer frames that have been received by the port from its segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ste In Frames</em>' attribute.
	 * @see #setSteInFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_SteInFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortSteInFrames\"]'"
	 * @generated
	 */
	Long getSteInFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSteInFrames <em>Ste In Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ste In Frames</em>' attribute.
	 * @see #getSteInFrames()
	 * @generated
	 */
	void setSteInFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Ste Out Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of spanning tree explorer frames that have been transmitted by the port on its segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ste Out Frames</em>' attribute.
	 * @see #setSteOutFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_SteOutFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortSteOutFrames\"]'"
	 * @generated
	 */
	Long getSteOutFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSteOutFrames <em>Ste Out Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ste Out Frames</em>' attribute.
	 * @see #getSteOutFrames()
	 * @generated
	 */
	void setSteOutFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Segment Mismatch Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of explorer frames that have been discarded by the port because the routing descriptor field contained an invalid adjacent segment value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment Mismatch Discards</em>' attribute.
	 * @see #setSegmentMismatchDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_SegmentMismatchDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortSegmentMismatchDiscards\"]'"
	 * @generated
	 */
	Long getSegmentMismatchDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getSegmentMismatchDiscards <em>Segment Mismatch Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Mismatch Discards</em>' attribute.
	 * @see #getSegmentMismatchDiscards()
	 * @generated
	 */
	void setSegmentMismatchDiscards(Long value);

	/**
	 * Returns the value of the '<em><b>Duplicate Segment Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames that have been discarded by the port because the routing descriptor field contained a duplicate segment identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duplicate Segment Discards</em>' attribute.
	 * @see #setDuplicateSegmentDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_DuplicateSegmentDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortDuplicateSegmentDiscards\"]'"
	 * @generated
	 */
	Long getDuplicateSegmentDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getDuplicateSegmentDiscards <em>Duplicate Segment Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicate Segment Discards</em>' attribute.
	 * @see #getDuplicateSegmentDiscards()
	 * @generated
	 */
	void setDuplicateSegmentDiscards(Long value);

	/**
	 * Returns the value of the '<em><b>Hop Count Exceeds Discards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of explorer frames that have been discarded by the port because the Routing Information Field has exceeded the maximum route descriptor length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hop Count Exceeds Discards</em>' attribute.
	 * @see #setHopCountExceedsDiscards(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_HopCountExceedsDiscards()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortHopCountExceedsDiscards\"]'"
	 * @generated
	 */
	Long getHopCountExceedsDiscards();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getHopCountExceedsDiscards <em>Hop Count Exceeds Discards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hop Count Exceeds Discards</em>' attribute.
	 * @see #getHopCountExceedsDiscards()
	 * @generated
	 */
	void setHopCountExceedsDiscards(Long value);

	/**
	 * Returns the value of the '<em><b>Dup Lan Id Or Tree Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of duplicate LAN IDs or Tree errors. This helps in detection of problems in networks containing older Source Routing Bridges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dup Lan Id Or Tree Errors</em>' attribute.
	 * @see #setDupLanIdOrTreeErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_DupLanIdOrTreeErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortDupLanIdOrTreeErrors\"]'"
	 * @generated
	 */
	Long getDupLanIdOrTreeErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getDupLanIdOrTreeErrors <em>Dup Lan Id Or Tree Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dup Lan Id Or Tree Errors</em>' attribute.
	 * @see #getDupLanIdOrTreeErrors()
	 * @generated
	 */
	void setDupLanIdOrTreeErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Lan Id Mismatches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of ARE and STE frames that were discarded because the last LAN ID in the routing information field did not equal the LAN-in ID. This error can occur in implementations which do only a LAN-in ID and Bridge Number check instead of a LAN-in ID, Bridge Number, and LAN-out ID check before they forward broadcast frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lan Id Mismatches</em>' attribute.
	 * @see #setLanIdMismatches(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRoutingStatistics_LanIdMismatches()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortLanIdMismatches\"]'"
	 * @generated
	 */
	Long getLanIdMismatches();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRoutingStatistics#getLanIdMismatches <em>Lan Id Mismatches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lan Id Mismatches</em>' attribute.
	 * @see #getLanIdMismatches()
	 * @generated
	 */
	void setLanIdMismatches(Long value);

} // CIM_SwitchPortSourceRoutingStatistics
