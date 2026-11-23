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

import org.dmtf.cim.CIM_Controller;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControllerImpl#getTimeOfLastReset <em>Time Of Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControllerImpl#getProtocolSupported <em>Protocol Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControllerImpl#getMaxNumberControlled <em>Max Number Controlled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ControllerImpl#getProtocolDescription <em>Protocol Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_ControllerImpl extends CIM_LogicalDeviceImpl implements CIM_Controller {
	/**
	 * The default value of the '{@link #getTimeOfLastReset() <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastReset()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_RESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastReset() <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastReset()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastReset = TIME_OF_LAST_RESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolSupported() <em>Protocol Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolSupported() <em>Protocol Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolSupported = PROTOCOL_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberControlled() <em>Max Number Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberControlled()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_CONTROLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberControlled() <em>Max Number Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberControlled()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberControlled = MAX_NUMBER_CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolDescription() <em>Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolDescription() <em>Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected String protocolDescription = PROTOCOL_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Controller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastReset() {
		return timeOfLastReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastReset(String newTimeOfLastReset) {
		String oldTimeOfLastReset = timeOfLastReset;
		timeOfLastReset = newTimeOfLastReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLER__TIME_OF_LAST_RESET, oldTimeOfLastReset, timeOfLastReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolSupported() {
		return protocolSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolSupported(Integer newProtocolSupported) {
		Integer oldProtocolSupported = protocolSupported;
		protocolSupported = newProtocolSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLER__PROTOCOL_SUPPORTED, oldProtocolSupported, protocolSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberControlled() {
		return maxNumberControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberControlled(Long newMaxNumberControlled) {
		Long oldMaxNumberControlled = maxNumberControlled;
		maxNumberControlled = newMaxNumberControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLER__MAX_NUMBER_CONTROLLED, oldMaxNumberControlled, maxNumberControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolDescription() {
		return protocolDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolDescription(String newProtocolDescription) {
		String oldProtocolDescription = protocolDescription;
		protocolDescription = newProtocolDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTROLLER__PROTOCOL_DESCRIPTION, oldProtocolDescription, protocolDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONTROLLER__TIME_OF_LAST_RESET:
				return getTimeOfLastReset();
			case CimPackage.CIM_CONTROLLER__PROTOCOL_SUPPORTED:
				return getProtocolSupported();
			case CimPackage.CIM_CONTROLLER__MAX_NUMBER_CONTROLLED:
				return getMaxNumberControlled();
			case CimPackage.CIM_CONTROLLER__PROTOCOL_DESCRIPTION:
				return getProtocolDescription();
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
			case CimPackage.CIM_CONTROLLER__TIME_OF_LAST_RESET:
				setTimeOfLastReset((String)newValue);
				return;
			case CimPackage.CIM_CONTROLLER__PROTOCOL_SUPPORTED:
				setProtocolSupported((Integer)newValue);
				return;
			case CimPackage.CIM_CONTROLLER__MAX_NUMBER_CONTROLLED:
				setMaxNumberControlled((Long)newValue);
				return;
			case CimPackage.CIM_CONTROLLER__PROTOCOL_DESCRIPTION:
				setProtocolDescription((String)newValue);
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
			case CimPackage.CIM_CONTROLLER__TIME_OF_LAST_RESET:
				setTimeOfLastReset(TIME_OF_LAST_RESET_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLER__PROTOCOL_SUPPORTED:
				setProtocolSupported(PROTOCOL_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLER__MAX_NUMBER_CONTROLLED:
				setMaxNumberControlled(MAX_NUMBER_CONTROLLED_EDEFAULT);
				return;
			case CimPackage.CIM_CONTROLLER__PROTOCOL_DESCRIPTION:
				setProtocolDescription(PROTOCOL_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_CONTROLLER__TIME_OF_LAST_RESET:
				return TIME_OF_LAST_RESET_EDEFAULT == null ? timeOfLastReset != null : !TIME_OF_LAST_RESET_EDEFAULT.equals(timeOfLastReset);
			case CimPackage.CIM_CONTROLLER__PROTOCOL_SUPPORTED:
				return PROTOCOL_SUPPORTED_EDEFAULT == null ? protocolSupported != null : !PROTOCOL_SUPPORTED_EDEFAULT.equals(protocolSupported);
			case CimPackage.CIM_CONTROLLER__MAX_NUMBER_CONTROLLED:
				return MAX_NUMBER_CONTROLLED_EDEFAULT == null ? maxNumberControlled != null : !MAX_NUMBER_CONTROLLED_EDEFAULT.equals(maxNumberControlled);
			case CimPackage.CIM_CONTROLLER__PROTOCOL_DESCRIPTION:
				return PROTOCOL_DESCRIPTION_EDEFAULT == null ? protocolDescription != null : !PROTOCOL_DESCRIPTION_EDEFAULT.equals(protocolDescription);
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
		result.append(" (TimeOfLastReset: ");
		result.append(timeOfLastReset);
		result.append(", ProtocolSupported: ");
		result.append(protocolSupported);
		result.append(", MaxNumberControlled: ");
		result.append(maxNumberControlled);
		result.append(", ProtocolDescription: ");
		result.append(protocolDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_ControllerImpl
