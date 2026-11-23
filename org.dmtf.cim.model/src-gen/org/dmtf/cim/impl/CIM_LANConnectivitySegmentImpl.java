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

import org.dmtf.cim.CIM_LANConnectivitySegment;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM LAN Connectivity Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANConnectivitySegmentImpl#getLANID <em>LANID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANConnectivitySegmentImpl#getConnectivityType <em>Connectivity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANConnectivitySegmentImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LANConnectivitySegmentImpl extends CIM_ConnectivityCollectionImpl implements CIM_LANConnectivitySegment {
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
	 * The default value of the '{@link #getConnectivityType() <em>Connectivity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTIVITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectivityType() <em>Connectivity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityType()
	 * @generated
	 * @ordered
	 */
	protected Integer connectivityType = CONNECTIVITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LANConnectivitySegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LANConnectivitySegment();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__LANID, oldLANID, lanid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectivityType() {
		return connectivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectivityType(Integer newConnectivityType) {
		Integer oldConnectivityType = connectivityType;
		connectivityType = newConnectivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE, oldConnectivityType, connectivityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__LANID:
				return getLANID();
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				return getConnectivityType();
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
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
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__LANID:
				setLANID((String)newValue);
				return;
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				setConnectivityType((Integer)newValue);
				return;
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
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
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__LANID:
				setLANID(LANID_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				setConnectivityType(CONNECTIVITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__LANID:
				return LANID_EDEFAULT == null ? lanid != null : !LANID_EDEFAULT.equals(lanid);
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__CONNECTIVITY_TYPE:
				return CONNECTIVITY_TYPE_EDEFAULT == null ? connectivityType != null : !CONNECTIVITY_TYPE_EDEFAULT.equals(connectivityType);
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
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
		result.append(", ConnectivityType: ");
		result.append(connectivityType);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_LANConnectivitySegmentImpl
