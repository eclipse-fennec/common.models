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
 * A representation of the model object '<em><b>CIM Switch Port Source Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A switch capable of source routing maintains source-routing specific information about each port. This association represents that information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getHopCount <em>Hop Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getLocalSegment <em>Local Segment</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getBridgeNum <em>Bridge Num</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getTargetSegment <em>Target Segment</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getSTESpanMode <em>STE Span Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRouting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_SwitchPort REF' override.Antecedent.Description='The SwitchPort.' override.Dependent='CIM_SourceRoutingService REF' override.Dependent.Max='1' override.Dependent.Description='The SourceRoutingService.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortSourceRouting extends CIM_ServiceSAPDependency {
	/**
	 * Returns the value of the '<em><b>Hop Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of routing descriptors allowed in an All Paths or Spanning Tree Explorer frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hop Count</em>' attribute.
	 * @see #setHopCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRouting_HopCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortHopCount\"]'"
	 * @generated
	 */
	Integer getHopCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getHopCount <em>Hop Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hop Count</em>' attribute.
	 * @see #getHopCount()
	 * @generated
	 */
	void setHopCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Local Segment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The segment number that uniquely identifies the segment to which this port is connected. Current source routing protocols limit this value to the range: 0 through 4095. (The value 0 is used by some management applications for special test cases.) A value of 65535 signifies that no segment number is assigned to this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Segment</em>' attribute.
	 * @see #setLocalSegment(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRouting_LocalSegment()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortLocalSegment\"]'"
	 * @generated
	 */
	Integer getLocalSegment();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getLocalSegment <em>Local Segment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Segment</em>' attribute.
	 * @see #getLocalSegment()
	 * @generated
	 */
	void setLocalSegment(Integer value);

	/**
	 * Returns the value of the '<em><b>Bridge Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bridge number uniquely identifies a bridge when more than one bridge is used to span the same two segments. Current source routing protocols limit this value to the range: 0 through 15. A value of 65535 signifies that no bridge number is assigned to this bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Num</em>' attribute.
	 * @see #setBridgeNum(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRouting_BridgeNum()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortBridgeNum\"]'"
	 * @generated
	 */
	Integer getBridgeNum();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getBridgeNum <em>Bridge Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Num</em>' attribute.
	 * @see #getBridgeNum()
	 * @generated
	 */
	void setBridgeNum(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Segment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The segment number that corresponds to the target segment to which this port is considered connected. Current source routing protocols limit this value to the range: 0 through 4095. (The value 0 is used by some management applications for special test cases.) A value of 65535 signifies that no target segment is assigned to this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Segment</em>' attribute.
	 * @see #setTargetSegment(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRouting_TargetSegment()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortTargetSegment\"]'"
	 * @generated
	 */
	Integer getTargetSegment();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getTargetSegment <em>Target Segment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Segment</em>' attribute.
	 * @see #getTargetSegment()
	 * @generated
	 */
	void setTargetSegment(Integer value);

	/**
	 * Returns the value of the '<em><b>STE Span Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines how the port behaves when presented with a Spanning Tree Explorer frame. The value 'disabled(2)' indicates that the port will not accept or send Spanning Tree Explorer packets; any STE packets received will be silently discarded. The value 'forced(3)' indicates the port will always accept and propagate Spanning Tree Explorer frames. (This allows a manually configured Spanning Tree for this class of packet to be configured.) Note that unlike transparent bridging, it is not catastrophic to the network if there are loops. The value 'auto-span(1)' can only be returned by a bridge that both implements the Spanning Tree Protocol and has use of the protocol enabled on this port. 
	 * 
	 * The behavior of the port for Spanning Tree Explorer frames is determined by the value of the State property of the SwitchPortSpanningTree association for the port. If the port is in the 'forwarding' state, the frame will be accepted or propagated. Otherwise, it will be silently discarded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>STE Span Mode</em>' attribute.
	 * @see #setSTESpanMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSourceRouting_STESpanMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Auto-Span\",\"Disabled\",\"Forced\"]' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dSrPortSTESpanMod\"]' ModelCorrespondence='[\"CIM_SwitchPortSpanningTree.State\"]'"
	 * @generated
	 */
	Integer getSTESpanMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSourceRouting#getSTESpanMode <em>STE Span Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STE Span Mode</em>' attribute.
	 * @see #getSTESpanMode()
	 * @generated
	 */
	void setSTESpanMode(Integer value);

} // CIM_SwitchPortSourceRouting
