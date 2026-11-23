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

import org.dmtf.cim.CIM_ParticipatingCS;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Participating CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParticipatingCSImpl#getStateOfNode <em>State Of Node</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParticipatingCSImpl#getRoleOfNode <em>Role Of Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ParticipatingCSImpl extends CIM_DependencyImpl implements CIM_ParticipatingCS {
	/**
	 * The default value of the '{@link #getStateOfNode() <em>State Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOfNode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATE_OF_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateOfNode() <em>State Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOfNode()
	 * @generated
	 * @ordered
	 */
	protected Integer stateOfNode = STATE_OF_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleOfNode() <em>Role Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleOfNode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROLE_OF_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleOfNode() <em>Role Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleOfNode()
	 * @generated
	 * @ordered
	 */
	protected Integer roleOfNode = ROLE_OF_NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ParticipatingCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ParticipatingCS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStateOfNode() {
		return stateOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateOfNode(Integer newStateOfNode) {
		Integer oldStateOfNode = stateOfNode;
		stateOfNode = newStateOfNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PARTICIPATING_CS__STATE_OF_NODE, oldStateOfNode, stateOfNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRoleOfNode() {
		return roleOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleOfNode(Integer newRoleOfNode) {
		Integer oldRoleOfNode = roleOfNode;
		roleOfNode = newRoleOfNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PARTICIPATING_CS__ROLE_OF_NODE, oldRoleOfNode, roleOfNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PARTICIPATING_CS__STATE_OF_NODE:
				return getStateOfNode();
			case CimPackage.CIM_PARTICIPATING_CS__ROLE_OF_NODE:
				return getRoleOfNode();
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
			case CimPackage.CIM_PARTICIPATING_CS__STATE_OF_NODE:
				setStateOfNode((Integer)newValue);
				return;
			case CimPackage.CIM_PARTICIPATING_CS__ROLE_OF_NODE:
				setRoleOfNode((Integer)newValue);
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
			case CimPackage.CIM_PARTICIPATING_CS__STATE_OF_NODE:
				setStateOfNode(STATE_OF_NODE_EDEFAULT);
				return;
			case CimPackage.CIM_PARTICIPATING_CS__ROLE_OF_NODE:
				setRoleOfNode(ROLE_OF_NODE_EDEFAULT);
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
			case CimPackage.CIM_PARTICIPATING_CS__STATE_OF_NODE:
				return STATE_OF_NODE_EDEFAULT == null ? stateOfNode != null : !STATE_OF_NODE_EDEFAULT.equals(stateOfNode);
			case CimPackage.CIM_PARTICIPATING_CS__ROLE_OF_NODE:
				return ROLE_OF_NODE_EDEFAULT == null ? roleOfNode != null : !ROLE_OF_NODE_EDEFAULT.equals(roleOfNode);
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
		result.append(" (StateOfNode: ");
		result.append(stateOfNode);
		result.append(", RoleOfNode: ");
		result.append(roleOfNode);
		result.append(')');
		return result.toString();
	}

} //CIM_ParticipatingCSImpl
