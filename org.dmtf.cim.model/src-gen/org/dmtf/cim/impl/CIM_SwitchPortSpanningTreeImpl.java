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

import org.dmtf.cim.CIM_SwitchPortSpanningTree;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Spanning Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getPathCost <em>Path Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getDesignatedRoot <em>Designated Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getDesignatedCost <em>Designated Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getDesignatedBridge <em>Designated Bridge</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortSpanningTreeImpl#getDesignatedPort <em>Designated Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortSpanningTreeImpl extends CIM_ServiceSAPDependencyImpl implements CIM_SwitchPortSpanningTree {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Integer state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected Integer enable = ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathCost() <em>Path Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathCost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATH_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathCost() <em>Path Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathCost()
	 * @generated
	 * @ordered
	 */
	protected Integer pathCost = PATH_COST_EDEFAULT;

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
	 * The default value of the '{@link #getDesignatedCost() <em>Designated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedCost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIGNATED_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignatedCost() <em>Designated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedCost()
	 * @generated
	 * @ordered
	 */
	protected Integer designatedCost = DESIGNATED_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignatedBridge() <em>Designated Bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedBridge()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATED_BRIDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignatedBridge() <em>Designated Bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedBridge()
	 * @generated
	 * @ordered
	 */
	protected String designatedBridge = DESIGNATED_BRIDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignatedPort() <em>Designated Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIGNATED_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignatedPort() <em>Designated Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedPort()
	 * @generated
	 * @ordered
	 */
	protected Integer designatedPort = DESIGNATED_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortSpanningTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortSpanningTree();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(Integer newState) {
		Integer oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnable(Integer newEnable) {
		Integer oldEnable = enable;
		enable = newEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__ENABLE, oldEnable, enable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPathCost() {
		return pathCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathCost(Integer newPathCost) {
		Integer oldPathCost = pathCost;
		pathCost = newPathCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PATH_COST, oldPathCost, pathCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_ROOT, oldDesignatedRoot, designatedRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesignatedCost() {
		return designatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignatedCost(Integer newDesignatedCost) {
		Integer oldDesignatedCost = designatedCost;
		designatedCost = newDesignatedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_COST, oldDesignatedCost, designatedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesignatedBridge() {
		return designatedBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignatedBridge(String newDesignatedBridge) {
		String oldDesignatedBridge = designatedBridge;
		designatedBridge = newDesignatedBridge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_BRIDGE, oldDesignatedBridge, designatedBridge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesignatedPort() {
		return designatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignatedPort(Integer newDesignatedPort) {
		Integer oldDesignatedPort = designatedPort;
		designatedPort = newDesignatedPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_PORT, oldDesignatedPort, designatedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PRIORITY:
				return getPriority();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__STATE:
				return getState();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__ENABLE:
				return getEnable();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PATH_COST:
				return getPathCost();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_ROOT:
				return getDesignatedRoot();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_COST:
				return getDesignatedCost();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_BRIDGE:
				return getDesignatedBridge();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_PORT:
				return getDesignatedPort();
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
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__STATE:
				setState((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__ENABLE:
				setEnable((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PATH_COST:
				setPathCost((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_ROOT:
				setDesignatedRoot((String)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_COST:
				setDesignatedCost((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_BRIDGE:
				setDesignatedBridge((String)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_PORT:
				setDesignatedPort((Integer)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__ENABLE:
				setEnable(ENABLE_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PATH_COST:
				setPathCost(PATH_COST_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_ROOT:
				setDesignatedRoot(DESIGNATED_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_COST:
				setDesignatedCost(DESIGNATED_COST_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_BRIDGE:
				setDesignatedBridge(DESIGNATED_BRIDGE_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_PORT:
				setDesignatedPort(DESIGNATED_PORT_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__ENABLE:
				return ENABLE_EDEFAULT == null ? enable != null : !ENABLE_EDEFAULT.equals(enable);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__PATH_COST:
				return PATH_COST_EDEFAULT == null ? pathCost != null : !PATH_COST_EDEFAULT.equals(pathCost);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_ROOT:
				return DESIGNATED_ROOT_EDEFAULT == null ? designatedRoot != null : !DESIGNATED_ROOT_EDEFAULT.equals(designatedRoot);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_COST:
				return DESIGNATED_COST_EDEFAULT == null ? designatedCost != null : !DESIGNATED_COST_EDEFAULT.equals(designatedCost);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_BRIDGE:
				return DESIGNATED_BRIDGE_EDEFAULT == null ? designatedBridge != null : !DESIGNATED_BRIDGE_EDEFAULT.equals(designatedBridge);
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE__DESIGNATED_PORT:
				return DESIGNATED_PORT_EDEFAULT == null ? designatedPort != null : !DESIGNATED_PORT_EDEFAULT.equals(designatedPort);
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
		result.append(" (Priority: ");
		result.append(priority);
		result.append(", State: ");
		result.append(state);
		result.append(", Enable: ");
		result.append(enable);
		result.append(", PathCost: ");
		result.append(pathCost);
		result.append(", DesignatedRoot: ");
		result.append(designatedRoot);
		result.append(", DesignatedCost: ");
		result.append(designatedCost);
		result.append(", DesignatedBridge: ");
		result.append(designatedBridge);
		result.append(", DesignatedPort: ");
		result.append(designatedPort);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortSpanningTreeImpl
