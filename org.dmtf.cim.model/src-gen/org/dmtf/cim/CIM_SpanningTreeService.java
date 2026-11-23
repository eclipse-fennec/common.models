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
 * A representation of the model object '<em><b>CIM Spanning Tree Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service class represents the capability of a switch to participate in the distributed construction of a spanning tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getProtocolSpec <em>Protocol Spec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getSpanningTreeBridgeAddress <em>Spanning Tree Bridge Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getDesignatedRoot <em>Designated Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getRootCost <em>Root Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getRootPort <em>Root Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getHelloTime <em>Hello Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getHoldTime <em>Hold Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getForwardDelay <em>Forward Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getBridgeMaxAge <em>Bridge Max Age</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getBridgeHelloTime <em>Bridge Hello Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SpanningTreeService#getBridgeForwardDelay <em>Bridge Forward Delay</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SpanningTreeService extends CIM_ForwardingService {
	/**
	 * Returns the value of the '<em><b>Protocol Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the spanning tree protocol used by the switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Spec</em>' attribute.
	 * @see #setProtocolSpec(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_ProtocolSpec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"DEC LB100\",\"IEEE 802d\"]' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpProtocolSpecification\"]'"
	 * @generated
	 */
	Integer getProtocolSpec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getProtocolSpec <em>Protocol Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Spec</em>' attribute.
	 * @see #getProtocolSpec()
	 * @generated
	 */
	void setProtocolSpec(Integer value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the priority bits are the first two octets of the 8-octet long Bridge ID. The other (last) 6 octets of the Bridge ID are given by the value of the Bridge Address. 
	 * 
	 * A priority that can be assigned to the switch for use in constructing the spanning tree. The unique identifier for a switch is constructed by concatenating the MAC address associated with the switch for spanning tree operations to the two-byte priority. Choice of the priority value influences election of the root bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPriority\"]'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Spanning Tree Bridge Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MAC address used by the spanning tree service when it must be uniquely identified. When concatenated with a SpanningTreeService Priority, a unique bridge identifier results. This property is defined for use of switches supporting multiple spanning tree services. 
	 * 
	 * Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spanning Tree Bridge Address</em>' attribute.
	 * @see #setSpanningTreeBridgeAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_SpanningTreeBridgeAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSpanningTreeBridgeAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getSpanningTreeBridgeAddress <em>Spanning Tree Bridge Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spanning Tree Bridge Address</em>' attribute.
	 * @see #getSpanningTreeBridgeAddress()
	 * @generated
	 */
	void setSpanningTreeBridgeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Designated Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The complete Bridge ID (Priority + MAC Address) of the root bridge. The format of the priority bits are the first two octets of the 8-octet long Bridge ID. Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designated Root</em>' attribute.
	 * @see #setDesignatedRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_DesignatedRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpDesignatedRoot\"]'"
	 * @generated
	 */
	String getDesignatedRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getDesignatedRoot <em>Designated Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Root</em>' attribute.
	 * @see #getDesignatedRoot()
	 * @generated
	 */
	void setDesignatedRoot(String value);

	/**
	 * Returns the value of the '<em><b>Root Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost of the path from the switch to the root.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Cost</em>' attribute.
	 * @see #setRootCost(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_RootCost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpRootCost\"]'"
	 * @generated
	 */
	Integer getRootCost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getRootCost <em>Root Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Cost</em>' attribute.
	 * @see #getRootCost()
	 * @generated
	 */
	void setRootCost(Integer value);

	/**
	 * Returns the value of the '<em><b>Root Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port number of the port having the lowest cost path to the root bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Port</em>' attribute.
	 * @see #setRootPort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_RootPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpRootPort\"]'"
	 * @generated
	 */
	Integer getRootPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getRootPort <em>Root Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Port</em>' attribute.
	 * @see #getRootPort()
	 * @generated
	 */
	void setRootPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value for the maximum age of Spanning Tree information before discard, as learned from the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Age</em>' attribute.
	 * @see #setMaxAge(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_MaxAge()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpMaxAge\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getMaxAge();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getMaxAge <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Age</em>' attribute.
	 * @see #getMaxAge()
	 * @generated
	 */
	void setMaxAge(Long value);

	/**
	 * Returns the value of the '<em><b>Hello Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value of the interval between transmission of bridge PDUs by the switch, on any port for which it is the spanning tree root or trying to become so, as learned from the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hello Time</em>' attribute.
	 * @see #setHelloTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_HelloTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpHelloTime\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getHelloTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getHelloTime <em>Hello Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hello Time</em>' attribute.
	 * @see #getHelloTime()
	 * @generated
	 */
	void setHelloTime(Long value);

	/**
	 * Returns the value of the '<em><b>Hold Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum interval between transmission of bridge PDUs through a given port, as learned from the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hold Time</em>' attribute.
	 * @see #setHoldTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_HoldTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpHoldTime\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getHoldTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getHoldTime <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Time</em>' attribute.
	 * @see #getHoldTime()
	 * @generated
	 */
	void setHoldTime(Long value);

	/**
	 * Returns the value of the '<em><b>Forward Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time spent by a port in the listening state before transitioning to the learning state, and in the learning state before transitioning to the forwarding state, as learned from the network. This value is also used during the period of a topology change as the maximum age of Spanning Tree information before discard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forward Delay</em>' attribute.
	 * @see #setForwardDelay(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_ForwardDelay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpForwardDelay\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getForwardDelay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getForwardDelay <em>Forward Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Delay</em>' attribute.
	 * @see #getForwardDelay()
	 * @generated
	 */
	void setForwardDelay(Long value);

	/**
	 * Returns the value of the '<em><b>Bridge Max Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MaxAge parameter to be used by all switches in the network if this switch becomes the root.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Max Age</em>' attribute.
	 * @see #setBridgeMaxAge(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_BridgeMaxAge()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpBridgeMaxAge\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getBridgeMaxAge();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getBridgeMaxAge <em>Bridge Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Max Age</em>' attribute.
	 * @see #getBridgeMaxAge()
	 * @generated
	 */
	void setBridgeMaxAge(Long value);

	/**
	 * Returns the value of the '<em><b>Bridge Hello Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HelloTime parameter to be used by all switches in the network if this switch becomes the root.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Hello Time</em>' attribute.
	 * @see #setBridgeHelloTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_BridgeHelloTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpBridgeHelloTime\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getBridgeHelloTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getBridgeHelloTime <em>Bridge Hello Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Hello Time</em>' attribute.
	 * @see #getBridgeHelloTime()
	 * @generated
	 */
	void setBridgeHelloTime(Long value);

	/**
	 * Returns the value of the '<em><b>Bridge Forward Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ForwardDelay parameter to be used by all switches in the network if this switch becomes the root.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Forward Delay</em>' attribute.
	 * @see #setBridgeForwardDelay(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SpanningTreeService_BridgeForwardDelay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Hundredths of Seconds' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpBridgeForwardDelay\"]' PUnit='second * 10^-2'"
	 * @generated
	 */
	Long getBridgeForwardDelay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SpanningTreeService#getBridgeForwardDelay <em>Bridge Forward Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Forward Delay</em>' attribute.
	 * @see #getBridgeForwardDelay()
	 * @generated
	 */
	void setBridgeForwardDelay(Long value);

} // CIM_SpanningTreeService
