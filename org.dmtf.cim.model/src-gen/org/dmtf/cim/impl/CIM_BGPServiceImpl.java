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

import org.dmtf.cim.CIM_BGPService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPServiceImpl#getBGPVersion <em>BGP Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPServiceImpl#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPServiceImpl#getLastMessageErrorSubCode <em>Last Message Error Sub Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPServiceImpl#getLastOpenErrorSubCode <em>Last Open Error Sub Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPServiceImpl#getLastUpdateErrorSubCode <em>Last Update Error Sub Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPServiceImpl extends CIM_RouteCalculationServiceImpl implements CIM_BGPService {
	/**
	 * The default value of the '{@link #getBGPVersion() <em>BGP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BGP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGPVersion() <em>BGP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer bgpVersion = BGP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected Integer lastErrorCode = LAST_ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastMessageErrorSubCode() <em>Last Message Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMessageErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastMessageErrorSubCode() <em>Last Message Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMessageErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected Integer lastMessageErrorSubCode = LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastOpenErrorSubCode() <em>Last Open Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOpenErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_OPEN_ERROR_SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastOpenErrorSubCode() <em>Last Open Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOpenErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected Integer lastOpenErrorSubCode = LAST_OPEN_ERROR_SUB_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdateErrorSubCode() <em>Last Update Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_UPDATE_ERROR_SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdateErrorSubCode() <em>Last Update Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected Integer lastUpdateErrorSubCode = LAST_UPDATE_ERROR_SUB_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBGPVersion() {
		return bgpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBGPVersion(Integer newBGPVersion) {
		Integer oldBGPVersion = bgpVersion;
		bgpVersion = newBGPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_SERVICE__BGP_VERSION, oldBGPVersion, bgpVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastErrorCode() {
		return lastErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastErrorCode(Integer newLastErrorCode) {
		Integer oldLastErrorCode = lastErrorCode;
		lastErrorCode = newLastErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_SERVICE__LAST_ERROR_CODE, oldLastErrorCode, lastErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastMessageErrorSubCode() {
		return lastMessageErrorSubCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastMessageErrorSubCode(Integer newLastMessageErrorSubCode) {
		Integer oldLastMessageErrorSubCode = lastMessageErrorSubCode;
		lastMessageErrorSubCode = newLastMessageErrorSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE, oldLastMessageErrorSubCode, lastMessageErrorSubCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastOpenErrorSubCode() {
		return lastOpenErrorSubCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOpenErrorSubCode(Integer newLastOpenErrorSubCode) {
		Integer oldLastOpenErrorSubCode = lastOpenErrorSubCode;
		lastOpenErrorSubCode = newLastOpenErrorSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE, oldLastOpenErrorSubCode, lastOpenErrorSubCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastUpdateErrorSubCode() {
		return lastUpdateErrorSubCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdateErrorSubCode(Integer newLastUpdateErrorSubCode) {
		Integer oldLastUpdateErrorSubCode = lastUpdateErrorSubCode;
		lastUpdateErrorSubCode = newLastUpdateErrorSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_SERVICE__LAST_UPDATE_ERROR_SUB_CODE, oldLastUpdateErrorSubCode, lastUpdateErrorSubCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_SERVICE__BGP_VERSION:
				return getBGPVersion();
			case CimPackage.CIM_BGP_SERVICE__LAST_ERROR_CODE:
				return getLastErrorCode();
			case CimPackage.CIM_BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				return getLastMessageErrorSubCode();
			case CimPackage.CIM_BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				return getLastOpenErrorSubCode();
			case CimPackage.CIM_BGP_SERVICE__LAST_UPDATE_ERROR_SUB_CODE:
				return getLastUpdateErrorSubCode();
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
			case CimPackage.CIM_BGP_SERVICE__BGP_VERSION:
				setBGPVersion((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_ERROR_CODE:
				setLastErrorCode((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				setLastMessageErrorSubCode((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				setLastOpenErrorSubCode((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_UPDATE_ERROR_SUB_CODE:
				setLastUpdateErrorSubCode((Integer)newValue);
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
			case CimPackage.CIM_BGP_SERVICE__BGP_VERSION:
				setBGPVersion(BGP_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_ERROR_CODE:
				setLastErrorCode(LAST_ERROR_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				setLastMessageErrorSubCode(LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				setLastOpenErrorSubCode(LAST_OPEN_ERROR_SUB_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_SERVICE__LAST_UPDATE_ERROR_SUB_CODE:
				setLastUpdateErrorSubCode(LAST_UPDATE_ERROR_SUB_CODE_EDEFAULT);
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
			case CimPackage.CIM_BGP_SERVICE__BGP_VERSION:
				return BGP_VERSION_EDEFAULT == null ? bgpVersion != null : !BGP_VERSION_EDEFAULT.equals(bgpVersion);
			case CimPackage.CIM_BGP_SERVICE__LAST_ERROR_CODE:
				return LAST_ERROR_CODE_EDEFAULT == null ? lastErrorCode != null : !LAST_ERROR_CODE_EDEFAULT.equals(lastErrorCode);
			case CimPackage.CIM_BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				return LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT == null ? lastMessageErrorSubCode != null : !LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT.equals(lastMessageErrorSubCode);
			case CimPackage.CIM_BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				return LAST_OPEN_ERROR_SUB_CODE_EDEFAULT == null ? lastOpenErrorSubCode != null : !LAST_OPEN_ERROR_SUB_CODE_EDEFAULT.equals(lastOpenErrorSubCode);
			case CimPackage.CIM_BGP_SERVICE__LAST_UPDATE_ERROR_SUB_CODE:
				return LAST_UPDATE_ERROR_SUB_CODE_EDEFAULT == null ? lastUpdateErrorSubCode != null : !LAST_UPDATE_ERROR_SUB_CODE_EDEFAULT.equals(lastUpdateErrorSubCode);
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
		result.append(" (BGPVersion: ");
		result.append(bgpVersion);
		result.append(", LastErrorCode: ");
		result.append(lastErrorCode);
		result.append(", LastMessageErrorSubCode: ");
		result.append(lastMessageErrorSubCode);
		result.append(", LastOpenErrorSubCode: ");
		result.append(lastOpenErrorSubCode);
		result.append(", LastUpdateErrorSubCode: ");
		result.append(lastUpdateErrorSubCode);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPServiceImpl
