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
 * A representation of the model object '<em><b>CIM Ethernet Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EthernetPortStatistics class describes the statistics for the EthernetPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getSymbolErrors <em>Symbol Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getAlignmentErrors <em>Alignment Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getFCSErrors <em>FCS Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getSingleCollisionFrames <em>Single Collision Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getMultipleCollisionFrames <em>Multiple Collision Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getSQETestErrors <em>SQE Test Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getDeferredTransmissions <em>Deferred Transmissions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getLateCollisions <em>Late Collisions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getExcessiveCollisions <em>Excessive Collisions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getInternalMACTransmitErrors <em>Internal MAC Transmit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getInternalMACReceiveErrors <em>Internal MAC Receive Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getCarrierSenseErrors <em>Carrier Sense Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortStatistics#getFrameTooLongs <em>Frame Too Longs</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Ports' override.PacketsTransmitted='uint64' override.PacketsTransmitted.Description='The total number of packets that are transmitted.' override.PacketsTransmitted.Counter='true' override.PacketsTransmitted.MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.6\"]' override.PacketsReceived='uint64' override.PacketsReceived.Description='The total number of packets that are received.' override.PacketsReceived.Counter='true' override.PacketsReceived.MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.8\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_EthernetPortStatistics extends CIM_NetworkPortStatistics {
	/**
	 * Returns the value of the '<em><b>Symbol Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that there was an invalid data symbol when a valid carrier was present. The count can be incremented only once per carrier event, even if multiple symbol errors occur during the carrier event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol Errors</em>' attribute.
	 * @see #setSymbolErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_SymbolErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsSymbolErrors\"]'"
	 * @generated
	 */
	Long getSymbolErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getSymbolErrors <em>Symbol Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Errors</em>' attribute.
	 * @see #getSymbolErrors()
	 * @generated
	 */
	void setSymbolErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Alignment Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames that are received on a particular interface that are not an integral number of octets in length and do not pass the FCS check. The count represented by an instance of this object is incremented when the alignment error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment Errors</em>' attribute.
	 * @see #setAlignmentErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_AlignmentErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsAlignmentErrors\"]'"
	 * @generated
	 */
	Long getAlignmentErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getAlignmentErrors <em>Alignment Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment Errors</em>' attribute.
	 * @see #getAlignmentErrors()
	 * @generated
	 */
	void setAlignmentErrors(Long value);

	/**
	 * Returns the value of the '<em><b>FCS Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames that are received on a particular interface that are an integral number of octets in length, but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame check error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of the error status presented to the LLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FCS Errors</em>' attribute.
	 * @see #setFCSErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_FCSErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsFCSErrors\"]'"
	 * @generated
	 */
	Long getFCSErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getFCSErrors <em>FCS Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCS Errors</em>' attribute.
	 * @see #getFCSErrors()
	 * @generated
	 */
	void setFCSErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Single Collision Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Collision Frames</em>' attribute.
	 * @see #setSingleCollisionFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_SingleCollisionFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsSingleCollisionFrames\"]'"
	 * @generated
	 */
	Long getSingleCollisionFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getSingleCollisionFrames <em>Single Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Collision Frames</em>' attribute.
	 * @see #getSingleCollisionFrames()
	 * @generated
	 */
	void setSingleCollisionFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Multiple Collision Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Collision Frames</em>' attribute.
	 * @see #setMultipleCollisionFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_MultipleCollisionFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsMultipleCollisionFrames\"]'"
	 * @generated
	 */
	Long getMultipleCollisionFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getMultipleCollisionFrames <em>Multiple Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Collision Frames</em>' attribute.
	 * @see #getMultipleCollisionFrames()
	 * @generated
	 */
	void setMultipleCollisionFrames(Long value);

	/**
	 * Returns the value of the '<em><b>SQE Test Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SQE Test Errors</em>' attribute.
	 * @see #setSQETestErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_SQETestErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsSQETestErrors\"]'"
	 * @generated
	 */
	Long getSQETestErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getSQETestErrors <em>SQE Test Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQE Test Errors</em>' attribute.
	 * @see #getSQETestErrors()
	 * @generated
	 */
	void setSQETestErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Deferred Transmissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include frames involved in collisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deferred Transmissions</em>' attribute.
	 * @see #setDeferredTransmissions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_DeferredTransmissions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsDeferredTransmissions\"]'"
	 * @generated
	 */
	Long getDeferredTransmissions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getDeferredTransmissions <em>Deferred Transmissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferred Transmissions</em>' attribute.
	 * @see #getDeferredTransmissions()
	 * @generated
	 */
	void setDeferredTransmissions(Long value);

	/**
	 * Returns the value of the '<em><b>Late Collisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit- times corresponds to 51.2 microseconds on a 10 Mbit/s system. A (late) collision included in a count represented by an instance of this object is also considered as a (generic) collision for purposes of other collision-related statistics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Late Collisions</em>' attribute.
	 * @see #setLateCollisions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_LateCollisions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsLateCollisions\"]'"
	 * @generated
	 */
	Long getLateCollisions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getLateCollisions <em>Late Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Collisions</em>' attribute.
	 * @see #getLateCollisions()
	 * @generated
	 */
	void setLateCollisions(Long value);

	/**
	 * Returns the value of the '<em><b>Excessive Collisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames for which transmission on a particular interface fails due to excessive collisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excessive Collisions</em>' attribute.
	 * @see #setExcessiveCollisions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_ExcessiveCollisions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsExcessiveCollisions\"]'"
	 * @generated
	 */
	Long getExcessiveCollisions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getExcessiveCollisions <em>Excessive Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excessive Collisions</em>' attribute.
	 * @see #getExcessiveCollisions()
	 * @generated
	 */
	void setExcessiveCollisions(Long value);

	/**
	 * Returns the value of the '<em><b>Internal MAC Transmit Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of either the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count that is represented by an instance of this object is implementation-specific. In particular, an instance of this object can represent a count of transmission errors on a particular interface that are not otherwise counted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal MAC Transmit Errors</em>' attribute.
	 * @see #setInternalMACTransmitErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_InternalMACTransmitErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsInternalMacTransmitErrors\"]'"
	 * @generated
	 */
	Long getInternalMACTransmitErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getInternalMACTransmitErrors <em>Internal MAC Transmit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal MAC Transmit Errors</em>' attribute.
	 * @see #getInternalMACTransmitErrors()
	 * @generated
	 */
	void setInternalMACTransmitErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Internal MAC Receive Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of either the FrameTooLongs property, the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count that is represented by an instance of this object is implementation-specific. For example, an instance of this object can represent a count of receive errors on a particular interface that are not otherwise counted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal MAC Receive Errors</em>' attribute.
	 * @see #setInternalMACReceiveErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_InternalMACReceiveErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsInternalMacReceiveErrors\"]'"
	 * @generated
	 */
	Long getInternalMACReceiveErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getInternalMACReceiveErrors <em>Internal MAC Receive Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal MAC Receive Errors</em>' attribute.
	 * @see #getInternalMACReceiveErrors()
	 * @generated
	 */
	void setInternalMACReceiveErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Carrier Sense Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object can be incremented only once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Sense Errors</em>' attribute.
	 * @see #setCarrierSenseErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_CarrierSenseErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsCarrierSenseErrors\"]'"
	 * @generated
	 */
	Long getCarrierSenseErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getCarrierSenseErrors <em>Carrier Sense Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Sense Errors</em>' attribute.
	 * @see #getCarrierSenseErrors()
	 * @generated
	 */
	void setCarrierSenseErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Frame Too Longs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames received on a particular interface that exceed the maximum permitted frame size. The count represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Too Longs</em>' attribute.
	 * @see #setFrameTooLongs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortStatistics_FrameTooLongs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsFrameTooLongs\"]'"
	 * @generated
	 */
	Long getFrameTooLongs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortStatistics#getFrameTooLongs <em>Frame Too Longs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Too Longs</em>' attribute.
	 * @see #getFrameTooLongs()
	 * @generated
	 */
	void setFrameTooLongs(Long value);

} // CIM_EthernetPortStatistics
