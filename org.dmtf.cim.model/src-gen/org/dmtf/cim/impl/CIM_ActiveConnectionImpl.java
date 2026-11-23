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

import org.dmtf.cim.CIM_ActiveConnection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Active Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActiveConnectionImpl#getTrafficType <em>Traffic Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActiveConnectionImpl#getOtherTrafficDescription <em>Other Traffic Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ActiveConnectionImpl#getIsUnidirectional <em>Is Unidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ActiveConnectionImpl extends CIM_SAPSAPDependencyImpl implements CIM_ActiveConnection {
	/**
	 * The default value of the '{@link #getTrafficType() <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRAFFIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafficType() <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType()
	 * @generated
	 * @ordered
	 */
	protected Integer trafficType = TRAFFIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTrafficDescription() <em>Other Traffic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrafficDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TRAFFIC_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTrafficDescription() <em>Other Traffic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrafficDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTrafficDescription = OTHER_TRAFFIC_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnidirectional() <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIDIRECTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnidirectional() <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnidirectional()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnidirectional = IS_UNIDIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ActiveConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ActiveConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTrafficType() {
		return trafficType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafficType(Integer newTrafficType) {
		Integer oldTrafficType = trafficType;
		trafficType = newTrafficType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTIVE_CONNECTION__TRAFFIC_TYPE, oldTrafficType, trafficType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTrafficDescription() {
		return otherTrafficDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTrafficDescription(String newOtherTrafficDescription) {
		String oldOtherTrafficDescription = otherTrafficDescription;
		otherTrafficDescription = newOtherTrafficDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTIVE_CONNECTION__OTHER_TRAFFIC_DESCRIPTION, oldOtherTrafficDescription, otherTrafficDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsUnidirectional() {
		return isUnidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnidirectional(Boolean newIsUnidirectional) {
		Boolean oldIsUnidirectional = isUnidirectional;
		isUnidirectional = newIsUnidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACTIVE_CONNECTION__IS_UNIDIRECTIONAL, oldIsUnidirectional, isUnidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ACTIVE_CONNECTION__TRAFFIC_TYPE:
				return getTrafficType();
			case CimPackage.CIM_ACTIVE_CONNECTION__OTHER_TRAFFIC_DESCRIPTION:
				return getOtherTrafficDescription();
			case CimPackage.CIM_ACTIVE_CONNECTION__IS_UNIDIRECTIONAL:
				return getIsUnidirectional();
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
			case CimPackage.CIM_ACTIVE_CONNECTION__TRAFFIC_TYPE:
				setTrafficType((Integer)newValue);
				return;
			case CimPackage.CIM_ACTIVE_CONNECTION__OTHER_TRAFFIC_DESCRIPTION:
				setOtherTrafficDescription((String)newValue);
				return;
			case CimPackage.CIM_ACTIVE_CONNECTION__IS_UNIDIRECTIONAL:
				setIsUnidirectional((Boolean)newValue);
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
			case CimPackage.CIM_ACTIVE_CONNECTION__TRAFFIC_TYPE:
				setTrafficType(TRAFFIC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ACTIVE_CONNECTION__OTHER_TRAFFIC_DESCRIPTION:
				setOtherTrafficDescription(OTHER_TRAFFIC_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_ACTIVE_CONNECTION__IS_UNIDIRECTIONAL:
				setIsUnidirectional(IS_UNIDIRECTIONAL_EDEFAULT);
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
			case CimPackage.CIM_ACTIVE_CONNECTION__TRAFFIC_TYPE:
				return TRAFFIC_TYPE_EDEFAULT == null ? trafficType != null : !TRAFFIC_TYPE_EDEFAULT.equals(trafficType);
			case CimPackage.CIM_ACTIVE_CONNECTION__OTHER_TRAFFIC_DESCRIPTION:
				return OTHER_TRAFFIC_DESCRIPTION_EDEFAULT == null ? otherTrafficDescription != null : !OTHER_TRAFFIC_DESCRIPTION_EDEFAULT.equals(otherTrafficDescription);
			case CimPackage.CIM_ACTIVE_CONNECTION__IS_UNIDIRECTIONAL:
				return IS_UNIDIRECTIONAL_EDEFAULT == null ? isUnidirectional != null : !IS_UNIDIRECTIONAL_EDEFAULT.equals(isUnidirectional);
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
		result.append(" (TrafficType: ");
		result.append(trafficType);
		result.append(", OtherTrafficDescription: ");
		result.append(otherTrafficDescription);
		result.append(", IsUnidirectional: ");
		result.append(isUnidirectional);
		result.append(')');
		return result.toString();
	}

} //CIM_ActiveConnectionImpl
