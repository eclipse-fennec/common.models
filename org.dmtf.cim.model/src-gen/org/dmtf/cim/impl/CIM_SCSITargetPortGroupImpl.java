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

import org.dmtf.cim.CIM_SCSITargetPortGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Target Port Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getAsymmetric <em>Asymmetric</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getCurrentLoadBalanceType <em>Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getOtherCurrentLoadBalanceType <em>Other Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getPollingRateMax <em>Polling Rate Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getCurrentPollingRate <em>Current Polling Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getAccessState <em>Access State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getExplicitFailover <em>Explicit Failover</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSITargetPortGroupImpl#getSupportsLuAssignment <em>Supports Lu Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSITargetPortGroupImpl extends CIM_SystemSpecificCollectionImpl implements CIM_SCSITargetPortGroup {
	/**
	 * The default value of the '{@link #getAsymmetric() <em>Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASYMMETRIC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAsymmetric() <em>Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetric()
	 * @generated
	 * @ordered
	 */
	protected Boolean asymmetric = ASYMMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLoadBalanceType() <em>Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_LOAD_BALANCE_TYPE_EDEFAULT = Integer.valueOf(7);

	/**
	 * The cached value of the '{@link #getCurrentLoadBalanceType() <em>Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected Integer currentLoadBalanceType = CURRENT_LOAD_BALANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCurrentLoadBalanceType() <em>Other Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCurrentLoadBalanceType() <em>Other Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCurrentLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected String otherCurrentLoadBalanceType = OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoFailbackEnabled() <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTO_FAILBACK_ENABLED_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getAutoFailbackEnabled() <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected Integer autoFailbackEnabled = AUTO_FAILBACK_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingRateMax() <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingRateMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long POLLING_RATE_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollingRateMax() <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingRateMax()
	 * @generated
	 * @ordered
	 */
	protected Long pollingRateMax = POLLING_RATE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPollingRate() <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPollingRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_POLLING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPollingRate() <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPollingRate()
	 * @generated
	 * @ordered
	 */
	protected Long currentPollingRate = CURRENT_POLLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessState() <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessState() <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessState()
	 * @generated
	 * @ordered
	 */
	protected Integer accessState = ACCESS_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplicitFailover() <em>Explicit Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitFailover()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPLICIT_FAILOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplicitFailover() <em>Explicit Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitFailover()
	 * @generated
	 * @ordered
	 */
	protected Boolean explicitFailover = EXPLICIT_FAILOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Integer identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferred() <em>Preferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PREFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferred() <em>Preferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected Boolean preferred = PREFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportsLuAssignment() <em>Supports Lu Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsLuAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_LU_ASSIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsLuAssignment() <em>Supports Lu Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsLuAssignment()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsLuAssignment = SUPPORTS_LU_ASSIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSITargetPortGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSITargetPortGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAsymmetric() {
		return asymmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsymmetric(Boolean newAsymmetric) {
		Boolean oldAsymmetric = asymmetric;
		asymmetric = newAsymmetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ASYMMETRIC, oldAsymmetric, asymmetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentLoadBalanceType() {
		return currentLoadBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLoadBalanceType(Integer newCurrentLoadBalanceType) {
		Integer oldCurrentLoadBalanceType = currentLoadBalanceType;
		currentLoadBalanceType = newCurrentLoadBalanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_LOAD_BALANCE_TYPE, oldCurrentLoadBalanceType, currentLoadBalanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCurrentLoadBalanceType() {
		return otherCurrentLoadBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCurrentLoadBalanceType(String newOtherCurrentLoadBalanceType) {
		String oldOtherCurrentLoadBalanceType = otherCurrentLoadBalanceType;
		otherCurrentLoadBalanceType = newOtherCurrentLoadBalanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__OTHER_CURRENT_LOAD_BALANCE_TYPE, oldOtherCurrentLoadBalanceType, otherCurrentLoadBalanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutoFailbackEnabled() {
		return autoFailbackEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoFailbackEnabled(Integer newAutoFailbackEnabled) {
		Integer oldAutoFailbackEnabled = autoFailbackEnabled;
		autoFailbackEnabled = newAutoFailbackEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__AUTO_FAILBACK_ENABLED, oldAutoFailbackEnabled, autoFailbackEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPollingRateMax() {
		return pollingRateMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollingRateMax(Long newPollingRateMax) {
		Long oldPollingRateMax = pollingRateMax;
		pollingRateMax = newPollingRateMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__POLLING_RATE_MAX, oldPollingRateMax, pollingRateMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentPollingRate() {
		return currentPollingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPollingRate(Long newCurrentPollingRate) {
		Long oldCurrentPollingRate = currentPollingRate;
		currentPollingRate = newCurrentPollingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_POLLING_RATE, oldCurrentPollingRate, currentPollingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessState() {
		return accessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessState(Integer newAccessState) {
		Integer oldAccessState = accessState;
		accessState = newAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ACCESS_STATE, oldAccessState, accessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExplicitFailover() {
		return explicitFailover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplicitFailover(Boolean newExplicitFailover) {
		Boolean oldExplicitFailover = explicitFailover;
		explicitFailover = newExplicitFailover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__EXPLICIT_FAILOVER, oldExplicitFailover, explicitFailover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(Integer newIdentifier) {
		Integer oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferred(Boolean newPreferred) {
		Boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__PREFERRED, oldPreferred, preferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsLuAssignment() {
		return supportsLuAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsLuAssignment(Boolean newSupportsLuAssignment) {
		Boolean oldSupportsLuAssignment = supportsLuAssignment;
		supportsLuAssignment = newSupportsLuAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_TARGET_PORT_GROUP__SUPPORTS_LU_ASSIGNMENT, oldSupportsLuAssignment, supportsLuAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ASYMMETRIC:
				return getAsymmetric();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_LOAD_BALANCE_TYPE:
				return getCurrentLoadBalanceType();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				return getOtherCurrentLoadBalanceType();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__AUTO_FAILBACK_ENABLED:
				return getAutoFailbackEnabled();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__POLLING_RATE_MAX:
				return getPollingRateMax();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_POLLING_RATE:
				return getCurrentPollingRate();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ACCESS_STATE:
				return getAccessState();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__EXPLICIT_FAILOVER:
				return getExplicitFailover();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__IDENTIFIER:
				return getIdentifier();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__PREFERRED:
				return getPreferred();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__SUPPORTS_LU_ASSIGNMENT:
				return getSupportsLuAssignment();
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
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ASYMMETRIC:
				setAsymmetric((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_LOAD_BALANCE_TYPE:
				setCurrentLoadBalanceType((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				setOtherCurrentLoadBalanceType((String)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__AUTO_FAILBACK_ENABLED:
				setAutoFailbackEnabled((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__POLLING_RATE_MAX:
				setPollingRateMax((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_POLLING_RATE:
				setCurrentPollingRate((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ACCESS_STATE:
				setAccessState((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__EXPLICIT_FAILOVER:
				setExplicitFailover((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__IDENTIFIER:
				setIdentifier((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__PREFERRED:
				setPreferred((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__SUPPORTS_LU_ASSIGNMENT:
				setSupportsLuAssignment((Boolean)newValue);
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
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ASYMMETRIC:
				setAsymmetric(ASYMMETRIC_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_LOAD_BALANCE_TYPE:
				setCurrentLoadBalanceType(CURRENT_LOAD_BALANCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				setOtherCurrentLoadBalanceType(OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__AUTO_FAILBACK_ENABLED:
				setAutoFailbackEnabled(AUTO_FAILBACK_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__POLLING_RATE_MAX:
				setPollingRateMax(POLLING_RATE_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_POLLING_RATE:
				setCurrentPollingRate(CURRENT_POLLING_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ACCESS_STATE:
				setAccessState(ACCESS_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__EXPLICIT_FAILOVER:
				setExplicitFailover(EXPLICIT_FAILOVER_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__PREFERRED:
				setPreferred(PREFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__SUPPORTS_LU_ASSIGNMENT:
				setSupportsLuAssignment(SUPPORTS_LU_ASSIGNMENT_EDEFAULT);
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
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ASYMMETRIC:
				return ASYMMETRIC_EDEFAULT == null ? asymmetric != null : !ASYMMETRIC_EDEFAULT.equals(asymmetric);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_LOAD_BALANCE_TYPE:
				return CURRENT_LOAD_BALANCE_TYPE_EDEFAULT == null ? currentLoadBalanceType != null : !CURRENT_LOAD_BALANCE_TYPE_EDEFAULT.equals(currentLoadBalanceType);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__OTHER_CURRENT_LOAD_BALANCE_TYPE:
				return OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT == null ? otherCurrentLoadBalanceType != null : !OTHER_CURRENT_LOAD_BALANCE_TYPE_EDEFAULT.equals(otherCurrentLoadBalanceType);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__AUTO_FAILBACK_ENABLED:
				return AUTO_FAILBACK_ENABLED_EDEFAULT == null ? autoFailbackEnabled != null : !AUTO_FAILBACK_ENABLED_EDEFAULT.equals(autoFailbackEnabled);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__POLLING_RATE_MAX:
				return POLLING_RATE_MAX_EDEFAULT == null ? pollingRateMax != null : !POLLING_RATE_MAX_EDEFAULT.equals(pollingRateMax);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__CURRENT_POLLING_RATE:
				return CURRENT_POLLING_RATE_EDEFAULT == null ? currentPollingRate != null : !CURRENT_POLLING_RATE_EDEFAULT.equals(currentPollingRate);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__ACCESS_STATE:
				return ACCESS_STATE_EDEFAULT == null ? accessState != null : !ACCESS_STATE_EDEFAULT.equals(accessState);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__EXPLICIT_FAILOVER:
				return EXPLICIT_FAILOVER_EDEFAULT == null ? explicitFailover != null : !EXPLICIT_FAILOVER_EDEFAULT.equals(explicitFailover);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__PREFERRED:
				return PREFERRED_EDEFAULT == null ? preferred != null : !PREFERRED_EDEFAULT.equals(preferred);
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP__SUPPORTS_LU_ASSIGNMENT:
				return SUPPORTS_LU_ASSIGNMENT_EDEFAULT == null ? supportsLuAssignment != null : !SUPPORTS_LU_ASSIGNMENT_EDEFAULT.equals(supportsLuAssignment);
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
		result.append(" (Asymmetric: ");
		result.append(asymmetric);
		result.append(", CurrentLoadBalanceType: ");
		result.append(currentLoadBalanceType);
		result.append(", OtherCurrentLoadBalanceType: ");
		result.append(otherCurrentLoadBalanceType);
		result.append(", AutoFailbackEnabled: ");
		result.append(autoFailbackEnabled);
		result.append(", PollingRateMax: ");
		result.append(pollingRateMax);
		result.append(", CurrentPollingRate: ");
		result.append(currentPollingRate);
		result.append(", AccessState: ");
		result.append(accessState);
		result.append(", ExplicitFailover: ");
		result.append(explicitFailover);
		result.append(", Identifier: ");
		result.append(identifier);
		result.append(", Preferred: ");
		result.append(preferred);
		result.append(", SupportsLuAssignment: ");
		result.append(supportsLuAssignment);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSITargetPortGroupImpl
