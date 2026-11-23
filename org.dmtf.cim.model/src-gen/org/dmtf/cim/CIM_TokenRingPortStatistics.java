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
 * A representation of the model object '<em><b>CIM Token Ring Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TokenRingPortStatistics class describes the statistics for the TokenRingPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getBurstErrors <em>Burst Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getACErrors <em>AC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getAbortTransErrors <em>Abort Trans Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getInternalErrors <em>Internal Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getLostFrameErrors <em>Lost Frame Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getReceiveCongestions <em>Receive Congestions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getFrameCopiedErrors <em>Frame Copied Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getTokenErrors <em>Token Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getSoftErrors <em>Soft Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getHardErrors <em>Hard Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getSignalLossCount <em>Signal Loss Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getTransmittedBeacons <em>Transmitted Beacons</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getRecoverys <em>Recoverys</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getLobeWires <em>Lobe Wires</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getRemoves <em>Removes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getSingles <em>Singles</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getFrequencyErrors <em>Frequency Errors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TokenRingPortStatistics extends CIM_NetworkPortStatistics {
	/**
	 * Returns the value of the '<em><b>Burst Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Burst Errors</em>' attribute.
	 * @see #setBurstErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_BurstErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsBurstErrors\"]'"
	 * @generated
	 */
	Long getBurstErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getBurstErrors <em>Burst Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Errors</em>' attribute.
	 * @see #getBurstErrors()
	 * @generated
	 */
	void setBurstErrors(Long value);

	/**
	 * Returns the value of the '<em><b>AC Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C and C is equal to 0, and then receives another SMP frame with A equal to C and C equal to 0 without first receiving an AMP frame. This condition indicates a station that cannot set the AC bits properly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AC Errors</em>' attribute.
	 * @see #setACErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_ACErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsACErrors\"]'"
	 * @generated
	 */
	Long getACErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getACErrors <em>AC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AC Errors</em>' attribute.
	 * @see #getACErrors()
	 * @generated
	 */
	void setACErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Abort Trans Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station transmits an abort delimiter while transmitting data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abort Trans Errors</em>' attribute.
	 * @see #setAbortTransErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_AbortTransErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsAbortTransErrors\"]'"
	 * @generated
	 */
	Long getAbortTransErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getAbortTransErrors <em>Abort Trans Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abort Trans Errors</em>' attribute.
	 * @see #getAbortTransErrors()
	 * @generated
	 */
	void setAbortTransErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Internal Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station recognizes an internal error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Errors</em>' attribute.
	 * @see #setInternalErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_InternalErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsInternalErrors\"]'"
	 * @generated
	 */
	Long getInternalErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getInternalErrors <em>Internal Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Errors</em>' attribute.
	 * @see #getInternalErrors()
	 * @generated
	 */
	void setInternalErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Lost Frame Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station is transmitting and its TRR timer expires. This condition indicates where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lost Frame Errors</em>' attribute.
	 * @see #setLostFrameErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_LostFrameErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsLostFrameErrors\"]'"
	 * @generated
	 */
	Long getLostFrameErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getLostFrameErrors <em>Lost Frame Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lost Frame Errors</em>' attribute.
	 * @see #getLostFrameErrors()
	 * @generated
	 */
	void setLostFrameErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Receive Congestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station recognizes a frame addressed to its specific address but has no available buffer space, which indicates that the station is congested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Congestions</em>' attribute.
	 * @see #setReceiveCongestions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_ReceiveCongestions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsReceiveCongestions\"]'"
	 * @generated
	 */
	Long getReceiveCongestions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getReceiveCongestions <em>Receive Congestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Congestions</em>' attribute.
	 * @see #getReceiveCongestions()
	 * @generated
	 */
	void setReceiveCongestions(Long value);

	/**
	 * Returns the value of the '<em><b>Frame Copied Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1, which indicates a possible line hit or duplicate address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Copied Errors</em>' attribute.
	 * @see #setFrameCopiedErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_FrameCopiedErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsFrameCopiedErrors\"]'"
	 * @generated
	 */
	Long getFrameCopiedErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getFrameCopiedErrors <em>Frame Copied Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Copied Errors</em>' attribute.
	 * @see #getFrameCopiedErrors()
	 * @generated
	 */
	void setFrameCopiedErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Token Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Token Errors</em>' attribute.
	 * @see #setTokenErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_TokenErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsTokenErrors\"]'"
	 * @generated
	 */
	Long getTokenErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getTokenErrors <em>Token Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Errors</em>' attribute.
	 * @see #getTokenErrors()
	 * @generated
	 */
	void setTokenErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Soft Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of Soft Errors that the Device has detected. This condition directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Errors</em>' attribute.
	 * @see #setSoftErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_SoftErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsSoftErrors\"]'"
	 * @generated
	 */
	Long getSoftErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getSoftErrors <em>Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Errors</em>' attribute.
	 * @see #getSoftErrors()
	 * @generated
	 */
	void setSoftErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Hard Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times this Device has detected an immediately recoverable fatal error. The number of times this Device is either transmitting or receiving beacon MAC frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hard Errors</em>' attribute.
	 * @see #setHardErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_HardErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsHardErrors\"]'"
	 * @generated
	 */
	Long getHardErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getHardErrors <em>Hard Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hard Errors</em>' attribute.
	 * @see #getHardErrors()
	 * @generated
	 */
	void setHardErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Signal Loss Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times this Device has detected the loss of a signal condition from the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Loss Count</em>' attribute.
	 * @see #setSignalLossCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_SignalLossCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsSignalLoss\"]'"
	 * @generated
	 */
	Long getSignalLossCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getSignalLossCount <em>Signal Loss Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Loss Count</em>' attribute.
	 * @see #getSignalLossCount()
	 * @generated
	 */
	void setSignalLossCount(Long value);

	/**
	 * Returns the value of the '<em><b>Transmitted Beacons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times this Device has transmitted a beacon frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmitted Beacons</em>' attribute.
	 * @see #setTransmittedBeacons(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_TransmittedBeacons()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsTransmitBeacons\"]'"
	 * @generated
	 */
	Long getTransmittedBeacons();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getTransmittedBeacons <em>Transmitted Beacons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmitted Beacons</em>' attribute.
	 * @see #getTransmittedBeacons()
	 * @generated
	 */
	void setTransmittedBeacons(Long value);

	/**
	 * Returns the value of the '<em><b>Recoverys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of Claim Token MAC frames that are received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times that the ring has been purged and is being recovered back into a normal operating state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recoverys</em>' attribute.
	 * @see #setRecoverys(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_Recoverys()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsRecoverys\"]'"
	 * @generated
	 */
	Long getRecoverys();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getRecoverys <em>Recoverys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recoverys</em>' attribute.
	 * @see #getRecoverys()
	 * @generated
	 */
	void setRecoverys(Long value);

	/**
	 * Returns the value of the '<em><b>Lobe Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the Device has detected an open or short circuit in the lobe data path. The port will be closed and RingState will signify this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lobe Wires</em>' attribute.
	 * @see #setLobeWires(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_LobeWires()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsLobeWires\"]'"
	 * @generated
	 */
	Long getLobeWires();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getLobeWires <em>Lobe Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobe Wires</em>' attribute.
	 * @see #getLobeWires()
	 * @generated
	 */
	void setLobeWires(Long value);

	/**
	 * Returns the value of the '<em><b>Removes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removes</em>' attribute.
	 * @see #setRemoves(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_Removes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsRemoves\"]'"
	 * @generated
	 */
	Long getRemoves();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getRemoves <em>Removes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removes</em>' attribute.
	 * @see #getRemoves()
	 * @generated
	 */
	void setRemoves(Long value);

	/**
	 * Returns the value of the '<em><b>Singles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the Device has sensed that it is the only station on the ring. This condition occurs if the Device is the first one up on a ring or if there is a hardware problem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Singles</em>' attribute.
	 * @see #setSingles(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_Singles()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsSingles\"]'"
	 * @generated
	 */
	Long getSingles();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getSingles <em>Singles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singles</em>' attribute.
	 * @see #getSingles()
	 * @generated
	 */
	void setSingles(Long value);

	/**
	 * Returns the value of the '<em><b>Frequency Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Errors</em>' attribute.
	 * @see #setFrequencyErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPortStatistics_FrequencyErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsFreqErrors\"]'"
	 * @generated
	 */
	Long getFrequencyErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPortStatistics#getFrequencyErrors <em>Frequency Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Errors</em>' attribute.
	 * @see #getFrequencyErrors()
	 * @generated
	 */
	void setFrequencyErrors(Long value);

} // CIM_TokenRingPortStatistics
