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

import org.dmtf.cim.CIM_LANSegment;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM LAN Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANSegmentImpl#getLANID <em>LANID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANSegmentImpl#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANSegmentImpl#getOtherLANType <em>Other LAN Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LANSegmentImpl extends CIM_LogicalNetworkImpl implements CIM_LANSegment {
	/**
	 * The default value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected String lanid = LANID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected Integer lanType = LAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected String otherLANType = OTHER_LAN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LANSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LANSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLANID() {
		return lanid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLANID(String newLANID) {
		String oldLANID = lanid;
		lanid = newLANID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_SEGMENT__LANID, oldLANID, lanid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLANType() {
		return lanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLANType(Integer newLANType) {
		Integer oldLANType = lanType;
		lanType = newLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_SEGMENT__LAN_TYPE, oldLANType, lanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLANType() {
		return otherLANType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLANType(String newOtherLANType) {
		String oldOtherLANType = otherLANType;
		otherLANType = newOtherLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_SEGMENT__OTHER_LAN_TYPE, oldOtherLANType, otherLANType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LAN_SEGMENT__LANID:
				return getLANID();
			case CimPackage.CIM_LAN_SEGMENT__LAN_TYPE:
				return getLANType();
			case CimPackage.CIM_LAN_SEGMENT__OTHER_LAN_TYPE:
				return getOtherLANType();
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
			case CimPackage.CIM_LAN_SEGMENT__LANID:
				setLANID((String)newValue);
				return;
			case CimPackage.CIM_LAN_SEGMENT__LAN_TYPE:
				setLANType((Integer)newValue);
				return;
			case CimPackage.CIM_LAN_SEGMENT__OTHER_LAN_TYPE:
				setOtherLANType((String)newValue);
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
			case CimPackage.CIM_LAN_SEGMENT__LANID:
				setLANID(LANID_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_SEGMENT__LAN_TYPE:
				setLANType(LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_SEGMENT__OTHER_LAN_TYPE:
				setOtherLANType(OTHER_LAN_TYPE_EDEFAULT);
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
			case CimPackage.CIM_LAN_SEGMENT__LANID:
				return LANID_EDEFAULT == null ? lanid != null : !LANID_EDEFAULT.equals(lanid);
			case CimPackage.CIM_LAN_SEGMENT__LAN_TYPE:
				return LAN_TYPE_EDEFAULT == null ? lanType != null : !LAN_TYPE_EDEFAULT.equals(lanType);
			case CimPackage.CIM_LAN_SEGMENT__OTHER_LAN_TYPE:
				return OTHER_LAN_TYPE_EDEFAULT == null ? otherLANType != null : !OTHER_LAN_TYPE_EDEFAULT.equals(otherLANType);
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
		result.append(" (LANID: ");
		result.append(lanid);
		result.append(", LANType: ");
		result.append(lanType);
		result.append(", OtherLANType: ");
		result.append(otherLANType);
		result.append(')');
		return result.toString();
	}

} //CIM_LANSegmentImpl
