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
 * A representation of the model object '<em><b>CIM BGP Peer Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BGP Peer Group is a set of BGP neighbors that share the same update policies. This enables an administrator to assign policies to the peer group, instead of individually. This enables the routers in the Peer Group to optimize UPDATE messages. Consequently, Peer Groups have a set of restrictions that must be followed in order to work correctly with external BGP peers. Otherwise, loss of routing information could occur. 
 * 
 * A BGPPeerGroup is weak to the AutonomousSystem that contains it. Therefore, the keys from System must be propagated to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerGroup#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::BGP' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BGPPeerGroup extends CIM_CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping AutonomousSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AutonomousSystem.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping AutonomousSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AutonomousSystem.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the name of the BGP Peer Group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connect Retry Interval</b></em>' attribute.
	 * The default value is <code>"120"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval, in seconds, for the ConnectRetry timer for the endpoints of the routers in the PeerGroup. The suggested value is 120 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connect Retry Interval</em>' attribute.
	 * @see #setConnectRetryInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_ConnectRetryInterval()
	 * @model default="120"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpConnectRetryInterval\"]' PUnit='second'"
	 * @generated
	 */
	Long getConnectRetryInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getConnectRetryInterval <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Retry Interval</em>' attribute.
	 * @see #getConnectRetryInterval()
	 * @generated
	 */
	void setConnectRetryInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Hold Time Configured</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the Hold TimeConfigured property of the endpoints of the routers in the PeerGroup. This value must not be less than three seconds. The suggested value for this timer is 90 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hold Time Configured</em>' attribute.
	 * @see #setHoldTimeConfigured(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_HoldTimeConfigured()
	 * @model default="90"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerHoldTimeConfigured\"]' PUnit='second'"
	 * @generated
	 */
	Integer getHoldTimeConfigured();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getHoldTimeConfigured <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Time Configured</em>' attribute.
	 * @see #getHoldTimeConfigured()
	 * @generated
	 */
	void setHoldTimeConfigured(Integer value);

	/**
	 * Returns the value of the '<em><b>Keep Alive Configured</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the KeepAliveConfigured timer for the endpoints of the routers in the PeerGroup. The suggested value for this property is 30 seconds. The maximum value of this property is 21845 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keep Alive Configured</em>' attribute.
	 * @see #setKeepAliveConfigured(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_KeepAliveConfigured()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerKeepAliveConfigured\"]' PUnit='second'"
	 * @generated
	 */
	Integer getKeepAliveConfigured();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getKeepAliveConfigured <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Configured</em>' attribute.
	 * @see #getKeepAliveConfigured()
	 * @generated
	 */
	void setKeepAliveConfigured(Integer value);

	/**
	 * Returns the value of the '<em><b>Min AS Origination Interval</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the MinASOriginationInterval timer for the endpoints of the routers in the PeerGroup. The suggested value for this property is 15 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min AS Origination Interval</em>' attribute.
	 * @see #setMinASOriginationInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_MinASOriginationInterval()
	 * @model default="15"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerMinASOriginationInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMinASOriginationInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getMinASOriginationInterval <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min AS Origination Interval</em>' attribute.
	 * @see #getMinASOriginationInterval()
	 * @generated
	 */
	void setMinASOriginationInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Route Advertisement Interval</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the MinRouteAdvertisementInterval timer for the endpoints of the routers in the PeerGroup. The suggested value for this property is 30 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #setMinRouteAdvertisementInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerGroup_MinRouteAdvertisementInterval()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerMinRouteAdvertisementInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMinRouteAdvertisementInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerGroup#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 */
	void setMinRouteAdvertisementInterval(Integer value);

} // CIM_BGPPeerGroup
