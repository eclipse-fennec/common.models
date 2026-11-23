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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_SpanningTreeService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Spanning Tree Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getProtocolSpec <em>Protocol Spec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getSpanningTreeBridgeAddress <em>Spanning Tree Bridge Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getDesignatedRoot <em>Designated Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getRootCost <em>Root Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getRootPort <em>Root Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getHelloTime <em>Hello Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getHoldTime <em>Hold Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getForwardDelay <em>Forward Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getBridgeMaxAge <em>Bridge Max Age</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getBridgeHelloTime <em>Bridge Hello Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SpanningTreeServiceImpl#getBridgeForwardDelay <em>Bridge Forward Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SpanningTreeServiceImpl extends CIM_ForwardingServiceImpl implements CIM_SpanningTreeService {
	/**
	 * The default value of the '{@link #getProtocolSpec() <em>Protocol Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolSpec()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolSpec() <em>Protocol Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolSpec()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolSpec = PROTOCOL_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpanningTreeBridgeAddress() <em>Spanning Tree Bridge Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanningTreeBridgeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SPANNING_TREE_BRIDGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpanningTreeBridgeAddress() <em>Spanning Tree Bridge Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanningTreeBridgeAddress()
	 * @generated
	 * @ordered
	 */
	protected String spanningTreeBridgeAddress = SPANNING_TREE_BRIDGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignatedRoot() <em>Designated Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATED_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignatedRoot() <em>Designated Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedRoot()
	 * @generated
	 * @ordered
	 */
	protected String designatedRoot = DESIGNATED_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootCost() <em>Root Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROOT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootCost() <em>Root Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCost()
	 * @generated
	 * @ordered
	 */
	protected Integer rootCost = ROOT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootPort() <em>Root Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROOT_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootPort() <em>Root Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPort()
	 * @generated
	 * @ordered
	 */
	protected Integer rootPort = ROOT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected Long maxAge = MAX_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelloTime() <em>Hello Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelloTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long HELLO_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelloTime() <em>Hello Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelloTime()
	 * @generated
	 * @ordered
	 */
	protected Long helloTime = HELLO_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldTime() <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long HOLD_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoldTime() <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTime()
	 * @generated
	 * @ordered
	 */
	protected Long holdTime = HOLD_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getForwardDelay() <em>Forward Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Long FORWARD_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForwardDelay() <em>Forward Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardDelay()
	 * @generated
	 * @ordered
	 */
	protected Long forwardDelay = FORWARD_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeMaxAge() <em>Bridge Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeMaxAge()
	 * @generated
	 * @ordered
	 */
	protected static final Long BRIDGE_MAX_AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeMaxAge() <em>Bridge Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeMaxAge()
	 * @generated
	 * @ordered
	 */
	protected Long bridgeMaxAge = BRIDGE_MAX_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeHelloTime() <em>Bridge Hello Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeHelloTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long BRIDGE_HELLO_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeHelloTime() <em>Bridge Hello Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeHelloTime()
	 * @generated
	 * @ordered
	 */
	protected Long bridgeHelloTime = BRIDGE_HELLO_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeForwardDelay() <em>Bridge Forward Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeForwardDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Long BRIDGE_FORWARD_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeForwardDelay() <em>Bridge Forward Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeForwardDelay()
	 * @generated
	 * @ordered
	 */
	protected Long bridgeForwardDelay = BRIDGE_FORWARD_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SpanningTreeServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SpanningTreeService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolSpec() {
		return protocolSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolSpec(Integer newProtocolSpec) {
		Integer oldProtocolSpec = protocolSpec;
		protocolSpec = newProtocolSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__PROTOCOL_SPEC, oldProtocolSpec, protocolSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpanningTreeBridgeAddress() {
		return spanningTreeBridgeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpanningTreeBridgeAddress(String newSpanningTreeBridgeAddress) {
		String oldSpanningTreeBridgeAddress = spanningTreeBridgeAddress;
		spanningTreeBridgeAddress = newSpanningTreeBridgeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__SPANNING_TREE_BRIDGE_ADDRESS, oldSpanningTreeBridgeAddress, spanningTreeBridgeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesignatedRoot() {
		return designatedRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignatedRoot(String newDesignatedRoot) {
		String oldDesignatedRoot = designatedRoot;
		designatedRoot = newDesignatedRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__DESIGNATED_ROOT, oldDesignatedRoot, designatedRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRootCost() {
		return rootCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootCost(Integer newRootCost) {
		Integer oldRootCost = rootCost;
		rootCost = newRootCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_COST, oldRootCost, rootCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRootPort() {
		return rootPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootPort(Integer newRootPort) {
		Integer oldRootPort = rootPort;
		rootPort = newRootPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_PORT, oldRootPort, rootPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxAge() {
		return maxAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAge(Long newMaxAge) {
		Long oldMaxAge = maxAge;
		maxAge = newMaxAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__MAX_AGE, oldMaxAge, maxAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHelloTime() {
		return helloTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelloTime(Long newHelloTime) {
		Long oldHelloTime = helloTime;
		helloTime = newHelloTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__HELLO_TIME, oldHelloTime, helloTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHoldTime() {
		return holdTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoldTime(Long newHoldTime) {
		Long oldHoldTime = holdTime;
		holdTime = newHoldTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__HOLD_TIME, oldHoldTime, holdTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getForwardDelay() {
		return forwardDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForwardDelay(Long newForwardDelay) {
		Long oldForwardDelay = forwardDelay;
		forwardDelay = newForwardDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__FORWARD_DELAY, oldForwardDelay, forwardDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBridgeMaxAge() {
		return bridgeMaxAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeMaxAge(Long newBridgeMaxAge) {
		Long oldBridgeMaxAge = bridgeMaxAge;
		bridgeMaxAge = newBridgeMaxAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_MAX_AGE, oldBridgeMaxAge, bridgeMaxAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBridgeHelloTime() {
		return bridgeHelloTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeHelloTime(Long newBridgeHelloTime) {
		Long oldBridgeHelloTime = bridgeHelloTime;
		bridgeHelloTime = newBridgeHelloTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_HELLO_TIME, oldBridgeHelloTime, bridgeHelloTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBridgeForwardDelay() {
		return bridgeForwardDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeForwardDelay(Long newBridgeForwardDelay) {
		Long oldBridgeForwardDelay = bridgeForwardDelay;
		bridgeForwardDelay = newBridgeForwardDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_FORWARD_DELAY, oldBridgeForwardDelay, bridgeForwardDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PROTOCOL_SPEC:
				return getProtocolSpec();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PRIORITY:
				return getPriority();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__SPANNING_TREE_BRIDGE_ADDRESS:
				return getSpanningTreeBridgeAddress();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__DESIGNATED_ROOT:
				return getDesignatedRoot();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_COST:
				return getRootCost();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_PORT:
				return getRootPort();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__MAX_AGE:
				return getMaxAge();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HELLO_TIME:
				return getHelloTime();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HOLD_TIME:
				return getHoldTime();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__FORWARD_DELAY:
				return getForwardDelay();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_MAX_AGE:
				return getBridgeMaxAge();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_HELLO_TIME:
				return getBridgeHelloTime();
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_FORWARD_DELAY:
				return getBridgeForwardDelay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PROTOCOL_SPEC:
				setProtocolSpec((Integer)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__SPANNING_TREE_BRIDGE_ADDRESS:
				setSpanningTreeBridgeAddress((String)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__DESIGNATED_ROOT:
				setDesignatedRoot((String)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_COST:
				setRootCost((Integer)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_PORT:
				setRootPort((Integer)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__MAX_AGE:
				setMaxAge((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HELLO_TIME:
				setHelloTime((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HOLD_TIME:
				setHoldTime((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__FORWARD_DELAY:
				setForwardDelay((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_MAX_AGE:
				setBridgeMaxAge((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_HELLO_TIME:
				setBridgeHelloTime((Long)newValue);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_FORWARD_DELAY:
				setBridgeForwardDelay((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PROTOCOL_SPEC:
				setProtocolSpec(PROTOCOL_SPEC_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__SPANNING_TREE_BRIDGE_ADDRESS:
				setSpanningTreeBridgeAddress(SPANNING_TREE_BRIDGE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__DESIGNATED_ROOT:
				setDesignatedRoot(DESIGNATED_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_COST:
				setRootCost(ROOT_COST_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_PORT:
				setRootPort(ROOT_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__MAX_AGE:
				setMaxAge(MAX_AGE_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HELLO_TIME:
				setHelloTime(HELLO_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HOLD_TIME:
				setHoldTime(HOLD_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__FORWARD_DELAY:
				setForwardDelay(FORWARD_DELAY_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_MAX_AGE:
				setBridgeMaxAge(BRIDGE_MAX_AGE_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_HELLO_TIME:
				setBridgeHelloTime(BRIDGE_HELLO_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_FORWARD_DELAY:
				setBridgeForwardDelay(BRIDGE_FORWARD_DELAY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PROTOCOL_SPEC:
				return PROTOCOL_SPEC_EDEFAULT == null ? protocolSpec != null : !PROTOCOL_SPEC_EDEFAULT.equals(protocolSpec);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__SPANNING_TREE_BRIDGE_ADDRESS:
				return SPANNING_TREE_BRIDGE_ADDRESS_EDEFAULT == null ? spanningTreeBridgeAddress != null : !SPANNING_TREE_BRIDGE_ADDRESS_EDEFAULT.equals(spanningTreeBridgeAddress);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__DESIGNATED_ROOT:
				return DESIGNATED_ROOT_EDEFAULT == null ? designatedRoot != null : !DESIGNATED_ROOT_EDEFAULT.equals(designatedRoot);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_COST:
				return ROOT_COST_EDEFAULT == null ? rootCost != null : !ROOT_COST_EDEFAULT.equals(rootCost);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__ROOT_PORT:
				return ROOT_PORT_EDEFAULT == null ? rootPort != null : !ROOT_PORT_EDEFAULT.equals(rootPort);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__MAX_AGE:
				return MAX_AGE_EDEFAULT == null ? maxAge != null : !MAX_AGE_EDEFAULT.equals(maxAge);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HELLO_TIME:
				return HELLO_TIME_EDEFAULT == null ? helloTime != null : !HELLO_TIME_EDEFAULT.equals(helloTime);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__HOLD_TIME:
				return HOLD_TIME_EDEFAULT == null ? holdTime != null : !HOLD_TIME_EDEFAULT.equals(holdTime);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__FORWARD_DELAY:
				return FORWARD_DELAY_EDEFAULT == null ? forwardDelay != null : !FORWARD_DELAY_EDEFAULT.equals(forwardDelay);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_MAX_AGE:
				return BRIDGE_MAX_AGE_EDEFAULT == null ? bridgeMaxAge != null : !BRIDGE_MAX_AGE_EDEFAULT.equals(bridgeMaxAge);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_HELLO_TIME:
				return BRIDGE_HELLO_TIME_EDEFAULT == null ? bridgeHelloTime != null : !BRIDGE_HELLO_TIME_EDEFAULT.equals(bridgeHelloTime);
			case CimPackage.CIM_SPANNING_TREE_SERVICE__BRIDGE_FORWARD_DELAY:
				return BRIDGE_FORWARD_DELAY_EDEFAULT == null ? bridgeForwardDelay != null : !BRIDGE_FORWARD_DELAY_EDEFAULT.equals(bridgeForwardDelay);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ProtocolSpec: ");
		result.append(protocolSpec);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", SpanningTreeBridgeAddress: ");
		result.append(spanningTreeBridgeAddress);
		result.append(", DesignatedRoot: ");
		result.append(designatedRoot);
		result.append(", RootCost: ");
		result.append(rootCost);
		result.append(", RootPort: ");
		result.append(rootPort);
		result.append(", MaxAge: ");
		result.append(maxAge);
		result.append(", HelloTime: ");
		result.append(helloTime);
		result.append(", HoldTime: ");
		result.append(holdTime);
		result.append(", ForwardDelay: ");
		result.append(forwardDelay);
		result.append(", BridgeMaxAge: ");
		result.append(bridgeMaxAge);
		result.append(", BridgeHelloTime: ");
		result.append(bridgeHelloTime);
		result.append(", BridgeForwardDelay: ");
		result.append(bridgeForwardDelay);
		result.append(')');
		return result.toString();
	}

} //CIM_SpanningTreeServiceImpl
