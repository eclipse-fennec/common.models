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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_NamedAddressCollection;
import org.dmtf.cim.CIM_SystemSpecificCollection;
import org.dmtf.cim.CIM_Zone;
import org.dmtf.cim.CIM_ZoneMembershipSettingData;
import org.dmtf.cim.CIM_ZoneService;
import org.dmtf.cim.CIM_ZoneSet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Zone Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneServiceImpl#getSessionState <em>Session State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneServiceImpl#getRequestedSessionState <em>Requested Session State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneServiceImpl#getDefaultZoningState <em>Default Zoning State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ZoneServiceImpl#getConfigurationID <em>Configuration ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ZoneServiceImpl extends CIM_ServiceImpl implements CIM_ZoneService {
	/**
	 * The default value of the '{@link #getSessionState() <em>Session State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SESSION_STATE_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getSessionState() <em>Session State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionState()
	 * @generated
	 * @ordered
	 */
	protected Integer sessionState = SESSION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedSessionState() <em>Requested Session State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSessionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTED_SESSION_STATE_EDEFAULT = Integer.valueOf(5);

	/**
	 * The cached value of the '{@link #getRequestedSessionState() <em>Requested Session State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSessionState()
	 * @generated
	 * @ordered
	 */
	protected Integer requestedSessionState = REQUESTED_SESSION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultZoningState() <em>Default Zoning State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoningState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_ZONING_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultZoningState() <em>Default Zoning State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoningState()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultZoningState = DEFAULT_ZONING_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationID() <em>Configuration ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationID() <em>Configuration ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationID()
	 * @generated
	 * @ordered
	 */
	protected String configurationID = CONFIGURATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ZoneServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ZoneService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSessionState() {
		return sessionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionState(Integer newSessionState) {
		Integer oldSessionState = sessionState;
		sessionState = newSessionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_SERVICE__SESSION_STATE, oldSessionState, sessionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestedSessionState() {
		return requestedSessionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedSessionState(Integer newRequestedSessionState) {
		Integer oldRequestedSessionState = requestedSessionState;
		requestedSessionState = newRequestedSessionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_SERVICE__REQUESTED_SESSION_STATE, oldRequestedSessionState, requestedSessionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultZoningState() {
		return defaultZoningState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultZoningState(Integer newDefaultZoningState) {
		Integer oldDefaultZoningState = defaultZoningState;
		defaultZoningState = newDefaultZoningState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_SERVICE__DEFAULT_ZONING_STATE, oldDefaultZoningState, defaultZoningState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationID() {
		return configurationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationID(String newConfigurationID) {
		String oldConfigurationID = configurationID;
		configurationID = newConfigurationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ZONE_SERVICE__CONFIGURATION_ID, oldConfigurationID, configurationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateZoneSet(String ZoneSetName, CIM_ZoneSet ZoneSet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateZone(String ZoneName, Integer ZoneType, Integer ZoneSubType, CIM_Zone Zone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateZoneAlias(String CollectionAlias, CIM_NamedAddressCollection ZoneAlias) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateZoneMembershipSettingData(Integer ConnectivityMemberType, String ConnectivityMemberID, CIM_SystemSpecificCollection SystemSpecificCollection, CIM_ZoneMembershipSettingData ZoneMembershipSettingData) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddZone(CIM_ZoneSet ZoneSet, CIM_Zone Zone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddZoneMembershipSettingData(CIM_SystemSpecificCollection SystemSpecificCollection, CIM_ZoneMembershipSettingData ZoneMembershipSettingData) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddZoneAlias(CIM_Zone Zone, CIM_NamedAddressCollection ZoneAlias) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ActivateZoneSet(CIM_ZoneSet ZoneSet, Boolean Activate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SessionControl(Integer RequestedSessionState) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ActivateZoneSetWithJob(CIM_ZoneSet ZoneSet, Boolean Activate, String ConfigurationID, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SessionControlWithJob(Integer RequestedSessionState, String ConfigurationID, CIM_ConcreteJob Job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ZONE_SERVICE__SESSION_STATE:
				return getSessionState();
			case CimPackage.CIM_ZONE_SERVICE__REQUESTED_SESSION_STATE:
				return getRequestedSessionState();
			case CimPackage.CIM_ZONE_SERVICE__DEFAULT_ZONING_STATE:
				return getDefaultZoningState();
			case CimPackage.CIM_ZONE_SERVICE__CONFIGURATION_ID:
				return getConfigurationID();
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
			case CimPackage.CIM_ZONE_SERVICE__SESSION_STATE:
				setSessionState((Integer)newValue);
				return;
			case CimPackage.CIM_ZONE_SERVICE__REQUESTED_SESSION_STATE:
				setRequestedSessionState((Integer)newValue);
				return;
			case CimPackage.CIM_ZONE_SERVICE__DEFAULT_ZONING_STATE:
				setDefaultZoningState((Integer)newValue);
				return;
			case CimPackage.CIM_ZONE_SERVICE__CONFIGURATION_ID:
				setConfigurationID((String)newValue);
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
			case CimPackage.CIM_ZONE_SERVICE__SESSION_STATE:
				setSessionState(SESSION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_SERVICE__REQUESTED_SESSION_STATE:
				setRequestedSessionState(REQUESTED_SESSION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_SERVICE__DEFAULT_ZONING_STATE:
				setDefaultZoningState(DEFAULT_ZONING_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ZONE_SERVICE__CONFIGURATION_ID:
				setConfigurationID(CONFIGURATION_ID_EDEFAULT);
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
			case CimPackage.CIM_ZONE_SERVICE__SESSION_STATE:
				return SESSION_STATE_EDEFAULT == null ? sessionState != null : !SESSION_STATE_EDEFAULT.equals(sessionState);
			case CimPackage.CIM_ZONE_SERVICE__REQUESTED_SESSION_STATE:
				return REQUESTED_SESSION_STATE_EDEFAULT == null ? requestedSessionState != null : !REQUESTED_SESSION_STATE_EDEFAULT.equals(requestedSessionState);
			case CimPackage.CIM_ZONE_SERVICE__DEFAULT_ZONING_STATE:
				return DEFAULT_ZONING_STATE_EDEFAULT == null ? defaultZoningState != null : !DEFAULT_ZONING_STATE_EDEFAULT.equals(defaultZoningState);
			case CimPackage.CIM_ZONE_SERVICE__CONFIGURATION_ID:
				return CONFIGURATION_ID_EDEFAULT == null ? configurationID != null : !CONFIGURATION_ID_EDEFAULT.equals(configurationID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_ZONE_SERVICE___CREATE_ZONE_SET__STRING_CIM_ZONESET:
				return CreateZoneSet((String)arguments.get(0), (CIM_ZoneSet)arguments.get(1));
			case CimPackage.CIM_ZONE_SERVICE___CREATE_ZONE__STRING_INTEGER_INTEGER_CIM_ZONE:
				return CreateZone((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (CIM_Zone)arguments.get(3));
			case CimPackage.CIM_ZONE_SERVICE___CREATE_ZONE_ALIAS__STRING_CIM_NAMEDADDRESSCOLLECTION:
				return CreateZoneAlias((String)arguments.get(0), (CIM_NamedAddressCollection)arguments.get(1));
			case CimPackage.CIM_ZONE_SERVICE___CREATE_ZONE_MEMBERSHIP_SETTING_DATA__INTEGER_STRING_CIM_SYSTEMSPECIFICCOLLECTION_CIM_ZONEMEMBERSHIPSETTINGDATA:
				return CreateZoneMembershipSettingData((Integer)arguments.get(0), (String)arguments.get(1), (CIM_SystemSpecificCollection)arguments.get(2), (CIM_ZoneMembershipSettingData)arguments.get(3));
			case CimPackage.CIM_ZONE_SERVICE___ADD_ZONE__CIM_ZONESET_CIM_ZONE:
				return AddZone((CIM_ZoneSet)arguments.get(0), (CIM_Zone)arguments.get(1));
			case CimPackage.CIM_ZONE_SERVICE___ADD_ZONE_MEMBERSHIP_SETTING_DATA__CIM_SYSTEMSPECIFICCOLLECTION_CIM_ZONEMEMBERSHIPSETTINGDATA:
				return AddZoneMembershipSettingData((CIM_SystemSpecificCollection)arguments.get(0), (CIM_ZoneMembershipSettingData)arguments.get(1));
			case CimPackage.CIM_ZONE_SERVICE___ADD_ZONE_ALIAS__CIM_ZONE_CIM_NAMEDADDRESSCOLLECTION:
				return AddZoneAlias((CIM_Zone)arguments.get(0), (CIM_NamedAddressCollection)arguments.get(1));
			case CimPackage.CIM_ZONE_SERVICE___ACTIVATE_ZONE_SET__CIM_ZONESET_BOOLEAN:
				return ActivateZoneSet((CIM_ZoneSet)arguments.get(0), (Boolean)arguments.get(1));
			case CimPackage.CIM_ZONE_SERVICE___SESSION_CONTROL__INTEGER:
				return SessionControl((Integer)arguments.get(0));
			case CimPackage.CIM_ZONE_SERVICE___ACTIVATE_ZONE_SET_WITH_JOB__CIM_ZONESET_BOOLEAN_STRING_CIM_CONCRETEJOB:
				return ActivateZoneSetWithJob((CIM_ZoneSet)arguments.get(0), (Boolean)arguments.get(1), (String)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_ZONE_SERVICE___SESSION_CONTROL_WITH_JOB__INTEGER_STRING_CIM_CONCRETEJOB:
				return SessionControlWithJob((Integer)arguments.get(0), (String)arguments.get(1), (CIM_ConcreteJob)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (SessionState: ");
		result.append(sessionState);
		result.append(", RequestedSessionState: ");
		result.append(requestedSessionState);
		result.append(", DefaultZoningState: ");
		result.append(defaultZoningState);
		result.append(", ConfigurationID: ");
		result.append(configurationID);
		result.append(')');
		return result.toString();
	}

} //CIM_ZoneServiceImpl
