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

import org.dmtf.cim.CIM_DiffServService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diff Serv Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiffServServiceImpl#getDSCP <em>DSCP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiffServServiceImpl#getPHBID <em>PHBID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiffServServiceImpl extends CIM_QoSServiceImpl implements CIM_DiffServService {
	/**
	 * The default value of the '{@link #getDSCP() <em>DSCP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSCP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DSCP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDSCP() <em>DSCP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSCP()
	 * @generated
	 * @ordered
	 */
	protected Integer dscp = DSCP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPHBID() <em>PHBID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHBID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PHBID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPHBID() <em>PHBID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHBID()
	 * @generated
	 * @ordered
	 */
	protected Integer phbid = PHBID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiffServServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiffServService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDSCP() {
		return dscp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSCP(Integer newDSCP) {
		Integer oldDSCP = dscp;
		dscp = newDSCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIFF_SERV_SERVICE__DSCP, oldDSCP, dscp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPHBID() {
		return phbid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPHBID(Integer newPHBID) {
		Integer oldPHBID = phbid;
		phbid = newPHBID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIFF_SERV_SERVICE__PHBID, oldPHBID, phbid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIFF_SERV_SERVICE__DSCP:
				return getDSCP();
			case CimPackage.CIM_DIFF_SERV_SERVICE__PHBID:
				return getPHBID();
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
			case CimPackage.CIM_DIFF_SERV_SERVICE__DSCP:
				setDSCP((Integer)newValue);
				return;
			case CimPackage.CIM_DIFF_SERV_SERVICE__PHBID:
				setPHBID((Integer)newValue);
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
			case CimPackage.CIM_DIFF_SERV_SERVICE__DSCP:
				setDSCP(DSCP_EDEFAULT);
				return;
			case CimPackage.CIM_DIFF_SERV_SERVICE__PHBID:
				setPHBID(PHBID_EDEFAULT);
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
			case CimPackage.CIM_DIFF_SERV_SERVICE__DSCP:
				return DSCP_EDEFAULT == null ? dscp != null : !DSCP_EDEFAULT.equals(dscp);
			case CimPackage.CIM_DIFF_SERV_SERVICE__PHBID:
				return PHBID_EDEFAULT == null ? phbid != null : !PHBID_EDEFAULT.equals(phbid);
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
		result.append(" (DSCP: ");
		result.append(dscp);
		result.append(", PHBID: ");
		result.append(phbid);
		result.append(')');
		return result.toString();
	}

} //CIM_DiffServServiceImpl
