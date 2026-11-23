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
 * A representation of the model object '<em><b>CIM Switch Port Spanning Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A switch participating in the spanning tree maintains spanning-tree specific information about each port whose forwarding is determined by the spanning tree. This association represents that information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getState <em>State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getPathCost <em>Path Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedRoot <em>Designated Root</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedCost <em>Designated Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedBridge <em>Designated Bridge</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedPort <em>Designated Port</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_SwitchPort REF' override.Antecedent.Description='The SwitchPort.' override.Dependent='CIM_SpanningTreeService REF' override.Dependent.Description='The SpanningTreeService.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortSpanningTree extends CIM_ServiceSAPDependency {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority assigned to the port. Contained in the first octet of the two-octet port ID; the other octet is the port number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortPriority\"]'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the port as determined by the spanning tree protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_State()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Disabled\",\"Blocking\",\"Listening\",\"Learning\",\"Forwarding\",\"Broken\"]' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortState\"]'"
	 * @generated
	 */
	Integer getState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Integer value);

	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enabled/disabled status of the port. This property is deprecated since the status of the port is available by inheritance from EnabledLogicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_Enable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_EnabledLogicalElement.EnabledState\"]' ValueMap='[\"1\",\"2\"]' Values='[\"Enabled\",\"Disabled\"]' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortEnable\"]'"
	 * @generated
	 */
	Integer getEnable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #getEnable()
	 * @generated
	 */
	void setEnable(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contribution of this port to the path cost of paths towards the spanning tree root which include this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Cost</em>' attribute.
	 * @see #setPathCost(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_PathCost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortPathCost\"]'"
	 * @generated
	 */
	Integer getPathCost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getPathCost <em>Path Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Cost</em>' attribute.
	 * @see #getPathCost()
	 * @generated
	 */
	void setPathCost(Integer value);

	/**
	 * Returns the value of the '<em><b>Designated Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bridge identifier of the root bridge for the segment to which the port is attached, as transmitted by the designated bridge for the segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designated Root</em>' attribute.
	 * @see #setDesignatedRoot(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_DesignatedRoot()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortDesignatedRoot\"]'"
	 * @generated
	 */
	String getDesignatedRoot();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedRoot <em>Designated Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Root</em>' attribute.
	 * @see #getDesignatedRoot()
	 * @generated
	 */
	void setDesignatedRoot(String value);

	/**
	 * Returns the value of the '<em><b>Designated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost of the path to the root offered by the designated bridge for the segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designated Cost</em>' attribute.
	 * @see #setDesignatedCost(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_DesignatedCost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortDesignatedCost\"]'"
	 * @generated
	 */
	Integer getDesignatedCost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedCost <em>Designated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Cost</em>' attribute.
	 * @see #getDesignatedCost()
	 * @generated
	 */
	void setDesignatedCost(Integer value);

	/**
	 * Returns the value of the '<em><b>Designated Bridge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bridge identifier of the designated bridge for the segment to which the port is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designated Bridge</em>' attribute.
	 * @see #setDesignatedBridge(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_DesignatedBridge()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortDesignatedBridge\"]'"
	 * @generated
	 */
	String getDesignatedBridge();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedBridge <em>Designated Bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Bridge</em>' attribute.
	 * @see #getDesignatedBridge()
	 * @generated
	 */
	void setDesignatedBridge(String value);

	/**
	 * Returns the value of the '<em><b>Designated Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port identifier of the port on the designated bridge serving the segment to which the port is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designated Port</em>' attribute.
	 * @see #setDesignatedPort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortSpanningTree_DesignatedPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dStpPortDesignatedPort\"]'"
	 * @generated
	 */
	Integer getDesignatedPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortSpanningTree#getDesignatedPort <em>Designated Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Port</em>' attribute.
	 * @see #getDesignatedPort()
	 * @generated
	 */
	void setDesignatedPort(Integer value);

} // CIM_SwitchPortSpanningTree
